DROP TABLE IF EXISTS lineups;
CREATE TABLE lineups (
    lineup_id serial PRIMARY KEY,
    lineup_name varchar(100) UNIQUE NULLS NOT DISTINCT,
    boat_id integer REFERENCES boats(boat_id),
);