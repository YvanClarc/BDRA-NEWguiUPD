-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2025 at 05:06 PM
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
  `u_password` varchar(150) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_password`, `u_email`, `u_type`, `u_status`) VALUES
(1, 'Ivan', 'Yonzon', 'userayban', 'GCY0jXJxDW+CXq30UAmG4kXUysQo6L8XcNKiQMvLQSY=', 'ayban@gmail.com', 'Administrator', 'Active'),
(2, 'wasd', 'wasd', 'wasd', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'wasd@gmail.com', 'User', 'Pending'),
(3, 'christian', 'colinas', 'cowlens', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'colins@gmail.com', 'Administrator', 'Active'),
(4, 'ivan', 'yonzon', 'gwapo', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'ayben@gmail.com', 'User', 'Pending'),
(8, 'maby', 'autahay', 'mabsty', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'mab@test.com', 'User', 'Pending'),
(10, 'wasdwasd', 'wasdwasd', 'wasdwasdwasdwasd', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'was@gmail.com', 'User', 'Pending'),
(11, 'ivans', 'yonzonx', 'owshie', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'ivans@gmail.com', 'User', 'Pending'),
(13, 'wasdwad', 'wasdwasdw', 'wasdwasdasdawdas', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'wasdw@gmail.com', 'User', 'Pending'),
(14, 'ivansss', 'yonzons', 'gwapos', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'aybens@gmail.com', 'User', 'Pending'),
(15, 'colissa', 'taet', 'colissa@gmail.com', 'lduBlcQF84pxKjoK3ZMibrmInXThxVJnBsurgeNuVHc=', 'test@yahoo.com', 'User', 'Active'),
(16, 'avan', 'natingors', 'zoe', 'x3Xnt1ft5jDNCqERO9ECZhqziCnKUqZCKreChi8mhkY=', 'zoekei@gmail.com', 'Administrator', 'Active'),
(17, 'zoe', 'keisha', 'zkm', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'zkm@gmail.com', 'User', 'Active'),
(18, 'bago', 'bago', 'bago', '4pZJu0fpJKJ1kZG9A9jCJM7UDuOKnKeUkSCKkrQNu6M=', 'bago@gmai.com', 'User', 'Active');

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
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
