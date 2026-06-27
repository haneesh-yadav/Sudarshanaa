import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import ReportsPage from '../pages/Reports';

function renderReports() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });

  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/reports'] },
      React.createElement(AuthProvider, null,
        React.createElement(ReportsPage)
      )
    )
  );
}

describe('ReportsPage', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('fetches data on mount', async () => {
    renderReports();
    await waitFor(() => {
      expect(global.fetch).toHaveBeenCalled();
    });
  });
});
