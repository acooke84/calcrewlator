DROP TABLE IF EXISTS lineup_seats;
CREATE TABLE lineup_seats (
	lineup_id integer REFERENCES boats(boat_id),
	athlete_id integer REFERENCES athletes(athlete_id),
	seat_number seat NOT NULL,
	PRIMARY KEY(lineup_id, athlete_id)
);