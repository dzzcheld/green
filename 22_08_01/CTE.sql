/*
각 지역볼로 가장 큰 키 뽑는 쿼리

SELECT addr, MAX(height)
FROM usertbl
GROUP BY addr; 
*/

/* 비재귀적 CTE
	CTE- DB객체가 아니라 쿼리문 살행 중에 메모리 상에서 잠시만 존재한다
	WITH- view와는 다르게 한 번 실행할 쿼리문에서 실행된다
	(동일 블록에 대해 반복적으로  SQL문을 사용하기 위함)
	*/
WITH cte_usertbl(addr,maxheight)
AS 
(SELECT addr, max(height) FROM usertbl GROUP BY addr)
SELECT AVG(maxheight*1.0) AS '각 지역별 최고키의 평균'

FROM cte_usertbl;
