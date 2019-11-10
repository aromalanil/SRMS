-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2019 at 07:23 PM
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
(201, 'Janu Panicker', 'S5 CS B');

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
(201, 'janu', 'janu', 'head');

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
  `attendance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `main`
--

INSERT INTO `main` (`id`, `rollno`, `name`, `class`, `subject`, `teacher`, `internal1`, `internal2`, `attendance`) VALUES
(2, 1, 'Abhijith KD', 'S5 CS B', 'DBMS', 'jisy', 49, 48, 98),
(3, 1, 'Abhijith KD', 'S5 CS B', 'Java', 'santhi', 32, 34, 97),
(4, 2, 'Abraham NT', 'S5 CS B', 'DBMS', 'jisy', 25, 30, 97),
(5, 2, 'Abraham NT', 'S5 CS B', 'Java', 'santhi', 30, 32, 84),
(6, 1, 'Ebin Johny', 'S5 CS A', 'Java', 'santhi', 40, 36, 84),
(7, 1, 'Ebin Johny', 'S5 CS A', 'DBMS', 'jisy', 42, 46, 91),
(8, 2, 'Aromal Anil', 'S5 CS A', 'Java', 'santhi', 48, 47, 92),
(9, 2, 'Aromal Anil', 'S5 CS A', 'DBMS', 'jisy', 46, 49, 79),
(10, 13, 'Goutham K.G', 'S5 CS B', 'Java', 'santhi', 42, 45, 87),
(11, 13, 'Goutham K.G', 'S5 CS B', 'DBMS', 'jisy', 32, 38, 79),
(12, 8, 'Aparna T.S', 'S5 CS B', 'Java', 'santhi', 42, 46, 85),
(13, 8, 'Aparna T.S', 'S5 CS B', 'DBMS', 'jisy', 44, 45, 94),
(14, 36, 'Vishnu V', 'S5 CS A', 'Java', 'santhi', 27, 43, 92),
(15, 36, 'Vishnu V', 'S5 CS A', 'DBMS', 'santhi', 48, 41, 76);

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
  `name` varchar(15) DEFAULT NULL,
  `class` varchar(10) DEFAULT NULL,
  `rollno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `class`, `rollno`) VALUES
(1, 'Abhijith KD', 'S5 CS B', 1),
(2, 'Abraham NT', 'S5 CS B', 2),
(3, 'Ebin Johny', 'S5 CS A', 1),
(4, 'Aromal Anil', 'S5 CS A', 2),
(5, 'Goutham K.G', 'S5 CS B', 13),
(6, 'Aparna T.S', 'S5 CS B', 8),
(7, 'Vishnu V', 'S5 CS A', 36);

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
