INSERT INTO customer (first_name, middle_name, last_name) SELECT 'Jamie', 'HJ', 'Mills' WHERE NOT EXISTS (SELECT * FROM customer WHERE customer_id=1);
INSERT INTO customer (first_name, middle_name, last_name) SELECT 'Bryan', 'Daniel', 'Mills' WHERE NOT EXISTS (SELECT * FROM customer WHERE customer_id=2);
INSERT INTO customer (first_name, middle_name, last_name) SELECT 'Ann', 'Ceclia', 'Mills' WHERE NOT EXISTS (SELECT * FROM customer WHERE customer_id=3);


