USE sqlDB;

CREATE TABLE pivotTest
(uName CHAR(3),
 season CHAR(2), 
 amount INT
 );


INSERT INTO pivotTest VALUES ('유재석', '겨울', 10);
INSERT INTO pivotTest VALUES ('강호동', '여름', 15);
INSERT INTO pivotTest VALUES ('유재석', '가을', 25);
INSERT INTO pivotTest VALUES ('유재석', '봄', 3);
INSERT INTO pivotTest VALUES ('유재석', '봄', 37);
INSERT INTO pivotTest VALUES ('강호동', '겨울', 40);
INSERT INTO pivotTest VALUES ('유재석', '여름', 14);
INSERT INTO pivotTest VALUES ('유재석', '겨울', 22);
INSERT INTO pivotTest VALUES ('강호동', '여름', 64);



USE sqlDB;
SELECT uName, SUM(CASE WHEN season='봄' THEN amount END) AS '봄',
SUM(CASE WHEN season='여름' THEN amount END) AS '여름', 
SUM(CASE WHEN season='가을' THEN amount END) AS '가을', 
SUM(CASE WHEN season='겨울' THEN amount END) AS '겨울'
FROM pirvotTest
GROUP BY uName
