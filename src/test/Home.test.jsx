import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import Home from '../pages/Home';

const mockThreadReport = {
  threadId: 'TH-10250',
  chainValid: true,
  riskLevel: 'LOW',
  messages: [
    {
      sender: 'alice@company.com',
      subject: 'Project Update',
      spfAligned: true,
      dkimAligned: true,
      dmarcAligned: true,
      combinedRiskScore: 5,
      nlpRiskScore: 3,
      links: [],
      attachments: [],
    },
  ],
};

function renderHome() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    if (url.includes('/api/threads')) {
      return Promise.resolve({ ok: true, json: () => Promise.resolve([mockThreadReport]) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });

  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/home'] },
      React.createElement(AuthProvider, null,
        React.createElement(Home)
      )
    )
  );
}

describe('Home page', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('renders the page header with "Real-time overview"', async () => {
    renderHome();
    await waitFor(() => {
      expect(screen.getByText('Real-time overview')).toBeInTheDocument();
    });
  });

  it('fetches threads on mount', async () => {
    renderHome();
    await waitFor(() => {
      expect(screen.getByText('Real-time overview')).toBeInTheDocument();
    });
    expect(global.fetch).toHaveBeenCalled();
  });

  it('renders trust gauge SVG', async () => {
    renderHome();
    await waitFor(() => {
      const svgs = document.querySelectorAll('svg');
      expect(svgs.length).toBeGreaterThan(0);
    });
  });

  it('renders empty state when no threads', async () => {
    global.fetch = vi.fn((url) => {
      if (url === '/api/auth/me') {
        return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
      }
      if (url.includes('/api/threads')) {
        return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
      }
      return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
    });

    render(
      React.createElement(MemoryRouter, { initialEntries: ['/home'] },
        React.createElement(AuthProvider, null, React.createElement(Home))
      )
    );
    await waitFor(() => {
      expect(screen.getByText('Real-time overview')).toBeInTheDocument();
    });
  });
});
