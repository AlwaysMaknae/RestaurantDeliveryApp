-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 17, 2020 at 04:52 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

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

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `create_client`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_client` (IN `client_username` VARCHAR(20), IN `client_password` VARCHAR(50), IN `client_last_name` VARCHAR(50), IN `client_first_name` VARCHAR(50), IN `client_address` VARCHAR(50), IN `client_email` VARCHAR(64), IN `client_number` VARCHAR(12))  BEGIN
	INSERT INTO clients(client_username, client_password, client_last_name, client_first_name, client_address, client_email, client_number)
		VALUES (client_username, client_password, client_last_name, client_first_name, client_address, client_email, client_number);
    END$$

DROP PROCEDURE IF EXISTS `create_deliverer`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_deliverer` (IN `username` VARCHAR(20), IN `password` VARCHAR(50), IN `deliverer_name` VARCHAR(50), IN `deliverer_number` VARCHAR(12), IN `deliverer_area` VARCHAR(200), IN `status` INT)  BEGIN
	INSERT INTO deliverers(username, password, deliverer_name, deliverer_number, deliverer_area, status)
		VALUES(username, password, deliverer_name, deliverer_number, deliverer_area, status);
	END$$

DROP PROCEDURE IF EXISTS `create_item`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_item` (IN `item_dish` VARCHAR(35), IN `item_price` FLOAT, IN `restaurant_id` INT, IN `status` INT)  BEGIN
	INSERT INTO items(item_dish, item_price, restaurant_id, status)
		VALUES(item_dish, item_price, restaurant_id, status);
	END$$

DROP PROCEDURE IF EXISTS `create_manager`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_manager` (IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50), IN `restaurant_id` VARCHAR(50))  BEGIN
	INSERT INTO managers(username, password, restaurant_id) VALUES (username, psswrd, restaurant_id);
	END$$

DROP PROCEDURE IF EXISTS `create_order`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_order` (IN `order_address` VARCHAR(200), IN `order_postal_code` VARCHAR(7), IN `order_date` DATETIME, IN `order_items` TEXT, IN `order_delivery_time` TIME, IN `order_price` FLOAT, IN `order_status` VARCHAR(9), IN `restaurant_id` INT, IN `client_id` INT)  BEGIN
	INSERT INTO orders(order_address, order_postal_code, order_date, order_items, order_delivery_time, order_price, order_status, restaurant_id,
						 client_id)
		VALUES(order_address, order_postal_code, order_date, order_items, order_delivery_time, order_price, order_status, restaurant_id,
						 client_id);
	END$$

DROP PROCEDURE IF EXISTS `create_restaurant`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_restaurant` (IN `restaurant_name` VARCHAR(30), IN `restaurant_address` VARCHAR(50), IN `restaurant_number` VARCHAR(12), IN `restaurant_hours` VARCHAR(200), IN `restaurant_areas` VARCHAR(200), IN `status` INT)  BEGIN
	INSERT INTO restaurants(restaurant_name, restaurant_address, restaurant_number, restaurant_hours, restaurant_areas, status)
		VALUES(restaurant_name, restaurant_address, restaurant_number, restaurant_hours, restaurant_areas, status);
    END$$

DROP PROCEDURE IF EXISTS `create_restaurateur`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_restaurateur` (IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50), IN `restaurant_id` VARCHAR(50))  BEGIN
	INSERT INTO restaurateurs(username, password, restaurant_id) VALUES (username, psswrd, restaurant_id);
	END$$

DROP PROCEDURE IF EXISTS `create_user`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_user` (IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50))  BEGIN
	INSERT INTO users(username, password) VALUES (username, psswrd);
	END$$

DROP PROCEDURE IF EXISTS `delete_client`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_client` (IN `client_id` INT)  BEGIN
	UPDATE clients SET clients.status=0 WHERE clients.client_id=client_id;
    END$$

DROP PROCEDURE IF EXISTS `delete_deliverer`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_deliverer` (IN `deliverer_id` INT)  BEGIN
	UPDATE deliverers SET deliverers.status=0 WHERE deliverers.deliverer_id=deliverer_id;
    END$$

DROP PROCEDURE IF EXISTS `delete_item`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_item` (IN `item_id` INT)  BEGIN
	UPDATE items SET items.status=0 WHERE items.item_id=item_id;
    END$$

DROP PROCEDURE IF EXISTS `delete_manager`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_manager` (IN `id` INT)  BEGIN
	UPDATE managers SET managers.status=0 WHERE managers_id = id;
    END$$

