import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import SettingsPage from '../components/Settings';

function mockFetch() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });
}

function renderSettings({ open = true, onClose = vi.fn() } = {}) {
  mockFetch();
  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/home'] },
      React.createElement(AuthProvider, null,
        React.createElement(SettingsPage, { open, onClose })
      )
    )
  );
}

describe('SettingsPage', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('renders nothing when open is false', () => {
    const { container } = renderSettings({ open: false });
    expect(container.querySelector('.settings-overlay')).not.toBeInTheDocument();
  });
});
