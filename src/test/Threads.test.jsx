import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import ThreadsPage from '../pages/Threads';

function renderThreads() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });

  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/threads'] },
      React.createElement(AuthProvider, null,
        React.createElement(ThreadsPage)
      )
    )
  );
}

describe('ThreadsPage', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('fetches threads on mount', async () => {
    renderThreads();
    await waitFor(() => {
      expect(global.fetch).toHaveBeenCalled();
    });
  });

  it('renders filter tabs', async () => {
    renderThreads();
    await waitFor(() => {
      expect(screen.getByText('All')).toBeInTheDocument();
    });
  });
});