DROP PROCEDURE IF EXISTS `delete_order`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_order` (IN `order_id` INT)  BEGIN
	UPDATE orders SET orders.order_delivered=1 WHERE orders.order_id=order_id;
    END$$

DROP PROCEDURE IF EXISTS `delete_restaurant`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_restaurant` (IN `restaurant_id` INT)  BEGIN
	UPDATE restaurants SET restaurants.status=0 WHERE restaurants.restaurant_id=restaurant_id;
    END$$

DROP PROCEDURE IF EXISTS `delete_restaurateur`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_restaurateur` (IN `id` INT)  BEGIN
	UPDATE restaurateurs SET restaurateurs.status=0 WHERE restaurateur_id = id;
    END$$

DROP PROCEDURE IF EXISTS `delete_user`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_user` (IN `id` INT)  BEGIN
	UPDATE users SET users.status=0 WHERE user_id = id;
    END$$

DROP PROCEDURE IF EXISTS `get_all_users`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_all_users` (IN `username` VARCHAR(20))  BEGIN
	SELECT clients.client_username, managers.username, restaurateurs.username,	users.username FROM clients, managers, restaurateurs, users
    WHERE clients.client_username=username || managers.username=username || restaurateurs.username=username ||	users.username=username;
    END$$

DROP PROCEDURE IF EXISTS `get_order_by_client`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_order_by_client` (IN `client_id` INT)  BEGIN
	SELECT * FROM orders WHERE orders.client_id=client_id;
    END$$

DROP PROCEDURE IF EXISTS `update_client`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_client` (IN `client_id` INT, IN `client_username` VARCHAR(20), IN `client_password` VARCHAR(50), IN `client_last_name` VARCHAR(50), IN `client_first_name` VARCHAR(50), IN `client_address` VARCHAR(50), IN `client_email` VARCHAR(64), IN `client_number` VARCHAR(12))  BEGIN 
	UPDATE clients SET clients.client_username=client_username, clients.client_password=client_password, clients.client_last_name=client_last_name, clients.client_first_name=client_first_name, clients.client_address=client_address, clients.client_email=client_email, clients.client_number=client_number
		WHERE clients.client_id=client_id;
    END$$

DROP PROCEDURE IF EXISTS `update_deliverer`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_deliverer` (IN `deliverer_id` INT, IN `deliverer_name` VARCHAR(50), IN `deliverer_number` VARCHAR(12), IN `deliverer_area` VARCHAR(200))  BEGIN
	UPDATE deliverers SET deliverers.deliverer_name=deliverer_name, deliverers.deliverer_number=deliverer_number, deliverers.deliverer_area=deliverer_area
		WHERE deliverers.deliverer_id=deliverer_id;
	END$$

DROP PROCEDURE IF EXISTS `update_item`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_item` (IN `item_id` INT, IN `item_dish` VARCHAR(35), IN `item_price` FLOAT)  BEGIN
	UPDATE items SET items.item_dish=item_dish, items.item_price=item_price WHERE items.item_id=item_id;
    END$$

DROP PROCEDURE IF EXISTS `update_manager`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_manager` (IN `id` INT, IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50), IN `restaurant_id` INT)  BEGIN
	UPDATE managers SET managers.username=username, managers.password=psswrd, managers.restaurant_id=restaurant_id WHERE manager_id=id;
    END$$

DROP PROCEDURE IF EXISTS `update_order`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_order` (IN `order_id` INT, IN `order_address` VARCHAR(200), IN `order_post_code` VARCHAR(7), IN `order_date` DATE, IN `order_items` TEXT, IN `order_delivery_time` TIME, IN `order_price` FLOAT, IN `order_status` VARCHAR(50), IN `restaurant_id` INT, IN `deliverer_id` INT, IN `client_id` INT, IN `order_delivered` INT)  BEGIN
	UPDATE orders SET orders.order_address=order_address, orders.order_postal_code=order_post_code, orders.order_date=order_date, orders.order_items=order_items, orders.order_delivery_time=order_delivery_time, orders.order_price=order_price, orders.order_status=order_status, orders.restaurant_id=restaurant_id,
						orders.deliverer_id=deliverer_id, orders.client_id=client_id, orders.order_delivered=order_delivered
		WHERE orders.order_id=order_id;
	END$$

DROP PROCEDURE IF EXISTS `update_restaurant`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_restaurant` (IN `restaurant_id` INT, IN `restaurant_name` VARCHAR(30), IN `restaurant_address` VARCHAR(50), IN `restaurant_number` VARCHAR(12), IN `restaurant_hours` VARCHAR(200), IN `restaurant_areas` VARCHAR(200))  BEGIN
	UPDATE restaurants SET restaurants.restaurant_name=restaurant_name, restaurants.restaurant_address=restaurant_address, restaurants.restaurant_number=restaurant_number, restaurants.restaurant_hours=restaurant_hours, restaurants.restaurant_areas=restaurant_areas
		WHERE restaurants.restaurant_id=restaurant_id;
	END$$

