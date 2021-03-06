CREATE DATABASE bookstore_0607;

CREATE TABLE bs_user(
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(100) NOT NULL UNIQUE,
	PASSWORD VARCHAR(100) NOT NULL,
	email VARCHAR(100)
)

CREATE TABLE bs_book (
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(100),
	author VARCHAR(100),
	price DOUBLE(9,2),
	sales INT(11),
	stock INT(11),
	img_path VARCHAR(200)
)

CREATE TABLE bs_order(
	id VARCHAR(100) PRIMARY KEY ,
	order_time DATETIME,
	total_count INT(11),
	total_amount DOUBLE(11,2),
	state INT(2),
	user_id INT(11),
	FOREIGN KEY (user_id) REFERENCES bs_user(id)
)

CREATE TABLE bs_order_item(
	id INT(11) PRIMARY KEY AUTO_INCREMENT,
	COUNT INT(11),
	amount DOUBLE(11,2),
	book_id INT(11),
	order_id VARCHAR(100),
	FOREIGN KEY (book_id) REFERENCES bs_book(id),
	FOREIGN KEY (order_id) REFERENCES bs_order(id)
)