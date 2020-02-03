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
  `item_price` int(11) NOT NULL,
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
  `order_price` int(11) NOT NULL,
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
CREATE PROCEDURE create_user(IN username VARCHAR(20), IN psswrd VARCHAR(50), IN access_lvl INT(11))
BEGIN
	INSERT INTO users VALUES (DEFAULT, username, psswrd, access_lvl, DEFAULT);
	END ☻
    
-- CALL create_user("Jose", "123", 3);

CREATE PROCEDURE update_user(IN id INT, IN username VARCHAR(20), IN psswrd VARCHAR(50), IN access_lvl INT(11))
BEGIN
	UPDATE users SET users.username=username, users.password=psswrd, users.access_lvl=access_lvl WHERE user_id=id;
    END ☻

-- CALL update_user(13, "Yeeet", "YAAAAH", 1); 

CREATE PROCEDURE delete_user(IN id INT)
BEGIN
	UPDATE users SET users.status=0 WHERE user_id = id;
    END☻
    
-- CALL delete_user(13);

