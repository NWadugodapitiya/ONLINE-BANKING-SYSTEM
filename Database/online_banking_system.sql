-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 07:05 AM
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
-- Database: `online_banking_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `user_nic` varchar(50) DEFAULT NULL,
  `accounts_name` varchar(50) DEFAULT NULL,
  `amount` varchar(50) DEFAULT NULL,
  `date_time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`user_nic`, `accounts_name`, `amount`, `date_time`) VALUES
('2004274005', 'Balance', '0', '24-11-2023 00:39:13'),
('2004274005', 'Saving', '0', '24-11-2023 00:39:13');

-- --------------------------------------------------------

--
-- Table structure for table `all_transactions`
--

CREATE TABLE `all_transactions` (
  `user_nic` varchar(50) DEFAULT NULL,
  `Pay_from` varchar(50) DEFAULT NULL,
  `Pay_to` varchar(50) DEFAULT NULL,
  `Amount` varchar(50) DEFAULT NULL,
  `Reciver_reference` varchar(50) DEFAULT NULL,
  `Your_reference` varchar(50) DEFAULT NULL,
  `Date_time` varchar(50) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `all_transactions`
--

INSERT INTO `all_transactions` (`user_nic`, `Pay_from`, `Pay_to`, `Amount`, `Reciver_reference`, `Your_reference`, `Date_time`, `Status`) VALUES
('2004274005', '1', '2', '100', 't1', 't11', '2023', 'Transfer'),
('2004274005', '1', '2', '300', 't2', 't22', '2023', 'Transfer'),
('2004274005', '1', NULL, '200', 'd1', 'd11', '2023', 'Deposit'),
('2004274005', '1', NULL, '400', 'w1', 'w11', '2023', 'Withdraw'),
('2004274005', '1', '100101', '1000', 'one test', 'one', '24-11-2023 13:34:40', 'Deposit'),
('2004274005', '1', '100101', '500', '2', 'two', '24-11-2023 13:38:26', 'Deposit');

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
('A'),
('B'),
('C'),
('D');

-- --------------------------------------------------------

--
-- Table structure for table `login_infor`
--

CREATE TABLE `login_infor` (
  `user_nic` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Date_time` varchar(50) DEFAULT NULL,
  `login_and_logout` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_infor`
--

INSERT INTO `login_infor` (`user_nic`, `Password`, `Date_time`, `login_and_logout`) VALUES
('200427400590', '1', '23-11-2023 16:21:42', 'Login'),
('200427400590', '2525', '23-11-2023 16:22:03', 'Login'),
('200427400590', '2525', '23-11-2023 16:25:53', 'Login'),
('200427400590', '2525', '23-11-2023 16:41:38', 'Login'),
('200427400590', '2525', '23-11-2023 22:10:31', 'Login'),
('200427400590', '2525', '23-11-2023 23:17:53', 'Login'),
('200427400590', '2525', '23-11-2023 23:18:40', 'Login'),
('200427400590', '2525', '23-11-2023 23:24:33', 'Login'),
('200427400590', '2525', '23-11-2023 23:25:24', 'Login'),
('200427400590', '2525', '23-11-2023 23:25:27', 'Login'),
('200427400590', '2525', '23-11-2023 23:27:47', 'Login'),
('200427', '2525', '23-11-2023 23:27:54', 'Login'),
('2004274', '2525', '23-11-2023 23:32:28', 'Login'),
('200427400', '2525', '23-11-2023 23:32:51', 'Login'),
('200427400590', '2525', '23-11-2023 23:33:17', 'Login'),
('200427400590', '2525', '23-11-2023 23:38:15', 'Login'),
('200427400590', '2525', '23-11-2023 23:40:39', 'Login'),
('2004274005', '2525', '23-11-2023 23:44:02', 'Login'),
('200427400590', '2525', '24-11-2023 00:01:23', 'Login'),
('2004274005', '2525', '24-11-2023 00:39:29', 'Login'),
('2004274005', '2525', '24-11-2023 00:49:33', 'Login'),
('2004274005', '2525', '24-11-2023 00:52:26', 'Login'),
('2004274005', '2525', '24-11-2023 00:53:12', 'Login'),
('2004274005', '2525', '24-11-2023 00:54:00', 'Login'),
('2004274005', '2525', '24-11-2023 00:59:15', 'Login'),
('2004274005', '2525', '24-11-2023 01:07:14', 'Login'),
('2004274005', '2525', '24-11-2023 01:08:28', 'Login'),
('2004274005', '2525', '24-11-2023 01:14:53', 'Login'),
('2004274005', '2525', '24-11-2023 12:32:21', 'Login'),
('2004274005', '2525', '24-11-2023 12:34:33', 'Login'),
('2004274005', '2525', '24-11-2023 12:36:34', 'Login'),
('2004274005', '2525', '24-11-2023 12:43:47', 'Login'),
('2004274005', '2525', '24-11-2023 12:47:24', 'Login'),
('2004274005', '2525', '24-11-2023 12:48:20', 'Login'),
('2004274005', '2525', '24-11-2023 12:50:13', 'Login'),
('2004274005', '2525', '24-11-2023 12:51:52', 'Login'),
('2004274005', '2525', '24-11-2023 13:32:52', 'Login'),
('2004274005', '2525', '24-11-2023 13:38:02', 'Login'),
('2004274005', '2525', '24-11-2023 13:42:11', 'Login');

-- --------------------------------------------------------

--
-- Table structure for table `payees`
--

CREATE TABLE `payees` (
  `user_nic` varchar(50) NOT NULL,
  `Bank` varchar(50) NOT NULL,
  `Account_number` varchar(50) NOT NULL,
  `Account_name` varchar(50) NOT NULL,
  `Nick_name` varchar(50) NOT NULL,
  `Phone_number` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payees`
--

INSERT INTO `payees` (`user_nic`, `Bank`, `Account_number`, `Account_name`, `Nick_name`, `Phone_number`, `Email`) VALUES
('2004274005', 'C', '100101', 'Ashen Nirmal', 'Ashen', '0703620555', 'ashen@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `user_register`
--

CREATE TABLE `user_register` (
  `user_nic` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `full_name` varchar(50) DEFAULT NULL,
  `date_of_birth` varchar(50) DEFAULT NULL,
  `update_date` varchar(50) DEFAULT NULL,
  `Tel1` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Account_number` int(11) NOT NULL,
  `date_time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_register`
--

INSERT INTO `user_register` (`user_nic`, `password`, `email`, `full_name`, `date_of_birth`, `update_date`, `Tel1`, `Address`, `Account_number`, `date_time`) VALUES
('2004274005', '2525', 'nadun@exampel.gmail.com', 'N N N C Nadun Harshana', '2004/09/30', '24-11-2023 01:14:32', '0711122240', 'Srilanka 50000', 1, '24-11-2023 00:39:13');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_register`
--
ALTER TABLE `user_register`
  ADD PRIMARY KEY (`Account_number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_register`
--
ALTER TABLE `user_register`
  MODIFY `Account_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
