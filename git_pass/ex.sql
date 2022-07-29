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


-- shopdb 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `shopdb`;
CREATE DATABASE IF NOT EXISTS `shopdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `shopdb`;

-- 테이블 shopdb.deletedmembertbl 구조 내보내기
DROP TABLE IF EXISTS `deletedmembertbl`;
CREATE TABLE IF NOT EXISTS `deletedmembertbl` (
  `memberID` char(8) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `memberName` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `memberAddress` char(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `deletedDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 shopdb.indextbl 구조 내보내기
DROP TABLE IF EXISTS `indextbl`;
CREATE TABLE IF NOT EXISTS `indextbl` (
  `first_name` varchar(14) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_name` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  KEY `idx_indexTBL_firstname` (`first_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 shopdb.membertbl 구조 내보내기
DROP TABLE IF EXISTS `membertbl`;
CREATE TABLE IF NOT EXISTS `membertbl` (
  `memberID` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `memberName` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `memberAddress` char(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`memberID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 테이블 shopdb.producttbl 구조 내보내기
DROP TABLE IF EXISTS `producttbl`;
CREATE TABLE IF NOT EXISTS `producttbl` (
  `productName` char(4) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cost` int(11) NOT NULL DEFAULT 0,
  `makeDate` date DEFAULT '0000-00-00',
  `company` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`productName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 내보낼 데이터가 선택되어 있지 않습니다.

-- 프로시저 shopdb.proses 구조 내보내기
DROP PROCEDURE IF EXISTS `proses`;
DELIMITER //
CREATE PROCEDURE `proses`()
BEGIN
SELECT * FROM membertbl WHERE memberID='Dang';
SELECT * FROM producttbl WHERE productname='냉장고';
END//
DELIMITER ;

-- 뷰 shopdb.uv_membertbl 구조 내보내기
DROP VIEW IF EXISTS `uv_membertbl`;
-- VIEW 종속성 오류를 극복하기 위해 임시 테이블을 생성합니다.
CREATE TABLE `uv_membertbl` (
	`membername` CHAR(5) NOT NULL COLLATE 'utf8mb4_unicode_ci',
	`memberAddress` CHAR(20) NULL COLLATE 'utf8mb4_unicode_ci'
) ENGINE=MyISAM;

-- 트리거 shopdb.trg_DeletedMemberTBL 구조 내보내기
DROP TRIGGER IF EXISTS `trg_DeletedMemberTBL`;
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `trg_DeletedMemberTBL` AFTER DELETE ON `membertbl` FOR EACH ROW BEGIN

INSERT INTO deletedmembertbl VALUES (OLD.memberID, OLD.memberName, OLD.memberAddress, CURDATE() );  

END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 뷰 shopdb.uv_membertbl 구조 내보내기
DROP VIEW IF EXISTS `uv_membertbl`;
-- 임시 테이블을 제거하고 최종 VIEW 구조를 생성
DROP TABLE IF EXISTS `uv_membertbl`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `uv_membertbl` AS SELECT membername, memberAddress FROM membertbl ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
