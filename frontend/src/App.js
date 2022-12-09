import logo from './logo.svg';
import './App.css';
import React, { Component } from 'react';

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
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Athletes</h2>
          {athletes.map(athlete =>
            <div key={athlete.athleteId}>
              {athlete.athleteName} ({athlete.graduationYear}) 
            </div>
          )}
        </header>
      </div>
    )
  }
}

export default App;
