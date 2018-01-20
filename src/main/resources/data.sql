
INSERT INTO DEVELOPERS (ID, NAME)
  VALUES
  (1, 'Valve'),
  (2, 'PUBG Corporation'),
	(3, 'Facepunch Studios'),
	(4, 'Tarsier Studios');

INSERT INTO PUBLISHERS (ID, NAME)
  VALUES
  (1, 'Valve'),
  (2, 'PUBG Corporation'),
	(3, 'Facepunch Studios'),
	(4, 'BANDAI NAMCO Entertainment');

INSERT INTO GAMES (ID, NAME, REALIZE_DATE, DEVELOPER_ID, PUBLISHER_ID)
  VALUES
  (1, 'Counter-Strike: Global Offensive', '2012-08-21', 1, 1),
	(2, 'Dota 2', '2013-07-09', 1, 1),
	(3, ' PLAYERUNKNOWNS BATTLEGROUNDS', '2017-12-21', 2, 2),
	(4, 'Rust', '2013-12-11', 3, 3),
	(5, 'Little Nightmares', '2017-04-28', 4, 4);

