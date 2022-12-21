import * as React from 'react';
import './AthleteCreator.css';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import FormControl from '@mui/material/FormControl';
import FormControlLabel from '@mui/material/FormControlLabel';
import FormLabel from '@mui/material/FormLabel';
import RadioGroup from '@mui/material/RadioGroup';
import Radio from '@mui/material/Radio';
import Switch from '@mui/material/Switch';
import TextField from '@mui/material/TextField';
import { createAthlete } from '../../../shared/api/athletes';

const AthleteCreator = () => {
  const [name, setName] = React.useState('');
  const [type, setType] = React.useState('ROWER');
  const [side, setSide] = React.useState('STARBOARD');
  const [both, setBoth] = React.useState(false);
  const [grad, setGrad] = React.useState('');
  const [submitted, setSubmitted] = React.useState(false);

  const handleName = (event) => {
    setName(event.target.value);
  };
  const handleType = (event) => {
    setType(event.target.value);
  };
  const handleSide = (event) => {
    setSide(event.target.value);
  };
  const handleBoth = (event) => {
    setBoth(event.target.checked);
  };
  const handleGrad = (event) => {
    setGrad(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    setSubmitted(true);
    //check for invalid inputs
    if (name === '' || grad === '' || isNaN(grad) || grad < 1900 || grad >= 2100) {
      return;
    }
    let athlete;
    if (type === 'ROWER') {
      athlete = {
        athleteName: name,
        graduationYear: grad,
        isRower: type === 'ROWER',
        primarySide: side,
        canRowBothSides: both,
      }
    } else {
      athlete = {
        athleteName: name,
        graduationYear: grad,
        isRower: type === 'ROWER',
      }
    }
    createAthlete(athlete);
    window.location.reload(false);
  }

  return (
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1 },
      }}
      noValidate
      autoComplete="off"
      className='athlete-creator'
      onSubmit={handleSubmit}
    >
      <TextField
        error={submitted && (name === '')}
        helperText={submitted && (name === '') ? 'Invalid name' : ''}
        id="Name"
        label="Name"
        value={name}
        onChange={handleName}
        sx={{width: '10em'}}
        />
      <TextField
        error={submitted && (grad === '' || isNaN(grad) || grad < 1900 || grad >= 2100)}
        helperText={submitted && (grad === '' || isNaN(grad) || grad < 1900 || grad >= 2100) ? 'Invalid graduation year' : ''}
        id="grad"
        label="Graduation Year"
        value={grad}
        onChange={handleGrad}
        sx={{width: '8em'}}
        />
      <Box className='radio-container'>
        <FormControl sx={{paddingRight: '5vw'}}>
          <FormLabel id="type-buttons-group">Athlete Type</FormLabel>
          <RadioGroup
            aria-labelledby="type-buttons-group"
            name="type=buttons-group"
            value={type}
            onChange={handleType}
          >
            <FormControlLabel value="ROWER" control={<Radio />} label="ROWER" />
            <FormControlLabel value="COXSWAIN" control={<Radio />} label="COXSWAIN" />
          </RadioGroup>
        </FormControl>
        <FormControl>
          <FormLabel id="side-buttons-group">Primary side</FormLabel>
          <RadioGroup
            aria-labelledby="side-buttons-group"
            name="side-buttons-group"
            value={side}
            onChange={handleSide}
          >
            <FormControlLabel value="STARBOARD" control={<Radio disabled={type === 'COXSWAIN'}/>} label="STARBOARD" />
            <FormControlLabel value="PORT" control={<Radio disabled={type === 'COXSWAIN'}/>} label="PORT" />
          </RadioGroup>
        </FormControl>
      </Box>
      <FormControl>
        <FormControlLabel control={<Switch checked={both} onChange={handleBoth} disabled={type === 'COXSWAIN'}/>} label="Can row both sides?" />
      </FormControl>
      <Button type="submit" variant="contained">ADD ATHLETE</Button>
    </Box>
  );
};

export default AthleteCreator;
