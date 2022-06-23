-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 10 Haz 2022, 08:49:04
-- Sunucu sürümü: 10.4.24-MariaDB
-- PHP Sürümü: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `okulservisotomasyonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `Admin_id` int(11) NOT NULL,
  `kullaniciAdi` text NOT NULL,
  `parola` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`Admin_id`, `kullaniciAdi`, `parola`) VALUES
(1, 'Admin', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `fatura`
--

CREATE TABLE `fatura` (
  `Fatura_id` int(11) NOT NULL,
  `personel_id` int(11) DEFAULT NULL,
  `Adi` text DEFAULT NULL,
  `soyadi` text DEFAULT NULL,
  `telefon` text DEFAULT NULL,
  `plaka` text DEFAULT NULL,
  `tarih` text DEFAULT NULL,
  `seri` varchar(10) DEFAULT NULL,
  `FaturaNo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `fatura`
--

INSERT INTO `fatura` (`Fatura_id`, `personel_id`, `Adi`, `soyadi`, `telefon`, `plaka`, `tarih`, `seri`, `FaturaNo`) VALUES
(27, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 14:20:55', '', ''),
(28, 37, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 14:24:22', '', ''),
(29, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 14:27:52', '', ''),
(30, 46, 'ahmet', 'demir', '321321321', '21asd21', '2022/06/01 14:27:59', '', ''),
(31, 46, 'ahmet', 'demir', '321321321', '21asd21', '2022/06/01 14:29:45', '', ''),
(32, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/01 14:31:09', '', ''),
(33, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/01 14:36:08', '', ''),
(34, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 14:38:48', '', ''),
(35, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/01 15:08:54', '', ''),
(36, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/01 15:08:54', '', ''),
(37, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/01 15:08:54', '', ''),
(38, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 15:11:50', '', ''),
(39, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 15:14:01', '', ''),
(40, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 15:16:01', '', ''),
(41, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/01 15:23:36', '', ''),
(42, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/01 15:26:22', '', ''),
(43, 37, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 15:27:24', '', ''),
(44, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/01 15:31:45', '', ''),
(45, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/01 15:34:20', '', ''),
(46, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/01 15:39:03', '', ''),
(47, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/01 15:40:29', '', ''),
(48, 37, 'nihat', 'baran', '231231', '35ukj46', '2022/06/02 12:58:46', '', ''),
(49, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/02 12:59:55', '', ''),
(50, 37, 'nihat', 'baran', '231231', '35ukj46', '2022/06/02 13:11:45', '21', '02'),
(51, 46, 'ahmet', 'demir', '321321321', '21asd21', '2022/06/02 13:12:42', '', ''),
(52, 40, 'nihat', 'baran', '231231', '35ukj46', '2022/06/06 10:44:37', '', ''),
(53, 22, 'ali', 'kaya', '21321', '21sad12', '2022/06/06 12:06:18', '', ''),
(54, 45, 'ayşe', 'kaya', '231231', '35ukj46', '2022/06/08 13:02:35', '', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `fatura_detay`
--

CREATE TABLE `fatura_detay` (
  `Fatura_Detay_ID` int(11) NOT NULL,
  `Fatura_id` int(11) DEFAULT NULL,
  `ogrenci_id` int(11) DEFAULT NULL,
  `DetayAd` text DEFAULT NULL,
  `DetaySoyad` text DEFAULT NULL,
  `DetayOkul` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `fatura_detay`
--

INSERT INTO `fatura_detay` (`Fatura_Detay_ID`, `Fatura_id`, `ogrenci_id`, `DetayAd`, `DetaySoyad`, `DetayOkul`) VALUES
(6, 40, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(7, 41, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(8, 42, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(9, 43, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(10, 44, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(11, 45, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(12, 45, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(13, 45, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(14, 45, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(15, 46, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(16, 46, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(17, 46, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(18, 46, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(19, 47, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(20, 47, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(21, 47, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(22, 47, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(23, 48, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(24, 48, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(25, 48, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(26, 49, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(27, 49, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(28, 50, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(29, 50, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(30, 52, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(31, 52, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(32, 52, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(33, 52, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(34, 52, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(35, 53, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(36, 53, 30, 'mehmet', 'duran', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(37, 53, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(38, 54, 29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi'),
(39, 54, 28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrencitanim`
--

CREATE TABLE `ogrencitanim` (
  `ogrenci_id` int(11) NOT NULL,
  `ogrenci_adi` text NOT NULL,
  `ogrenci_soyadi` text NOT NULL,
  `ogrOkul` varchar(100) DEFAULT NULL,
  `ogrenci_tel` text NOT NULL,
  `ogrenci_adres` text NOT NULL,
  `ogrenci_KayitTarih` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `ogrencitanim`
--

INSERT INTO `ogrencitanim` (`ogrenci_id`, `ogrenci_adi`, `ogrenci_soyadi`, `ogrOkul`, `ogrenci_tel`, `ogrenci_adres`, `ogrenci_KayitTarih`) VALUES
(28, 'Ali', 'kaya', 'Necip Fazıl KısaKürek Anadolu Lisesi', '3123123', 'sadsadsad	', '2020-05-21'),
(29, 'Ahmet', 'Yılmaz', 'Necip Fazıl KısaKürek Anadolu Lisesi', '31321', 'sadsadsad	', '2020-05-26'),
(33, 'Ayşe', 'Kaya', 'Ahmmedi Hani Anadolu Lisesi', '55555555', 'asasda', '2022-04-04');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `okultanim`
--

CREATE TABLE `okultanim` (
  `okul_id` int(11) NOT NULL,
  `okul_adi` text NOT NULL,
  `okul_BaslamaSaati` time NOT NULL,
  `okul_adres` text DEFAULT NULL,
  `DersBitisSaati` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `okultanim`
--

INSERT INTO `okultanim` (`okul_id`, `okul_adi`, `okul_BaslamaSaati`, `okul_adres`, `DersBitisSaati`) VALUES
(18, 'necip fazıl Kısakürek Anadolu Lisesi', '08:30:00', 'çiçek mahlesi lale sokak ', '14:00:00'),
(19, 'Türk telekom Meslek Lisesi', '08:30:00', 'Lale mah çiçek sokak', '14:30:00'),
(20, 'Ahmedi Hani Anadolu Lisesi', '12:30:00', 'lale mahallesi lale sokak', '16:30:00');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personeltanim`
--

CREATE TABLE `personeltanim` (
  `personel_id` int(11) NOT NULL,
  `personel_adi` text NOT NULL,
  `persone_soyadi` text NOT NULL,
  `personel_tel` text NOT NULL,
  `personel_adres` text NOT NULL,
  `personel_unvan` text NOT NULL,
  `personel_maas` text NOT NULL,
  `Arac_plaka` varchar(11) NOT NULL,
  `KayitTarihi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `personeltanim`
--

INSERT INTO `personeltanim` (`personel_id`, `personel_adi`, `persone_soyadi`, `personel_tel`, `personel_adres`, `personel_unvan`, `personel_maas`, `Arac_plaka`, `KayitTarihi`) VALUES
(22, 'ali', 'kaya', '21321', 'qcas	', 'asx', '23120', '21sad12', '18:02:2005'),
(37, 'nihat', 'baran', '231231', 'wdaw', 'yazılım', '5000', '35ukj46', '21:21:1222'),
(45, 'ayşe', 'kaya', '231231', 'wdaw', 'yazılım', '5000', '35ukj46', '21:21:2020'),
(46, 'ahmet', 'demir', '321321321', 'asdasd', 'şoför', '4500', '21asd21', '21:02:2019');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `velitanim`
--

CREATE TABLE `velitanim` (
  `veli_id` int(11) NOT NULL,
  `Baba_adi` text NOT NULL,
  `Anne_adi` text NOT NULL,
  `Baba_tel` varchar(15) NOT NULL,
  `Anne_tel` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `velitanim`
--

INSERT INTO `velitanim` (`veli_id`, `Baba_adi`, `Anne_adi`, `Baba_tel`, `Anne_tel`) VALUES
(2, 'fahri', '1231232', 'hacer', '312312'),
(3, 'ahmet', '3123', 'ayşe', '3123'),
(5, 'ali', '12312', 'ayşe', '1321');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_id`);

--
-- Tablo için indeksler `fatura`
--
ALTER TABLE `fatura`
  ADD PRIMARY KEY (`Fatura_id`);

--
-- Tablo için indeksler `fatura_detay`
--
ALTER TABLE `fatura_detay`
  ADD PRIMARY KEY (`Fatura_Detay_ID`);

--
-- Tablo için indeksler `ogrencitanim`
--
ALTER TABLE `ogrencitanim`
  ADD PRIMARY KEY (`ogrenci_id`);

--
-- Tablo için indeksler `okultanim`
--
ALTER TABLE `okultanim`
  ADD PRIMARY KEY (`okul_id`);

--
-- Tablo için indeksler `personeltanim`
--
ALTER TABLE `personeltanim`
  ADD PRIMARY KEY (`personel_id`);

--
-- Tablo için indeksler `velitanim`
--
ALTER TABLE `velitanim`
  ADD PRIMARY KEY (`veli_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `Admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `fatura`
--
ALTER TABLE `fatura`
  MODIFY `Fatura_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- Tablo için AUTO_INCREMENT değeri `fatura_detay`
--
ALTER TABLE `fatura_detay`
  MODIFY `Fatura_Detay_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- Tablo için AUTO_INCREMENT değeri `ogrencitanim`
--
ALTER TABLE `ogrencitanim`
  MODIFY `ogrenci_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Tablo için AUTO_INCREMENT değeri `okultanim`
--
ALTER TABLE `okultanim`
  MODIFY `okul_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Tablo için AUTO_INCREMENT değeri `personeltanim`
--
ALTER TABLE `personeltanim`
  MODIFY `personel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- Tablo için AUTO_INCREMENT değeri `velitanim`
--
ALTER TABLE `velitanim`
  MODIFY `veli_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
