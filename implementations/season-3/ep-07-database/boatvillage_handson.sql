DROP DATABASE IF EXISTS boat_booking;
CREATE DATABASE boat_booking;
USE boat_booking;
DROP TABLE IF EXISTS sailors;
DROP TABLE IF EXISTS boats;
DROP TABLE IF EXISTS reserves;

CREATE TABLE sailors(
    sailor_id INTEGER,
    sailor_name CHAR(15),
    rating NUMERIC(4,2),
    age INTEGER,
    PRIMARY KEY (sailor_id)
);

CREATE TABLE boats(
    boat_id INTEGER,
    boat_name CHAR(15),
    color CHAR(15),
    PRIMARY KEY (boat_id)
);

CREATE TABLE reserves(
    sailor_id INTEGER, boat_id INTEGER, day DATE,
    PRIMARY KEY (boat_id, day),
    FOREIGN KEY (sailor_id) REFERENCES sailors(sailor_id),
    FOREIGN KEY (boat_id) REFERENCES boats(boat_id)
);