DROP PROCEDURE IF EXISTS `update_restaurateurs`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_restaurateurs` (IN `id` INT, IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50), IN `restaurant_id` INT)  BEGIN
	UPDATE restaurateurs SET restaurateurs.username=username, restaurateurs.password=psswrd, restaurateurs.restaurant_id=restaurant_id WHERE restaurateur_id=id;
    END$$

DROP PROCEDURE IF EXISTS `update_user`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_user` (IN `id` INT, IN `username` VARCHAR(20), IN `psswrd` VARCHAR(50))  BEGIN
	UPDATE users SET users.username=username, users.password=psswrd WHERE user_id=id;
    END$$

DROP PROCEDURE IF EXISTS `update_user1`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_user1` (IN `id` INT, IN `psswrd` VARCHAR(50))  BEGIN
	UPDATE users SET users.password=psswrd WHERE user_id=id;
    END$$

DELIMITER ;

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
  `access_lvl` int(11) NOT NULL DEFAULT 0,
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`client_id`, `client_username`, `client_password`, `client_last_name`, `client_first_name`, `client_address`, `client_email`, `client_number`, `access_lvl`, `status`) VALUES
(11, 'Jose', '123', 'wen', 'Joses', '9545RueByeBitches', 'email@myemail.com', '544-544-5444', 0, 1),
(12, 'Frank', '123123', 'Frank', 'Franku', '6565 Rue Bye Bitchesas', 'myhotmail@outdated.ca', '555-999-9999', 0, 1),
(13, 'test', 'test', 'test', 'test', 'testtesttest', 'test@.com', '123-321-2321', 0, 1),
(14, 'tester2', 'test', 'test', 'test', 'testtesttest', 'test@.com', '213-123-1235', 0, 1),
(16, '', '123', '123', '123', '123123123123', '@.com', '123-123-1232', 0, 1),
(17, 'jose1', '123', '123', '123', '123123123', '@.com', '123-123-1232', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `deliverers`
--

DROP TABLE IF EXISTS `deliverers`;
CREATE TABLE IF NOT EXISTS `deliverers` (
  `deliverer_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT 3,
  `deliverer_name` varchar(50) NOT NULL,
  `deliverer_number` varchar(12) NOT NULL,
  `deliverer_area` varchar(200) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`deliverer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliverers`
--

INSERT INTO `deliverers` (`deliverer_id`, `username`, `password`, `access_lvl`, `deliverer_name`, `deliverer_number`, `deliverer_area`, `status`) VALUES
(1, 'Klaus', '123', 3, 'James', '333-333-3333', 'H1L', 1),
(2, 'James', '123', 3, 'Kaid', '545-673-3234', 'H5K I0O K2L L6P A8A A7A J2K', 1),
(3, 'Zack', '123123', 3, 'kLAUS', '232-222-2322', 'H4K I5O K1L L2P A5A A6A', 1),
(4, 'tess', 'asd', 3, 'tess', '123-123-1232', 'h2k ', 0),
(5, 'testt', '123', 3, 'YEETERsa', '111-111-1111', 'a2a a2a h2a ', 0),
(7, 'tessss', 'tessss', 3, 'tessss', '222-222-2222', 'a2a a2s ', 0),
(8, 'tesssssss', 'asd', 3, 'asdasd', '123-123-1231', 'a2a a2a ', 0);

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
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_dish`, `item_price`, `restaurant_id`, `status`) VALUES
(1, 'pork chops', 33.99, 1, 1),
(2, 'Fried Ginger Chicken', 22.99, 2, 1),
(3, 'Fried Spicu Chicken', 21.99, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `managers`
--

DROP TABLE IF EXISTS `managers`;
CREATE TABLE IF NOT EXISTS `managers` (
  `manager_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `restaurant_id` int(10) UNSIGNED NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT 1,
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `managers`
--

