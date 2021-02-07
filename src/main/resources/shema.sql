CREATE TABLE repository (
    name varchar(50) PRIMARY KEY NOT NULL,
    owner varchar(50) NOT NULL,
    issues int,
    fork int,
    lastUpdate bigint default 0
);