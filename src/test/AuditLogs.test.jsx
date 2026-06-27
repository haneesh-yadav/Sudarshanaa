import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import AuditLogsPage from '../pages/AuditLogs';

const mockLogs = [
  { id: 1, timestamp: 1700000000000, userEmail: 'alice@test.com', action: 'DOMAIN_BLACKLIST', details: 'Blacklisted evil.com' },
  { id: 2, timestamp: 1700001000000, userEmail: 'bob@test.com', action: 'EMAIL_SYNC', details: 'Synced 12 emails' },
];

function mockFetch(logs) {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    if (url === '/api/audit-logs') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve(logs) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });
}

function renderAuditLogs(logs = mockLogs) {
  mockFetch(logs);
  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/audit-logs'] },
      React.createElement(AuthProvider, null,
        React.createElement(AuditLogsPage)
      )
    )
  );
}

describe('AuditLogsPage', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('fetches and renders audit logs', async () => {
    renderAuditLogs();
    await waitFor(() => {
      expect(screen.queryByText('Loading database audit trail...')).not.toBeInTheDocument();
    });
    expect(screen.getByText('Blacklisted evil.com')).toBeInTheDocument();
  });

  it('shows system when userEmail is missing', async () => {
    renderAuditLogs([{ id: 99, timestamp: 1700000000000, userEmail: null, action: 'EMAIL_SYNC', details: 'System sync' }]);
    await waitFor(() => {
      expect(screen.getByText('System')).toBeInTheDocument();
    });
  });
});
