CREATE TABLE IF NOT EXISTS customer (
    customer_id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    first_name varchar(50) NOT NULL,
    middle_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL
);
