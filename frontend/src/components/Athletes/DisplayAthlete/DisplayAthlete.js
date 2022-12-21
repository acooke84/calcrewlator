import React from 'react';
import './DisplayAthlete.css';
import Box from '@mui/material/Box';
import IconButton from '@mui/material/IconButton';
import DeleteIcon from '@mui/icons-material/Delete';
import MoreHorizIcon from '@mui/icons-material/MoreHoriz';

const DisplayAthlete = ({athlete}) => {
  return (
		<Box className='athlete-wrapper'>
			{athlete.athleteName} ({athlete.graduationYear})
			<Box className='btn-wrapper'>
				<IconButton aria-label="more" size="small">
					<MoreHorizIcon fontSize="inherit"/>
				</IconButton>
				<IconButton aria-label="delete" size="small">
					<DeleteIcon fontSize="inherit"/>
				</IconButton>
			</Box>
		</Box>
	);
}

export default DisplayAthlete;