/* 번호 그이름, 합계출력
 	그룹이름으로 묶고결과를 집계해준다
*/
USE sqlDB;
SELECT num, groupName, SUM(price * amount) AS '비용'
FROM buytbl
GROUP BY groupName, num WITH ROLLUP;

/*
그룹 이름, 합계(as) 출력
그룹 이름 별로 결과를 집계해준다
*/
USE sqlDB;
SELECT groupName, SUM(price * amount) AS '비용'
FROM buytbl
GROUP BY groupName WITH ROLLUP;

