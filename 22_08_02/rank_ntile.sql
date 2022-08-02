/*
DENSE_RANK()
같은 크기의 데이터는 같은 등수로 처리
*/
USE sqlDB;
SELECT DENSE_RANK() OVER(ORDER BY height DESC) "키큰순위",
userName, addr, height
FROM usertbl;

/*
RANK()
같은 등수에 N 명이면 직후는 건너뛰고 N 번쨰부터 시작한다
*/
USE sqlDB;
SELECT RANK() OVER(
ORDER BY height DESC) "키큰순위", userName, addr, height
FROM usertbl;

/*
데이터 크기 순으로 세운 뒤 그룹을 나눌 때 사용
*/
USE sqlDB;
SELECT NTILE(2) OVER(ORDER BY height DESC) 
"반번호", userName, addr, height
FROM userTBL;

/* 
데이터 크기 순으로 세운 뒤 그룹을 나눌 때 사용
*/
USE sqlDB;
SELECT NTILE(3) OVER(ORDER BY height DESC) 
"반번호", userName, addr, height
FROM usertbl;

USE sqlDB;
SELECT userName, addr, height AS "키",
height-(LEAD(height, 1) OVER(ORDER BY height DESC) )
AS "다음 사람과 키 차이"
FROM usertbl;
