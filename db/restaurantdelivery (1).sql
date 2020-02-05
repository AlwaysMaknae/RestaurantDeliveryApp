-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 03, 2020 at 05:26 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14











-- STORED PROC AT LINE 190 BELOW

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurantdelivery`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `client_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `client_username` varchar(20) NOT NULL,
  `client_password` varchar(50) NOT NULL,
  `client_last_name` varchar(50) NOT NULL,
  `client_first_name` varchar(50) NOT NULL,
  `client_address` varchar(50) NOT NULL,
  `client_email` varchar(64) NOT NULL,
  `client_number` varchar(12) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `deliverers`
--

DROP TABLE IF EXISTS `deliverers`;
CREATE TABLE IF NOT EXISTS `deliverers` (
  `deliverer_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `deliverer_name` varchar(50) NOT NULL,
  `deliverer_number` varchar(12) NOT NULL,
  `deliverer_area` varchar(200) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`deliverer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items` (
  `item_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `item_dish` varchar(35) NOT NULL,
  `item_price` float NOT NULL,
  `restaurant_id` int(10) UNSIGNED NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`item_id`),
  KEY `restaurant_id` (`restaurant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_address` varchar(200) NOT NULL,
  `order_postal_code` varchar(7) NOT NULL,
  `order_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `order_items` text NOT NULL,
  `order_delivery_time` time DEFAULT NULL,
  `order_price` float NOT NULL,
  `order_status` varchar(9) NOT NULL DEFAULT 'NOT READY',
  `restaurant_id` int(11) UNSIGNED NOT NULL,
  `deliverer_id` int(10) UNSIGNED NOT NULL,
  `client_id` int(10) UNSIGNED NOT NULL,
  `order_delivered` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`order_id`),
  KEY `restaurant_id` (`restaurant_id`),
  KEY `deliverer_id` (`deliverer_id`),
  KEY `client_id` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `restaurants`
--

DROP TABLE IF EXISTS `restaurants`;
CREATE TABLE IF NOT EXISTS `restaurants` (
  `restaurant_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `restaurant_name` varchar(30) NOT NULL,
  `restaurant_address` varchar(50) NOT NULL,
  `restaurant_number` varchar(12) NOT NULL,
  `restaurant_hours` varchar(200) NOT NULL,
  `restaurant_areas` varchar(200) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`restaurant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurants`
--

INSERT INTO `restaurants` (`restaurant_id`, `restaurant_name`, `restaurant_address`, `restaurant_number`, `restaurant_hours`, `restaurant_areas`, `status`) VALUES
(1, 'Master Shef', '5555 Rue Master, J2J 1K6, SH, CA', '151-655-2131', '', 'Montreal, Not Laval, Not Longueuil', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT '1',
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `access_lvl`, `status`) VALUES
(1, 'Jose', '123123', 1, 1),
(2, 'Frank', '123123', 1, 1),
(3, 'JJJ', 'Yaaaah YEEEET', 2, 1),
(6, 'Jay', '123123123', 2, 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `items`
--
ALTER TABLE `items`
  ADD CONSTRAINT `items_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`),
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`deliverer_id`) REFERENCES `deliverers` (`deliverer_id`),
  ADD CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- ALL PROCEDUES ARE FROM HERE AND BELOW

DELIMITER ☻

-- USERS PROCEDURES
CREATE PROCEDURE create_user(IN username VARCHAR(20), IN psswrd VARCHAR(50), IN access_lvl INT(11))
BEGIN
	INSERT INTO users(username, password, access_lvl) VALUES (username, psswrd, access_lvl);
	END ☻
    
-- CALL create_user("Jose", "123", 3);

CREATE PROCEDURE update_user(IN id INT, IN username VARCHAR(20), IN psswrd VARCHAR(50), IN access_lvl INT(11))
BEGIN
	UPDATE users SET users.username=username, users.password=psswrd, users.access_lvl=access_lvl WHERE user_id=id;
    END ☻
    
CREATE PROCEDURE update_user1(IN id INT, IN psswrd VARCHAR(50))
BEGIN
	UPDATE users SET users.password=psswrd WHERE user_id=id;
    END ☻

-- CALL update_user(13, "Yeeet", "YAAAAH", 1); 

CREATE PROCEDURE delete_user(IN id INT)
BEGIN
	UPDATE users SET users.status=0 WHERE user_id = id;
    END☻
    
-- CALL delete_user(13);

--   CLIENT PROCEDURES BELOW

CREATE PROCEDURE create_client(IN client_username VARCHAR(20), IN client_password VARCHAR(50), IN client_last_name VARCHAR(50),
								IN client_first_name VARCHAR(50), IN client_address VARCHAR(50), IN client_email VARCHAR(64), IN client_number VARCHAR(12), IN status INT)
BEGIN
	INSERT INTO clients(client_username, client_password, client_last_name, client_first_name, client_address, client_email, client_number, status)
		VALUES (client_username, client_password, client_last_name, client_first_name, client_address, client_email, client_number, status);
    END☻
    
CREATE PROCEDURE update_client(IN client_id INT, IN client_username VARCHAR(20), IN client_password VARCHAR(50), IN client_last_name VARCHAR(50), IN client_first_name VARCHAR(50), IN client_address VARCHAR(50), IN client_email VARCHAR(64), IN client_number VARCHAR(12))
BEGIN 
	UPDATE clients SET clients.client_username=client_username, clients.client_password=client_password, clients.client_last_name=client_last_name, clients.client_first_name=client_first_name, clients.client_address=client_address, clients.client_email=client_email, clients.client_number=client_number
		WHERE clients.client_id=client_id;
    END☻
    
