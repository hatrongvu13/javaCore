-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 28, 2019 lúc 07:24 AM
-- Phiên bản máy phục vụ: 10.3.16-MariaDB
-- Phiên bản PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysanpham`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbnhomsanpham`
--

CREATE TABLE `tbnhomsanpham` (
  `manhom` int(11) NOT NULL,
  `tennhom` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbnhomsanpham`
--

INSERT INTO `tbnhomsanpham` (`manhom`, `tennhom`) VALUES
(1, 'Hoa Đà Lạt'),
(2, 'Hoa Sinh Nhật'),
(3, 'Hoa cưới\r\n');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbsanpham`
--

CREATE TABLE `tbsanpham` (
  `MaSP` int(11) NOT NULL,
  `TenSP` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `HinhanhSP` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `GioithieuSP` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `GiaSP` int(11) NOT NULL,
  `manhom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbsanpham`
--

INSERT INTO `tbsanpham` (`MaSP`, `TenSP`, `HinhanhSP`, `GioithieuSP`, `GiaSP`, `manhom`) VALUES
(1, 'asdada', 'asda', 'asd', 1, 2),
(4, 'hoa 1', 'img.png', 'somgeadscasdc', 4000, 2),
(6, 'hoa 2', 'khoog cos gif ', 'asdfa', 4000, 2),
(7, 'hoa 6', 'khoog cos gif ', 'asdfa', 4000, 2),
(8, 'hoa 3', 'khoog cos gif ', 'asdfa', 4000, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbtaikhoan`
--

CREATE TABLE `tbtaikhoan` (
  `user` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbtaikhoan`
--

INSERT INTO `tbtaikhoan` (`user`, `password`) VALUES
('admin', 'admin'),
('nhanvien', 'nhanvien');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tbnhomsanpham`
--
ALTER TABLE `tbnhomsanpham`
  ADD PRIMARY KEY (`manhom`),
  ADD UNIQUE KEY `index_name` (`manhom`);

--
-- Chỉ mục cho bảng `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`MaSP`),
  ADD KEY `manhom` (`manhom`);

--
-- Chỉ mục cho bảng `tbtaikhoan`
--
ALTER TABLE `tbtaikhoan`
  ADD PRIMARY KEY (`user`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `MaSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD CONSTRAINT `tbsanpham_ibfk_1` FOREIGN KEY (`manhom`) REFERENCES `tbnhomsanpham` (`manhom`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
