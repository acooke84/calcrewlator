import React from 'react';
import './AthleteSelector.css';

const AthleteSelector = ({seat}) => {
    return (
        <div className='athlete-selector'>
            {seat === '' ? '' : 'TODO: pick a ' + seat + (seat === 'rower' || seat === 'cox' ? '' : ' seat')}
        </div>
    );
}

export default AthleteSelector;