import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, waitFor } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import { AuthProvider } from '../auth/AuthContext';
import SecurityPosturePage from '../pages/SecurityPosture';

function renderSecurityPosture() {
  global.fetch = vi.fn((url) => {
    if (url === '/api/auth/me') {
      return Promise.resolve({ ok: true, json: () => Promise.resolve({ status: 'SUCCESS', userId: 1, email: 'test@test.com', fullName: 'Test' }) });
    }
    return Promise.resolve({ ok: true, json: () => Promise.resolve([]) });
  });

  return render(
    React.createElement(MemoryRouter, { initialEntries: ['/security-posture'] },
      React.createElement(AuthProvider, null,
        React.createElement(SecurityPosturePage)
      )
    )
  );
}

describe('SecurityPosturePage', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
  });

  it('fetches data on mount', async () => {
    renderSecurityPosture();
    await waitFor(() => {
      expect(global.fetch).toHaveBeenCalled();
    });
  });
});
