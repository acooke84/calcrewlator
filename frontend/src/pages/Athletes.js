import React, { useEffect, useState } from 'react';
import Box from '@mui/material/Box';
import AthleteCreator from '../components/AthleteCreator/AthleteCreator';
import { getAthletes } from '../shared/api/athletes';

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
      <Box sx={{marginBottom: '30px'}}>
        {athletes.map(athlete =>
          <div key={athlete.athleteId}>
            {athlete.athleteName} ({athlete.graduationYear}) 
          </div>
        )}
      </Box>
      <AthleteCreator/>
    </Box>
  );
};

export default Athletes;