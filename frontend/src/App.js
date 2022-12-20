import './App.css';
import React, { Component } from 'react';
import Box from '@mui/material/Box';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Athletes from './pages/Athletes';
import Lineups from './pages/Lineups';
import Page404 from './pages/Page404';
import Nav from './components/Nav/Nav';

class App extends Component {
  render() {
    return (
      <div className="App">
        <BrowserRouter>
          <Box sx={{display: 'flex', width: '100%', paddingTop: '50px'}}>
            <Nav />
            <Routes>
              <Route path="/" element={<Athletes />} />
              <Route path="/lineups" element={<Lineups />} />
              <Route path="*" element={<Page404 />} />
              <Route component={Page404} />
            </Routes>
          </Box>
        </BrowserRouter>
      </div>
    )
  }
}

export default App;
