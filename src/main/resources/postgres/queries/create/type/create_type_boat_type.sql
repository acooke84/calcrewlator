DROP TYPE IF EXISTS boat_type;
CREATE TYPE boat_type AS ENUM (
	'1x', 
	'2x',
	'2-',
	'2+',
	'4x-',
	'4x+',
	'4-',
	'4+',
	'8+'
);