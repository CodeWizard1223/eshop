SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE order_item;
TRUNCATE TABLE orders;
TRUNCATE TABLE product;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO product (name, price, amount) VALUES
('Milk', 1.20, 10),
('Bread', 1.00, 20),
('Cheese', 2.50, 5);

INSERT INTO orders (paid) VALUES (false);
