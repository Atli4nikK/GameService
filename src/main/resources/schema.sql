CREATE  TABLE DEVELOPERS(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(100) NOT NULL
);


CREATE TABLE PUBLISHERS(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(100)
);


CREATE TABLE GAMES(
ID BIGINT IDENTITY  NOT NULL PRIMARY KEY,
NAME VARCHAR(100),
REALIZE_DATE DATE,
DEVELOPER_ID BIGINT NOT NULL,
PUBLISHER_ID BIGINT NOT NULL,
FOREIGN KEY (DEVELOPER_ID) REFERENCES DEVELOPERS(ID),
FOREIGN KEY (PUBLISHER_ID) REFERENCES PUBLISHERS(ID)
);

CREATE TABLE USERS(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
PASSWORD VARCHAR(100) NOT NULL,
USERNAME VARCHAR(100) NOT NULL
);

CREATE TABLE ROLES(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
ROLE VARCHAR(20) NOT NULL
);

CREATE TABLE USER_ROLE(
USER_ID BIGINT NOT NULL,
ROLE_ID BIGINT NOT NULL,
FOREIGN KEY (USER_ID) REFERENCES USERS(ID),
FOREIGN KEY (ROLE_ID) REFERENCES ROLES(ID)
);