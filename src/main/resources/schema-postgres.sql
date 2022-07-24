DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
customer_id int4 NOT NULL,
first_name varchar(50) NOT NULL,
middle_name varchar(50) NOT NULL,
last_name varchar(50) NOT NULL,
CONSTRAINT customer_pkey PRIMARY KEY (customer_id)
);