INSERT INTO `managers` (`manager_id`, `username`, `password`, `restaurant_id`, `access_lvl`, `status`) VALUES
(11, 'Santa', '123123', 2, 1, 1),
(12, 'Claus', '1234', 2, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `order_address` varchar(200) NOT NULL,
  `order_postal_code` varchar(7) NOT NULL,
  `order_date` date NOT NULL,
  `order_items` text NOT NULL,
  `order_delivery_time` time DEFAULT NULL,
  `order_price` float NOT NULL,
  `order_status` varchar(50) NOT NULL DEFAULT 'NOT READY',
  `restaurant_id` int(11) UNSIGNED NOT NULL,
  `deliverer_id` int(10) UNSIGNED DEFAULT NULL,
  `client_id` int(10) UNSIGNED NOT NULL,
  `order_delivered` tinyint(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `order_address`, `order_postal_code`, `order_date`, `order_items`, `order_delivery_time`, `order_price`, `order_status`, `restaurant_id`, `deliverer_id`, `client_id`, `order_delivered`) VALUES
(58, 'address2', 'postal', '2020-02-10', 'items', '12:12:12', 32.2, 'NOT READY', 1, 1, 3, 0),
(59, 'address2', 'postal', '2020-02-10', 'items', '12:12:12', 32.2, 'NOT READY', 1, 1, 3, 0),
(60, 'address2', 'postal', '2020-02-10', 'items', '12:12:12', 32.2, 'NOT READY', 1, 1, 3, 0),
(61, 'yeeter', 'g2a2j3', '2020-02-14', 'Cheese String 23$', NULL, 23, 'NOT READY', 2, 1, 10, 0),
(62, '6565 Rue Bye Bitches', 'H7K', '2020-03-15', 'utils.FListView[,0,30,200x350,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=200,height=350]]', '15:00:00', 21.99, 'NOT READY', 2, NULL, 0, 0),
(63, '6565 Rue Bye Bitches', 'H4K', '2020-03-15', '[(2x)Fried Ginger Chicken: 45.98$]', '15:30:00', 22.99, 'NOT READY', 2, NULL, 0, 0),
(64, '6565 Rue Bye Bitches', 'H4K', '2020-03-15', '[(2x)Fried Ginger Chicken: 45.98$, (2x)Fried Ginger Chicken: 45.98$, (2x)Fried Ginger Chicken: 45.98$]', '15:30:00', 22.99, 'NOT READY', 2, NULL, 0, 0),
(65, '6565 Rue Bye Bitches', 'H8K', '2020-03-15', '[(20x)Fried Spicu Chicken: 439.8$]', '15:30:00', 21.99, 'NOT READY', 2, NULL, 0, 0),
(66, '6565 Rue Bye Bitches', 'J8K', '2020-03-20', '[(2x)Fried Spicu Chicken: 43.98$]', '15:20:00', 21.99, 'NOT READY', 2, NULL, 0, 0),
(67, '6565 Rue Bye Bitches', 'h2k', '2020-03-20', '[(2x)Fried Spicu Chicken: 43.98$, (3x)Fried Spicu Chicken: 65.97$]', '15:00:00', 21.99, 'NOT READY', 2, NULL, 0, 0);

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
  `status` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`restaurant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurants`
--

INSERT INTO `restaurants` (`restaurant_id`, `restaurant_name`, `restaurant_address`, `restaurant_number`, `restaurant_hours`, `restaurant_areas`, `status`) VALUES
(1, 'Master Shef', '5555 Rue Master, J2J 1K6, SH, CA', '151-655-2131', '', 'H6K H2K H9K K9K A0A A9A F9A F1A G9W X9A', 1),
(2, 'CHeese factory', '', '', '', 'J2K K9K J8A O9Q Q5A', 1),
(4, 'George Town', '222 REU WHY NOT', '555-555-5552', '', 'H5K A1K', 1),
(5, 'Nima Town', '222 REU WHY NOT', '555-555-5552', '', 'H5K A1K', 1);

-- --------------------------------------------------------

--
-- Table structure for table `restaurateurs`
--

DROP TABLE IF EXISTS `restaurateurs`;
CREATE TABLE IF NOT EXISTS `restaurateurs` (
  `restaurateur_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `restaurant_id` int(10) UNSIGNED NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT 2,
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`restaurateur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurateurs`
--

INSERT INTO `restaurateurs` (`restaurateur_id`, `username`, `password`, `restaurant_id`, `access_lvl`, `status`) VALUES
(11, 'Gordon', '123123', 1, 2, 1),
(12, 'Ramesoy', '123', 2, 2, 1),
(13, 'Carl', '1232', 1, 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT 4,
  `status` tinyint(4) NOT NULL DEFAULT 1,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `access_lvl`, `status`) VALUES
(15, 'JJJ', '123123', 4, 1),
(16, 'admin', 'admin', 4, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