CREATE PROCEDURE delete_client(IN client_id INT)
BEGIN
	UPDATE clients SET clients.status=0 WHERE clients.client_id=client_id;
    END☻

-- RESTAURANT PROCEDURES BELOW
CREATE PROCEDURE create_restaurant(IN restaurant_name VARCHAR(30), IN restaurant_address VARCHAR(50), IN restaurant_number VARCHAR(12), IN restaurant_hours VARCHAR(200), IN restaurant_areas VARCHAR(200), IN status INT)
BEGIN
	INSERT INTO restaurants(restaurant_name, restaurant_address, restaurant_number, restaurant_hours, restaurant_areas, status)
		VALUES(restaurant_name, restaurant_address, restaurant_number, restaurant_hours, restaurant_areas, status);
    END☻
    
CREATE PROCEDURE update_restaurant(IN restaurant_id INT, IN restaurant_name VARCHAR(30), IN restaurant_address VARCHAR(50), IN restaurant_number VARCHAR(12), IN restaurant_hours VARCHAR(200), IN restaurant_areas VARCHAR(200))
BEGIN
	UPDATE restaurants SET restaurants.restaurant_name=restaurant_name, restaurants.restaurant_address=restaurant_address, restaurants.restaurant_number=restaurant_number, restaurants.restaurant_hours=restaurant_hours, restaurants.restaurant_areas=restaurant_areas
		WHERE restaurants.restaurant_id=restaurant_id;
	END☻
   
CREATE PROCEDURE delete_restaurant(IN restaurant_id INT)
BEGIN
	UPDATE restaurants SET restaurants.status=0 WHERE restaurants.restaurant_id=restaurant_id;
    END☻

-- ITEMS PROCEDURE BELOW
CREATE PROCEDURE create_item(IN item_dish VARCHAR(35), IN item_price FLOAT, IN restaurant_id INT, IN status INT)
BEGIN
	INSERT INTO items(item_dish, item_price, restaurant_id, status)
		VALUES(item_dish, item_price, restaurant_id, status);
	END☻
    
CREATE PROCEDURE update_item(IN item_id INT, IN item_dish VARCHAR(35), IN item_price FLOAT)
BEGIN
	UPDATE items SET items.item_dish=item_dish, items.item_price=item_price WHERE items.item_id=item_id;
    END☻

CREATE PROCEDURE delete_item(IN item_id INT)
BEGIN
	UPDATE items SET items.status=0 WHERE items.item_id=item_id;
    END☻

-- ORDERS PROCEDURE BELOW
CREATE PROCEDURE create_order(IN order_address VARCHAR(200), IN order_postal_code VARCHAR(7), IN order_date DATETIME, IN order_items TEXT, IN order_delivery_time TIME,
								IN order_price FLOAT, IN order_status VARCHAR(9), IN restaurant_id INT, IN deliverer_id INT, IN client_id INT, IN order_delivered TINYINT)
BEGIN
	INSERT INTO orders(order_address, order_postal_code, order_date, order_items, order_delivery_time, order_price, order_status, restaurant_id,
						deliverer_id, client_id, order_delivered)
		VALUES(order_address, order_postal_code, order_date, order_items, order_delivery_time, order_price, order_status, restaurant_id,
						deliverer_id, client_id, order_delivered);
	END☻
    
CREATE PROCEDURE update_order(IN order_id INT, IN order_address VARCHAR(200), IN order_post_code VARCHAR(7), IN order_items TEXT, IN order_delivery_time TIME,
								IN deliverer_id INT, IN order_delivered INT)
BEGIN
	UPDATE orders SET orders.order_address=order_address, orders.order_post_code=order_post_code, orders.order_items=order_items, orders.order_delivery_time=order_delivery_time,
						orders.deliverer_id=deliverer_id, orders.order_delivered=order_delivered
		WHERE orders.order_id=order_id;
	END☻


CREATE PROCEDURE delete_order(IN order_id INT)
BEGIN
	UPDATE orders SET orders.order_delivered=1 WHERE orders.order_id=order_id;
    END☻
    
-- DELIVERERS PROCEDURES BELOW
CREATE PROCEDURE create_deliverer(IN deliverer_name VARCHAR(50), IN deliverer_number VARCHAR(12), IN deliverer_area VARCHAR(200), IN status INT)
BEGIN
	INSERT INTO deliverers(deliverer_name, deliverer_number, deliverer_area, status)
		VALUES(deliverer_name, deliverer_number, deliverer_area, status);
	END☻
    
CREATE PROCEDURE update_deliverer(IN deliverer_id INT, IN deliverer_name VARCHAR(50), IN deliverer_number VARCHAR(12), IN deliverer_area VARCHAR(200))
BEGIN
	UPDATE deliverers SET deliverers.deliverer_name=deliverer_name, deliverers.deliverer_number=deliverer_number, deliverers.deliverer_area=deliverer_area
		WHERE deliverers.deliverer_id=deliverer_id;
	END☻

CREATE PROCEDURE delete_deliverer(IN deliverer_id INT)
BEGIN
	UPDATE deliverers SET deliverers.status=0 WHERE deliverers.deliverer_id=deliverer_id;
    END☻