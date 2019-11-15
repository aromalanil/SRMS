-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2019 at 05:10 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `srms`
--

-- --------------------------------------------------------

--
-- Table structure for table `head`
--

CREATE TABLE `head` (
  `id` int(11) NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `class` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `head`
--

INSERT INTO `head` (`id`, `name`, `class`) VALUES
(201, 'Janu Panicker', 'S5 CS B'),
(202, 'Manju K', 'S5 CS A');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `category`) VALUES
(1, 'abhijith', 'abhijith', 'student'),
(2, 'abraham', 'abraham', 'student'),
(3, 'ebin', 'ebin', 'student'),
(4, 'aromal', 'aromal', 'student'),
(5, 'goutham', 'goutham', 'student'),
(6, 'aparna', 'aparna', 'student'),
(7, 'vishnu', 'vishnu', 'student'),
(101, 'jisy', 'jisy', 'teacher'),
(102, 'santhi', 'santhi', 'teacher'),
(201, 'janu', 'janu', 'head'),
(202, 'manju', 'manju', 'head');

-- --------------------------------------------------------

--
-- Table structure for table `main`
--

CREATE TABLE `main` (
  `id` int(11) NOT NULL,
  `rollno` int(11) NOT NULL,
  `name` varchar(15) NOT NULL,
  `class` varchar(10) NOT NULL,
  `subject` varchar(15) NOT NULL,
  `teacher` varchar(15) NOT NULL,
  `internal1` int(11) NOT NULL,
  `internal2` int(11) NOT NULL,
  `totalclass` int(11) NOT NULL,
  `attendedclass` int(11) NOT NULL,
  `attendance` decimal(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `main`
--

INSERT INTO `main` (`id`, `rollno`, `name`, `class`, `subject`, `teacher`, `internal1`, `internal2`, `totalclass`, `attendedclass`, `attendance`) VALUES
(2, 1, 'Abhijith KD', 'S5 CS B', 'DBMS', 'jisy', 0, 0, 0, 0, '0'),
(3, 1, 'Abhijith KD', 'S5 CS B', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(4, 2, 'Abraham NT', 'S5 CS B', 'DBMS', 'jisy', 0, 0, 0, 0, '0'),
(5, 2, 'Abraham NT', 'S5 CS B', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(6, 1, 'Ebin Johny', 'S5 CS A', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(7, 1, 'Ebin Johny', 'S5 CS A', 'DBMS', 'jisy', 1, 0, 0, 0, '0'),
(8, 2, 'Aromal Anil', 'S5 CS A', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(9, 2, 'Aromal Anil', 'S5 CS A', 'DBMS', 'jisy', 0, 0, 0, 0, '0'),
(10, 13, 'Goutham K.G', 'S5 CS B', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(11, 13, 'Goutham K.G', 'S5 CS B', 'DBMS', 'jisy', 0, 0, 0, 0, '0'),
(12, 8, 'Aparna T.S', 'S5 CS B', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(13, 8, 'Aparna T.S', 'S5 CS B', 'DBMS', 'jisy', 0, 0, 0, 0, '0'),
(14, 36, 'Vishnu V', 'S5 CS A', 'Java', 'santhi', 0, 0, 0, 0, '0'),
(15, 36, 'Vishnu V', 'S5 CS A', 'DBMS', 'jisy', 0, 0, 0, 0, '0');

-- --------------------------------------------------------

--
-- Table structure for table `s5csb`
--

CREATE TABLE `s5csb` (
  `id` int(11) NOT NULL,
  `maths_internal1` int(11) NOT NULL,
  `maths_internal2` int(11) NOT NULL,
  `maths_attendance` int(11) NOT NULL,
  `computer_internal1` int(11) NOT NULL,
  `computer_internal2` int(11) NOT NULL,
  `computer_attendance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `s5csb`
--

INSERT INTO `s5csb` (`id`, `maths_internal1`, `maths_internal2`, `maths_attendance`, `computer_internal1`, `computer_internal2`, `computer_attendance`) VALUES
(2, 45, 42, 98, 50, 49, 100);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `NAME` varchar(15) DEFAULT NULL,
  `CLASS` varchar(10) DEFAULT NULL,
  `RollNo` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `guardian` varchar(20) NOT NULL,
  `dob` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `NAME`, `CLASS`, `RollNo`, `email`, `guardian`, `dob`) VALUES
(1, 'Abhijith KD', 'S5 CS B', 1, 'abhijith@gmail.com', 'Dileep', '1999-03-24'),
(2, 'Abraham NT', 'S5 CS B', 2, 'abraham@gmail.com', 'abraham_guardian', '1999-11-08'),
(3, 'Ebin Johny', 'S5 CS A', 1, 'ebin@gmail.com', 'Senchonese', '1999-07-01'),
(4, 'Aromal Anil', 'S5 CS A', 2, 'aromal@gmail.com', 'Anil', '1999-02-10'),
(5, 'Goutham K.G', 'S5 CS B', 13, 'goutham@yahoo.com', 'Giri', '1999-05-16'),
(6, 'Aparna T.S', 'S5 CS B', 8, 'aparna@gmail.com', 'Sivan', '1999-09-20'),
(7, 'Vishnu V', 'S5 CS A', 36, 'vishnu32@gmail.com', 'Vishvambharan', '1999-02-08');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`) VALUES
(101, 'Jisy Raju'),
(102, 'Santhi Krishna');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `head`
--
ALTER TABLE `head`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `main`
--
ALTER TABLE `main`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `main`
--
ALTER TABLE `main`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
