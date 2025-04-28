DROP TABLE IF EXISTS book;

CREATE TABLE book (
    id IDENTITY PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    available BOOLEAN
);

