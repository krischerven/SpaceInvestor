use planet_db;

CREATE TABLE users (
    id int(11) not null primary key auto_increment,
    username varchar(45),
    email varchar(45),
    password varchar(45),
    creditcard varchar(250),
    expiration varchar(45),
    cvv varchar(45),
    houses int,
);

SELECT * FROM users;

CREATE TABLE houses (
    id int(11) not null primary key auto_increment,
    price varchar(50),
    acres varchar(50),
    propertydetails varchar(50),
    housefeatures varchar(50),
    architecturalstyle varchar(50),
    mycondition varchar(50),
    yearbuilt varchar(50),
    houseimage varchar(50),
    planet varchar(50)
);

SELECT * FROM houses;

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
