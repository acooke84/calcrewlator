import {React, useState, useEffect} from 'react';
import './BoatForm.css';
import Box from '@mui/material/Box';
import AthleteSelector from '../../Athletes/AthleteSelector/AthleteSelector';

const BoatForm = ({boat}) => {
  const [selectedSeat, setSelectedSeat] = useState('');

  useEffect(() => {
    setSelectedSeat('');
  },[boat])

  return (
    boat !== '' ? <Box id='boat-form-container'>
    <Box id='athlete-list-container'>
      {(boat.charAt(1) === '+') && <button className={'athlete-button' + (selectedSeat === 'cox' ? ' selected-btn' : '')} onClick={(_) => setSelectedSeat('cox')}>cox</button>}
      {boat === '1x' ? <button className={'athlete-button' + (selectedSeat === 'rower' ? ' selected-btn' : '')} onClick={(_) => setSelectedSeat('rower')}>rower</button> : 
      Array(parseInt(boat.charAt(0))).fill().map((_, i) => {
        const seat = i === 0 ? 'stroke' : (i === boat.charAt(0) - 1 ? 'bow' : boat.charAt(0) - i);
        return <button className={'athlete-button' + (selectedSeat === seat ? ' selected-btn' : '')} onClick={(_) => setSelectedSeat(seat)} key={seat}>{seat}</button>
      })}
    </Box>
    <Box id='athlete-select-container'>
      <AthleteSelector seat={selectedSeat}/>
    </Box>
  </Box> : <></>
  );
}

export default BoatForm;