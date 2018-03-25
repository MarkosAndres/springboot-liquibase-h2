--liquibase formatted sql

--changeset markos:1
create table task (
    id          int primary key,
    description VARCHAR(64) NOT NULL,
    completed   BIT NOT NULL
);
--rollback drop table test1;

--changeset markos:2
INSERT INTO task (id, description, completed) VALUES (1, 'task 1 desc', 1), (2, 'task 2 desc', 0);