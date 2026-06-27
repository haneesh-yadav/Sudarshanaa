import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import Sidebar from '../components/Sidebar';

function mockFetch() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });
}

function renderSidebar({ route = '/home' } = {}) {
  mockFetch();
  return render(
    React.createElement(MemoryRouter, { initialEntries: [route] },
      React.createElement(AuthProvider, null,
        React.createElement(Sidebar)
      )
    )
  );
}

describe('Sidebar', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('renders all navigation items', async () => {
    renderSidebar();
    await waitFor(() => {
      expect(screen.getByLabelText('Dashboard')).toBeInTheDocument();
    });
    expect(screen.getByLabelText('Threads')).toBeInTheDocument();
    expect(screen.getByLabelText('Security Posture')).toBeInTheDocument();
    expect(screen.getByLabelText('Reports')).toBeInTheDocument();
    expect(screen.getByLabelText('Audit Logs')).toBeInTheDocument();
  });

  it('renders logout and settings buttons', async () => {
    renderSidebar();
    await waitFor(() => {
      expect(screen.getByLabelText('Dashboard')).toBeInTheDocument();
    });
    expect(screen.getByLabelText('Logout')).toBeInTheDocument();
    expect(screen.getByLabelText('Settings')).toBeInTheDocument();
  });

  it('sidebar starts collapsed when no localStorage', async () => {
    renderSidebar();
    await waitFor(() => {
      expect(screen.getByLabelText('Dashboard')).toBeInTheDocument();
    });
    expect(screen.getByLabelText('Expand sidebar')).toBeInTheDocument();
  });

  it('can expand sidebar', async () => {
    const user = (await import('@testing-library/user-event')).default.setup();
    renderSidebar();
    await waitFor(() => {
      expect(screen.getByLabelText('Dashboard')).toBeInTheDocument();
    });

    await user.click(screen.getByLabelText('Expand sidebar'));
    expect(screen.getByLabelText('Collapse sidebar')).toHaveAttribute('aria-pressed', 'true');
  });

  it('highlights active nav item based on current route', async () => {
    renderSidebar({ route: '/threads' });
    await waitFor(() => {
      expect(screen.getByLabelText('Dashboard')).toBeInTheDocument();
    });
    expect(screen.getByLabelText('Threads')).toHaveClass('active');
  });
});
