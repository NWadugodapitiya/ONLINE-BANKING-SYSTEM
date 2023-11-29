-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2023 at 03:45 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banking_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `banks`
--

CREATE TABLE `banks` (
  `bank_names` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `banks`
--

INSERT INTO `banks` (`bank_names`) VALUES
('BOC'),
('People\'s Bank'),
('Commercial Bank'),
('Hatton National Bank'),
('Sampath Bank'),
('National Development Bank'),
('Seylan Bank'),
('DFCC Bank'),
('Nations Trust Bank'),
('Pan Asia Banking Corporation'),
('Union Bank of Colombo'),
('Amana Bank'),
('Sanasa Development Bank');

-- --------------------------------------------------------

--
-- Table structure for table `login_infor`
--

CREATE TABLE `login_infor` (
  `user_id` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Date_time` varchar(50) DEFAULT NULL,
  `login_and_logout` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_infor`
--

INSERT INTO `login_infor` (`user_id`, `Password`, `Date_time`, `login_and_logout`) VALUES
('2525', '2525', '24-11-2023 21:03:01', 'Login'),
('2525', '2525', '24-11-2023 21:13:47', 'Login'),
('2525', '2525', '24-11-2023 21:14:54', 'Login'),
('2525', '2525', '24-11-2023 21:15:28', 'Login'),
('2525', '2525', '24-11-2023 21:16:22', 'Login'),
('2525', '7070', '24-11-2023 21:16:28', 'Login'),
('2525', '2525', '24-11-2023 21:18:49', 'Login'),
('2525', '7070', '24-11-2023 21:18:54', 'Login'),
('2525', '7070', '24-11-2023 21:20:22', 'Login'),
('2525', '2525', '24-11-2023 21:25:23', 'Login'),
('2525', '2525', '25-11-2023 00:36:15', 'Login'),
('2525', '2525', '25-11-2023 00:40:32', 'Login'),
('2004', '2525', '25-11-2023 00:47:41', 'Login'),
('2004', '2525', '25-11-2023 00:55:46', 'Login'),
('2004', '2525', '25-11-2023 00:56:17', 'Login'),
('2004', '2525', '25-11-2023 00:57:13', 'Login'),
('2004', '2525', '25-11-2023 01:27:20', 'Login'),
('2004', '2525', '25-11-2023 01:28:36', 'Login'),
('2004', '2525', '25-11-2023 01:33:42', 'Login'),
('2004', '2525', '25-11-2023 01:35:19', 'Login'),
('2004', '2525', '25-11-2023 01:43:33', 'Login'),
('2004', '2525', '25-11-2023 01:44:51', 'Login'),
('1001', '2525', '25-11-2023 02:24:39', 'Login'),
('1001', '2525', '25-11-2023 02:37:00', 'Login'),
('1001', '2525', '25-11-2023 02:40:53', 'Login'),
('1001', '2525', '25-11-2023 02:58:01', 'Login'),
('1001', '2525', '25-11-2023 03:00:45', 'Login'),
('1001', '2525', '25-11-2023 03:15:55', 'Login'),
('1001', '2525', '25-11-2023 03:25:30', 'Login'),
('2004', '2525', '25-11-2023 15:04:41', 'Login'),
('1001', '2525', '25-11-2023 15:05:04', 'Login'),
('1001', '2525', '25-11-2023 15:21:14', 'Login'),
('1001', '2525', '25-11-2023 15:24:23', 'Login'),
('1004', '2525', '25-11-2023 17:00:16', 'Login'),
('1001', '2525', '25-11-2023 17:00:23', 'Login'),
('1001', '2525', '25-11-2023 17:05:58', 'Login'),
('1001', '2525', '25-11-2023 17:07:29', 'Login'),
('1001', '2525', '25-11-2023 17:10:25', 'Login'),
('1001', '2525', '25-11-2023 17:12:53', 'Login'),
(NULL, '', '25-11-2023 17:35:57', 'Logout'),
('1001', '2525', '25-11-2023 17:36:03', 'Login'),
(NULL, '', '25-11-2023 17:54:37', 'Logout'),
('1001', '2525', '25-11-2023 17:54:42', 'Login'),
('1001', '2525', '25-11-2023 17:58:47', 'Login'),
(NULL, '', '26-11-2023 00:09:28', 'Logout'),
('1001', '2525', '26-11-2023 00:09:34', 'Login'),
(NULL, '', '26-11-2023 00:13:50', 'Logout'),
('1001', '2525', '26-11-2023 00:13:58', 'Login'),
(NULL, '', '26-11-2023 00:16:10', 'Logout'),
('1001', '2525', '26-11-2023 00:16:16', 'Login'),
('1001', '2525', '26-11-2023 00:21:52', 'Login'),
('1001', '2525', '26-11-2023 00:26:09', 'Login'),
('1001', '2525', '26-11-2023 00:34:17', 'Login'),
('1001', '2525', '26-11-2023 01:19:11', 'Login'),
('1001', '2525', '26-11-2023 01:23:54', 'Login'),
('1001', '2525', '26-11-2023 01:41:26', 'Login'),
('1001', '2525', '26-11-2023 01:52:03', 'Login'),
('1001', '2525', '26-11-2023 01:53:22', 'Login'),
('1001', '2525', '26-11-2023 01:58:38', 'Login'),
('1001', '2525', '26-11-2023 02:00:54', 'Login'),
('1001', '2525', '26-11-2023 02:01:59', 'Login'),
('1001', '2525', '26-11-2023 02:10:30', 'Login'),
('5000', '2525', '26-11-2023 15:43:05', 'Login'),
('5000', '5050', '26-11-2023 15:47:36', 'Login'),
('5000', '', '26-11-2023 15:53:43', 'Logout');

-- --------------------------------------------------------

--
-- Table structure for table `payees`
--

CREATE TABLE `payees` (
  `user_id` varchar(50) DEFAULT NULL,
  `bank` varchar(50) DEFAULT NULL,
  `account_no` varchar(50) DEFAULT NULL,
  `account_name` varchar(50) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payees`
--

INSERT INTO `payees` (`user_id`, `bank`, `account_no`, `account_name`, `nick_name`) VALUES
('5000', 'Sampath Bank', '3000', 'Y C Lakshitha', 'YCL');

-- --------------------------------------------------------

--
-- Table structure for table `transaction_history`
--

CREATE TABLE `transaction_history` (
  `user_id` varchar(50) DEFAULT NULL,
  `pay_from` varchar(50) DEFAULT NULL,
  `pay_to` varchar(50) DEFAULT NULL,
  `balance` varchar(50) DEFAULT NULL,
  `date_time` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction_history`
--

INSERT INTO `transaction_history` (`user_id`, `pay_from`, `pay_to`, `balance`, `date_time`, `status`) VALUES
('5000', '27001', '', '1000', '26-11-2023 15:50:40', 'Withdraw'),
('5000', '27001', '27002', '2500', '26-11-2023 15:52:32', 'Deposit'),
('5000', '27001', '3000', '3450', '26-11-2023 15:53:15', 'Transfer');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` varchar(50) DEFAULT NULL,
  `user_nic` varchar(50) DEFAULT NULL,
  `full_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `date_time` varchar(50) DEFAULT NULL,
  `account_no` int(11) NOT NULL,
  `balance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_nic`, `full_name`, `password`, `date_time`, `account_no`, `balance`) VALUES
('5000', '25255050', 'N D S Nadun Harshana', '5050', '26-11-2023 15:42:48', 27001, 3050),
('5050', '25255050', 'Nadun Harshana', '100', '27-11-2023 15:42:48', 27002, 2500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`account_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `account_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27003;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
