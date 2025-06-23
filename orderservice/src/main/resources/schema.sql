CREATE TABLE order_details (
  id INT AUTO_INCREMENT PRIMARY KEY,
  order_number VARCHAR(255) NOT NULL,
  customer_id VARCHAR(255) NOT NULL,
  order_date TIMESTAMP NOT NULL,
  order_status VARCHAR(255) NOT NULL
);
