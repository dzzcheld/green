/*
USE sqlDB;
CREATE TABLE stdTBL
( stdName VARCHAR(10) NOT NULL PRIMARY KEY,
addr CHAR(4) NOT NULL
);
CREATE TABLE clubTBL
( clubName VARCHAR(10) NOT NULL PRIMARY KEY,
roomNo CHAR(4) NOT NULL
);
CREATE TABLE stdclubTBL
( num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
stdName VARCHAR(10) NOT NULL,
clubName VARCHAR(10) NOT NULL, 
FOREIGN KEY(stdName) REFERENCES stdTBL(stdName),
FOREIGN KEY(clubName) REFERENCES clubTBL(clubName)
);

*/

/*
INSERT INTO stdTBL VALUES ('강호동', '경북'), ('김제동', '경남'),
('김용만', '서울'), ('이휘재', '경기'), ('박수홍', '서울');
INSERT INTO clubTBL VALUES ('수영', '101호'), ('바둑', '102호'),
('축구', '103호'), ('봉사', '104호');
INSERT INTO stdclubtbl VALUES (NULL, '강호동', '바둑'), (NULL,
'강호동', '축구'), (NULL, '김용만', '축구'), (NULL, '이휘재', '축구'),
(NULL, '이휘재', '봉사'), (NULL, '박수홍', '봉사');
*/

SELECT S.stdName, S.addr, C.clubName, C.roomNo
FROM stdtbl S
INNER JOIN stdclubtbl SC ON S.stdName=SC.stdName
INNER JOIN clubtbl C ON SC.clubName=C.clubName
ORDER BY S.stdName;