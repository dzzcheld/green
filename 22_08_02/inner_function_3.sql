/*한 번 구매할 때마다 평균 몇 개를 구매했는지 조회*/
USE sqlDB;
SELECT AVG(amount) AS '평균 구매 개수' FROM buytbl;

/*
userID 와 평균을 구한다(userID의 그룹으로)
*/
USE sqlDB;
SELECT userID, AVG(amount) AS'평균 구매 개수'  FROM buytbl
GROUP BY userID;

/*
키가 가장 큰 회원과 가장 작은 회원의 이름과 키 출력
*/
USE sqlDB;
SELECT userID, MAX(height), MIN(height) FROM usertbl;

/*
키가 가장 큰 사람과 가장 작은 사람들의 이름을 출력한다(이름별로)
*/
USE sqlDB;
SELECT userName, MAX(height), MIN(height)
FROM usertbl GROUP BY userName;

/**/
USE sqlDB;
SELECT userName,height
FROM usertbl
WHERE height=(SELECT MAX(height) FROM usertbl)
OR height=(SELECT MIN(height) FROM usertbl);


