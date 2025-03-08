-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2025 at 01:36 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_password`, `u_email`, `u_type`, `u_status`) VALUES
(1, 'Ivan', 'Yonzon', 'userayban', '123456789!', 'ayban@gmail.com', 'Administrator', 'Active'),
(2, 'wasd', 'wasd', 'wasd', '12345678!', 'wasd@gmail.com', 'User', 'Pending'),
(3, 'christian', 'colinas', 'cowlens', '12345678', 'colins@gmail.com', 'Administrator', 'Active'),
(4, 'ivan', 'yonzon', 'gwapo', '12345678', 'ayben@gmail.com', 'User', 'Pending'),
(8, 'maby', 'autahay', 'mabsty', '123456789', 'mab@test.com', 'User', 'Pending'),
(9, 'wasdwa', 'dwasdwasd', 'wasdwasdwad', '12345678', '2asdadw@colina.com', 'User', 'Pending'),
(10, 'wasdwasd', 'wasdwasd', 'wasdwasdwasdwasd', '1234567890', 'was@gmail.com', 'User', 'Pending'),
(11, 'ivans', 'yonzonx', 'owshie', '12345678', 'ivans@gmail.com', 'User', 'Pending'),
(12, 'wasdw', 'wasdwasd', 'wasdwasdwa', '12345678', 'awasdwasdadsa@gmail.com', 'User', 'Pending'),
(13, 'wasdwad', 'wasdwasdw', 'wasdwasdasdawdas', '123456789', 'wasdw@gmail.com', 'User', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
