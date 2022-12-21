import React, { useEffect, useState } from 'react';
import Box from '@mui/material/Box';
import LineupCreator from '../components/Lineups/LineupCreator/LineupCreator';

const Lineups = () => {
  return (
    <Box sx={{ display: 'flex', 
      flexDirection: 'column',
      alignItems: 'center',
      width: '100%'}}>
      <h2>Lineups</h2>
      <LineupCreator/>
    </Box>
  );
};

export default Lineups;