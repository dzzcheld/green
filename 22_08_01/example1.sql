-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.8-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- sqldb 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `sqldb`;
CREATE DATABASE IF NOT EXISTS `sqldb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `sqldb`;

-- 테이블 sqldb.usertbl 구조 내보내기
DROP TABLE IF EXISTS `usertbl`;
CREATE TABLE IF NOT EXISTS `usertbl` (
  `userID` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `userName` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `birthYear` int(10) NOT NULL,
  `addr` char(2) COLLATE utf8mb4_unicode_ci NOT NULLsqldb,
  `mobile1` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mobile2` char(8) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `height` smallint(5) DEFAULT NULL,
  `mDate` date DEFAULT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
