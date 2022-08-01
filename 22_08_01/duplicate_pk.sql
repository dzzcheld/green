/*
USE sqldb;

CREATE TABLE memberTBL (SELECT userID, userName, addr FROM usertbl
LIMIT 3);
ALTER TABLE memberTBL
ADD CONSTRAINT pk_memberTBL PRIMARY KEY(userID);

*/

/*
INSERT IGNORE INTO memberTBL VALUES ('KHD', '강후덜', '미국');
INSERT IGNORE INTO memberTBL VALUES ('LSM', '이상민', '서울');
INSERT IGNORE INTO memberTBL VALUES ('JSJ', '강후덜', '경기');

SELECT * FROM memberTBL;
*/

/*

INSERT IGNORE INTO memberTBL VALUES('LSM', '이상민', '서울');
INSERT IGNORE INTO memberTBL VALUES('KSK', '김성주', '경기');
*/

/* 이미 입력한 값이 존재한다면 아래 코드를 통해서 변경되게끔 한다
(기본키가 중복될 때 새로 삽입한 데이터로 내용이 변경되게 한다*/
INSERT IGNORE INTO memberTBL VALUES ('KHD', '강후덜', '미국')
ON DUPLICATE KEY UPDATE userNAME='강후덜', addr='미국';
INSERT IGNORE INTO memberTBL VALUES ('DJM', '동짜몽', '일본')
ON DUPLICATE KEY UPDATE userNAME='동짜몽', addr='일본';
SELECT * FROM memberTBL;