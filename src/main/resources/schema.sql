CREATE TABLE scheduler (
    id VARCHAR(255) PRIMARY KEY,
    frequency INT NOT NULL,
    next_run BIGINT NULL
);