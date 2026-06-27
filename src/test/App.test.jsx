import { describe, it, expect, vi, beforeEach } from 'vitest';
import React from 'react';
import { render, screen } from '@testing-library/react';
import App from '../App';

describe('App', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    localStorage.clear();
    global.fetch = vi.fn(() =>
      Promise.resolve({ ok: false, json: () => Promise.resolve({}) })
    );
  });

  it('renders without crashing', () => {
    const { container } = render(React.createElement(App));
    expect(container).toBeInTheDocument();
  });

  it('renders the landing page at /', () => {
    render(React.createElement(App));
    const elements = screen.getAllByText('Sudarshana');
    expect(elements.length).toBeGreaterThanOrEqual(1);
  });
});
