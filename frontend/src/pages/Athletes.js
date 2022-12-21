import React, { useEffect, useState } from 'react';
import Box from '@mui/material/Box';
import AthleteCreator from '../components/Athletes/AthleteCreator/AthleteCreator';
import { getAthletes } from '../shared/api/athletes';
import DisplayAthlete from '../components/Athletes/DisplayAthlete/DisplayAthlete';

const Athletes = () => {
  const [athletes, setAthletes] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const athletes = await getAthletes();
      setAthletes(athletes);
    }
    fetchData();
  }, []);

  return (
    <Box sx={{ display: 'flex', 
      flexDirection: 'column',
      alignItems: 'center',
      width: '100%'}}>
      <h2>Athletes</h2>
      <Box sx={{display: 'flex', width: '100%', justifyContent: 'center'}}>
        <Box sx={{position: 'absolute', left: '10px'}}>
          {athletes.map(athlete =>
            <DisplayAthlete athlete={athlete} key={athlete.athleteId}/>)}
        </Box>
        <Box sx={{}}>
          <AthleteCreator/>
        </Box>
      </Box>
    </Box>
  );
};

export default Athletes;