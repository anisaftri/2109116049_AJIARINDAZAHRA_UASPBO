-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2022 at 09:52 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `babydaycare2`
--

-- --------------------------------------------------------

--
-- Table structure for table `bayi`
--

CREATE TABLE `bayi` (
  `id_penitipan` int(11) NOT NULL,
  `nama_bayi` varchar(30) NOT NULL,
  `umur_bayi` varchar(20) DEFAULT NULL,
  `nama_ortu` varchar(30) NOT NULL,
  `alergi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bayi`
--

INSERT INTO `bayi` (`id_penitipan`, `nama_bayi`, `umur_bayi`, `nama_ortu`, `alergi`) VALUES
(1, 'Rayyanza', '1 tahun', 'Celine Syah', 'Tidak ada alergi'),
(2, 'Julian', '8 bulan', 'Marisya caca', 'Alergi dingin'),
(3, 'Victor', '6 bulan', 'Joni Amber', 'Tidak ada alergi'),
(4, 'Bryan', '7 bulan', 'Omar Ardiansyah', 'Alergi susu kambing'),
(5, 'El Barack', '2 tahun', 'Marshanda', 'Alergi seafood'),
(6, 'Navasya', '5 bulan', 'Ardhito Pramono', 'Alergi susu sapi'),
(7, 'Tobby', '8 bulan', 'Bambang', 'Alergi bulu kucing'),
(8, 'Sisca', '1 tahun', 'Keisya Farasya', 'Tidak ada alergi'),
(9, 'Moana', '6 bulan', 'Ratu Purnama', 'Tidak ada alergi'),
(10, 'Felix', '1 tahun', 'Friandany', 'Tidak ada alergi');

-- --------------------------------------------------------

--
-- Table structure for table `data_alergi`
--

CREATE TABLE `data_alergi` (
  `Nama_alergi` varchar(50) DEFAULT NULL,
  `Cara_penanganan` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_alergi`
--

INSERT INTO `data_alergi` (`Nama_alergi`, `Cara_penanganan`) VALUES
('Alergi susu sapi', 'Berikan susu ASI yang sudah di sediakan orangtua'),
('Alergi susu kambing', 'Berikan susu formula'),
('Alergi dingin', 'Hindari ruangan ber-AC'),
('Alergi seafood', 'Hindari makanan mengandung seafood'),
('Alergi bulu kucing', 'Jauhi bayi dari kucing');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `Paket` varchar(50) DEFAULT NULL,
  `Harga` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`Paket`, `Harga`) VALUES
('Paket Harian', 'Rp.200.000'),
('Paket Setengah Hari', 'Rp.100.000'),
('Paket Seminggu untuk seharian', 'Rp.1.300.000'),
('Paket Seminggu untuk setengah hari', 'Rp.600.000');

-- --------------------------------------------------------

--
-- Table structure for table `parent`
--

CREATE TABLE `parent` (
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `gender` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parent`
--

INSERT INTO `parent` (`nama`, `alamat`, `gender`) VALUES
('Celine Syah', 'Jl. Pahlawan No. 22', 'Perempuan'),
('Marisya Caca', 'Jl. Gatot Subroto No. 10', 'Perempuan'),
('Joni Amber', 'Jl. Merpati No. 5', 'Laki-Laki'),
('Oemar Ardiansyah', 'Jl. Biola No. 24', 'Laki-Laki'),
('Marshanda', 'Jl. Kenanga No. 1', 'Perempuan'),
('Ardhito Pramono', 'Jl. Mawar No. 22', 'Laki-Laki'),
('Bambang', 'Jl. Ahmad Yani No. 15', 'Laki-Laki'),
('Keisya Farasya', 'Jl. Abdul Hasan No. 30', 'Perempuan'),
('Ratu Purnama', 'Jl. Sungai Kunjang No. 7', 'Perempuan'),
('Friandany', 'Jl. Soetomo No. 3', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `suster`
--

CREATE TABLE `suster` (
  `nama` varchar(30) NOT NULL,
  `umur` varchar(20) DEFAULT NULL,
  `alamat` varchar(50) NOT NULL,
  `lama_kerja` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suster`
--

INSERT INTO `suster` (`nama`, `umur`, `alamat`, `lama_kerja`) VALUES
('Dewi Safitri', '24 tahun', 'Jl. KH. Abdurrahman No. 23', '6 jam'),
('Puspita Sari', '30 tahun', 'Jl. Pahlawan No. 1', '3 jam'),
('Ratna Puspita', '22 tahun', 'Jl. Sungai Dama No. 15', '4 jam'),
('Putri Indriani', '25 tahun', 'Jl. Langsat No. 70', '8 jam'),
('Nadira Amalia', '22 tahun', 'Jl. Piano No. 22', '7 jam');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('arind', '123'),
('yaya', '123'),
('wilda', '123'),
('arind', '123'),
('yaya', '123'),
('wilda', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bayi`
--
ALTER TABLE `bayi`
  ADD PRIMARY KEY (`id_penitipan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bayi`
--
ALTER TABLE `bayi`
  MODIFY `id_penitipan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
