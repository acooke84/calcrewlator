import React, { useEffect, useState } from 'react';
import './LineupCreator.css';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import MenuItem from '@mui/material/MenuItem';
import BoatForm from '../BoatForm/BoatForm';

const LineupCreator = () => {
  const [boat, setBoat] = useState('');
  const boatTypes = ['8+', '4+', '4-', '4x', '2-', '2x', '1x'];

  return (
    <Box sx={{ minWidth: 130}}>
      <FormControl sx={{width: '120px', marginBottom: '10px'}}>
        <InputLabel id="boat-type-label">Boat Type</InputLabel>
        <Select
          labelId="demo-type-label"
          value={boat}
          onChange={e => setBoat(e.target.value)}
          label="Boat Type"
        >
          {boatTypes.map(boatType => <MenuItem value={boatType} key={boatType}>{boatType}</MenuItem>)}
        </Select>
      </FormControl>
      <BoatForm boat={boat}/>
    </Box>
  );
}

export default LineupCreator;