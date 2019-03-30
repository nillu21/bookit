CREATE TABLE user (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    age  number       NOT NULL
);

INSERT INTO user (name, age)
VALUES ('kaspar', 15);
INSERT INTO user (name, age)
VALUES ('ilja', 15);
INSERT INTO user (name, age)
VALUES ('lauri', 15);
INSERT INTO user (name, age)
VALUES ('mae', 15);
INSERT INTO user (name, age)
VALUES ('raiko', 15);
INSERT INTO user (name, age)
VALUES ('reiko', 15);

CREATE TABLE todo (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    description  varchar(255) NOT NULL,
    done bit NOT NULL
);

INSERT INTO todo(name,description,done)
VALUES ('soomine', 'tahan burxi', 0);
INSERT INTO todo(name,description,done)
VALUES ('joomine', 'tahan viina', 0);
INSERT INTO todo(name,description,done)
VALUES ('tantsimine', 'tahan tantsida', 0);