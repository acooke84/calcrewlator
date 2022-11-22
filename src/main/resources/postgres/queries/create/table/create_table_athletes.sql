DROP TABLE IF EXISTS athletes;
CREATE TABLE athletes (
	athlete_id serial PRIMARY KEY,
	athlete_name varchar(150) NOT NULL,
	graduation_year integer NOT NULL,
	is_rower boolean NOT NULL,
	primary_side side,
	swaps_sides boolean DEFAULT FALSE
);