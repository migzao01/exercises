INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (1, 'Manuel', 44.44, 24);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (2, 'Nuno', 55.44, 23);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (3, 'Soraia', 44.44, 44);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (4, 'Manuela', 60.44, 26);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (5, 'Rodrigo', 60.44, 28);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (6, 'Ana', 20.44, 28);

INSERT INTO boats(boat_id, boat_name, color) VALUES (1, 'Santana', 'red');
INSERT INTO boats(boat_id, boat_name, color) VALUES (2, 'Titanic', 'white');
INSERT INTO boats(boat_id, boat_name, color) VALUES (3, 'Mermaid', 'blue');
INSERT INTO boats(boat_id, boat_name, color) VALUES (4, 'O Velejador', 'green');
INSERT INTO boats(boat_id, boat_name, color) VALUES (5, 'O Esquecido', 'grey');
INSERT INTO boats(boat_id, boat_name, color) VALUES (100, 'The One', 'yellow');

INSERT INTO reserves(sailor_id, boat_id, day) VALUES (1,1, '2012-01-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (1,2, '2013-02-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (1,3, '2014-03-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (2,4, '2015-04-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (3,1, '2011-05-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (5,100, '2010-06-01');
INSERT INTO reserves(sailor_id, boat_id, day) VALUES (6,100, '2012-06-01');