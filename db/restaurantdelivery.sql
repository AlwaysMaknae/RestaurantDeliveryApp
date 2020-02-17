-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 17, 2020 at 04:31 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

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
CREATE DEFINER=`root`@`localhost` PROCEDURE `create_deliverer` (IN `username` VARCHAR(20), IN `password` VARCHAR(50), IN `deliverer_name` VARCHAR(50), IN `deliverer_number` VARCHAR(12), IN `deliverer_area` VARCHAR(200))  BEGIN
	INSERT INTO deliverers(username, password, deliverer_name, deliverer_number, deliverer_area)
		VALUES(username, password, deliverer_name, deliverer_number, deliverer_area);
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
  `access_lvl` int(11) NOT NULL DEFAULT '0',
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`client_id`, `client_username`, `client_password`, `client_last_name`, `client_first_name`, `client_address`, `client_email`, `client_number`, `access_lvl`, `status`) VALUES
(11, 'Jose', '123', 'wen', 'Joses', '9545RueByeBitches', 'email@myemail.com', '544-544-5444', 0, 1),
(12, 'Frank', '123123', 'Frank', 'Franku', '6565 Rue Bye Bitchesas', 'myhotmail@outdated.ca', '555-999-9999', 0, 1),
(17, 'jose1', '123', '123', '123', '123123123', '@.com', '123-123-1232', 0, 1),
(18, 'Cole', '123', 'Cole', 'J.', '783 Rue MyStreet ', 'cole@email.com', '123-123-1232', 0, 1),
(19, 'Rooney', '123123', 'Rooney', 'Toons', '123 Rue Mystreat', 'rooney@email.com', '221-545-3623', 0, 1),
(20, 'Manuel', '123', 'Manuel', 'Figue', '231 Rue Monsa', 'manuel@email.com', '123-123-2131', 0, 1),
(21, 'Gray', '123', 'D.', 'Gray', '292 MyStreet Reu', 'gray@email.com', '123-867-3573', 0, 1),
(22, 'lyle', '123', 'Lyle', 'Kyle', '837 rue MyStreet', 'lyle@email.com', '231-996-5889', 0, 1),
(23, 'Kasseem', '123', 'Kass', 'Eem', '888 rue Streeter ', 'kasseem@email.com', '231-885-8080', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `deliverers`
--

DROP TABLE IF EXISTS `deliverers`;
CREATE TABLE IF NOT EXISTS `deliverers` (
  `deliverer_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT '3',
  `deliverer_name` varchar(50) NOT NULL,
  `deliverer_number` varchar(12) NOT NULL,
  `deliverer_area` varchar(200) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`deliverer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliverers`
--

INSERT INTO `deliverers` (`deliverer_id`, `username`, `password`, `access_lvl`, `deliverer_name`, `deliverer_number`, `deliverer_area`, `status`) VALUES
(1, 'Klaus', '123', 3, 'James', '333-333-3333', 'H1L l9a a2a', 1),
(2, 'James', '123', 3, 'Kaid', '545-673-3234', 'H5K I0O K2L L6P A8A A7A J2K a2a', 1),
(3, 'Zack', '123123', 3, 'Klaus', '232-222-2322', 'H4K I5O K1L L2P A5A A6A ', 1),
(9, 'colorado', '123', 3, 'Colorado', '123-232-2131', 'a2a k9a k4d k3x v6a p9a o0o l9a k9a', 1),
(10, 'trevor', '123', 3, 'Trevor', '123-232-2323', 'a2q q2q s3a h3a ', 1),
(11, 'victor', '123', 3, 'Victor', '596-656-5656', 'k7l h3k ', 1);

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
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_dish`, `item_price`, `restaurant_id`, `status`) VALUES
(2, 'Fried Ginger Chicken', 22.99, 2, 0),
(3, 'Fried Spicy Chicken', 21.99, 2, 1),
(4, 'Cheese Sticks (6)', 5.75, 2, 1),
(5, 'Cheesecake', 17.99, 2, 1),
(6, 'Pumpkin Cheesecake', 21.99, 2, 1),
(7, 'Crispy Fried Cheese', 7.98, 2, 1),
(8, 'Black-Out Cake', 37.99, 2, 1),
(9, 'Lemon Raspberry Cream Cheesecake', 25.99, 2, 1),
(10, 'Beef Tripes', 5.99, 6, 1),
(11, 'Chuck', 3.99, 6, 1),
(12, 'Flank', 2.99, 6, 1),
(13, 'Beef Loi', 7.99, 6, 1),
(14, 'Brisket', 9.99, 6, 1),
(15, 'Zuccini', 3.99, 6, 1),
(16, 'Filet Mignon', 25.99, 6, 1),
(17, 'Pork Loin', 3.99, 7, 1),
(18, 'Pork Filet', 4.99, 7, 1),
(19, 'Cucumber', 1.99, 7, 1),
(20, 'Shrimp', 6.99, 7, 1),
(21, 'Shrimp Ball', 6.99, 7, 1),
(22, 'Bok Choi', 1.99, 7, 1);

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
  `access_lvl` int(11) NOT NULL DEFAULT '1',
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`manager_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `managers`
--

INSERT INTO `managers` (`manager_id`, `username`, `password`, `restaurant_id`, `access_lvl`, `status`) VALUES
(11, 'Santa', '123123', 2, 1, 1),
(12, 'Claus', '1234', 2, 1, 1),
(13, 'Prescott', '123', 6, 1, 1),
(14, 'Kuame', '123', 6, 1, 1),
(15, 'Chance', '123', 7, 1, 1),
(16, 'The Rapper', '123', 7, 1, 1);

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
  `order_delivered` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `order_address`, `order_postal_code`, `order_date`, `order_items`, `order_delivery_time`, `order_price`, `order_status`, `restaurant_id`, `deliverer_id`, `client_id`, `order_delivered`) VALUES
(70, '292 MyStreet Reu', 'a2a', '2020-01-17', '(2x)Pork Filet: 9.98$\n(2x)Pork Filet: 9.98$\n(19x)Pork Filet: 94.81$\n(20x)Pork Filet: 99.799995$\n(1x)Pork Filet: 4.99$\n', '16:00:00', 219.56, 'NOT READY', 7, NULL, 21, 0),
(71, '837 rue MyStreet', 'a2a', '2020-01-17', '(4x)Chuck: 15.96$\n(1x)Chuck: 3.99$\n(1x)Chuck: 3.99$\n(1x)Filet Mignon: 25.99$\n(1x)Filet Mignon: 25.99$\n(18x)Filet Mignon: 467.82$\n', '16:00:00', 543.74, 'DONE', 6, 9, 22, 0),
(72, '9545RueByeBitches', 'a2a', '2020-01-17', '(2x)Beef Tripes: 11.98$\n(2x)Beef Tripes: 11.98$\n', '18:00:00', 23.96, 'IN TRANSIT', 6, 9, 11, 0);

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurants`
--

INSERT INTO `restaurants` (`restaurant_id`, `restaurant_name`, `restaurant_address`, `restaurant_number`, `restaurant_hours`, `restaurant_areas`, `status`) VALUES
(2, 'Cheese factory', '999 Rue Klaus', '450-555-5555', '04:00 04:00 04:00 04:00 04:00 04:00 04:00 21:00 21:00 21:00 21:00 21:00 21:00 21:00 ', 'J2K K9K J8A O9Q Q5A J2K K9K J8A O9Q Q5A J2K K9K J8A O9Q Q5A J2K K9K J8A O9Q Q5A J2K K9K J8A O9Q Q5A J2K K9K J8A O9Q Q5A K9K Q5A J2K ', 1),
(6, 'Hotpot Finesse', '777 Rue It\'s Getting Hot In Here', '123-123-1231', '10:00 10:00 10:00 10:00 10:00 10:00 10:00 21:00 21:00 21:00 21:00 21:00 17:00 17:00 ', 'a2a k9a k4d k3x ', 1),
(7, 'Hotpot Maladie', '777 Rue So Get All Your ', '123-123-1231', '14:00 14:00 14:00 14:00 14:00 14:00 14:00 20:00 20:00 20:00 20:00 20:00 20:00 20:00 ', 'a2a k9a k4d k3x a2a k9a k4d k3x h7k ', 1);

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
  `access_lvl` int(11) NOT NULL DEFAULT '2',
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`restaurateur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurateurs`
--

INSERT INTO `restaurateurs` (`restaurateur_id`, `username`, `password`, `restaurant_id`, `access_lvl`, `status`) VALUES
(12, 'Ramesoy', '123', 2, 2, 1),
(14, 'Jamie', '123', 6, 2, 1),
(15, 'Olivier', '123', 7, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `access_lvl` int(11) NOT NULL DEFAULT '4',
  `status` tinyint(4) NOT NULL DEFAULT '1',
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
