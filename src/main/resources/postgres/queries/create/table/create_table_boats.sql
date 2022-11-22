DROP TABLE IF EXISTS boats;
CREATE TABLE boats (
	boat_id serial PRIMARY KEY,
	boat_name varchar(50) UNIQUE NOT NULL,
	boat_type boat_type NOT NULL
);