use planet_db;

CREATE TABLE exoplanets (
	planetname varchar(50),
	starname varchar(50),
	publicationstatus varchar(100),
	yeardiscovered varchar(20),
	mass varchar(50),
	masserrormin varchar(50),
	masserrormax varchar(50),
	radius varchar(50),
	radiuserrormin varchar(50),
	radiuserrormax varchar(50),
	period varchar(50),
	perioderrormin varchar(50),
	perioderrormax varchar(50),
	#altTargetName varchar(20),
	tempcalculated varchar(20),
	tempmeasured varchar(20),
	stardistance varchar(20),
	stardistanceerrormin varchar(50),
	stardistanceerrormax varchar(50),
	inclination varchar(20),
	inclinationerrormin varchar(50)
	#inclinationErrorMax varchar(50),
	#magneticField varchar(20)
);

SELECT * FROM exoplanets LIMIT 10000;
