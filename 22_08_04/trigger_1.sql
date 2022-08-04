USE sqlDB;
/*테이블 생성 및 데이터 저장*/
CREATE TABLE IF NOT EXISTS testTBL (id INT, txt VARCHAR(10));
INSERT INTO testTBL VALUES(1, '이엑스아이디');
INSERT INTO testTBL VALUES(2, '애프터스쿨');
INSERT INTO testTBL VALUES(3, '에이오에이');

/*testTrg 트리거가 있다면 지운다
구문시작 testTBL을 지우고 나면 testTrg 트리거를 만든다
msg 에 문자열 저장*/
DROP TRIGGER IF EXISTS testTrg;
DELIMITER //
	CREATE TRIGGER testTrg
	AFTER DELETE 
	ON testTBL
	FOR EACH ROW
BEGIN 
	SET @msg='가수 그룹이 삭제됨';
END //

/*  */
SET @msg='';
INSERT INTO testTBL VALUES(4,'나인뮤지스');
SELECT @msg;
UPDATE testTBL SET txt='에이핑크' WHERE id=3;
SELECT @msg;
DELETE FROM testTBL WHERE id=4;
SELECT @msg;

USE sqlDB;

CREATE TABLE backup_userTBL
( userID CHAR(8) NOT NULL PRIMARY KEY, 
   NAME  VARCHAR(10) NOT NULL, 
   birthyear  INT NOT NULL, 
   addr       CHAR(2) NOT NULL, 
   mobile1    CHAR(3), 
   mobile2    CHAR(8), 
   height	  SMALLINT, 
   mDate	     DATE, 
   modType    CHAR(2), 
   modDate    DATE, 
   modUser    VARCHAR(256)
);
