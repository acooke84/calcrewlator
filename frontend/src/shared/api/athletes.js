const url = 'http://localhost:3000/athletes';

export function getAthletes() {
    return fetch(url)
        .then(response => response.json())
}

export function createAthlete(athlete) {
    return fetch(url, {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(athlete)
    }).then(response => response.json());
}