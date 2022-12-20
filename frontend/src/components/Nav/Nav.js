import React from 'react';
import { Link } from 'react-router-dom';
import './Nav.css';

const Nav = () => {
  return (
    <nav>
      <div className="nav-container">
        <ul className="nav-item-wrapper">
          <li className="nav-item">
            <Link className="nav-link" to="/">Athletes</Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/lineups">Lineups</Link>
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Nav;