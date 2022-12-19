import './App.css';
import React, { Component } from 'react';
import Box from '@mui/material/Box';
import AthleteCreator from './components/AthleteCreator/AthleteCreator';

class App extends Component {
  state = {
    athletes: []
  };

  async componentDidMount() {
    const response = await fetch('/athletes');
    const body = await response.json();
    this.setState({athletes:body});
    console.log(body);
  }

  render() {
    const {athletes} = this.state;
    return (
      <div className="App">
        <h2>Athletes</h2>
        <Box sx={{marginBottom: '30px'}}>
          {athletes.map(athlete =>
            <div key={athlete.athleteId}>
              {athlete.athleteName} ({athlete.graduationYear}) 
            </div>
          )}
        </Box>
        
        <AthleteCreator/>
      </div>
    )
  }
}

export default App;
