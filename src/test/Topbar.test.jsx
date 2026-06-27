import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import Topbar from '../components/Topbar';

function mockFetch() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test User' }) });
    }
    if (url === '/api/users') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve([{ id: 1, email: 'test@test.com', fullName: 'Test User' }]) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });
}

function renderTopbar({ title = 'Dashboard' } = {}) {
  mockFetch();
  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/home'] },
      React.createElement(AuthProvider, null,
        React.createElement(Topbar, { title })
      )
    )
  );
}

describe('Topbar', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('renders the title', async () => {
    renderTopbar({ title: 'My Dashboard' });
    await waitFor(() => {
      expect(screen.getByText('My Dashboard')).toBeInTheDocument();
    });
  });
});
