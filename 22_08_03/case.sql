USE sqlDB;

/*
SELECT U.userID, U.userName, SUM(price*amount)AS '총구매액',
	CASE 
		WHEN (SUM(price*amount)>=1500) THEN '최우수고객'
		WHEN (SUM(price*amount)>=1000) THEN '우수고객'
		WHEN (SUM(price*amount)>=1) THEN '일반고객'
		ELSE '유령고객'
	END AS '고객등급'
 FROM buyTBL B
 	RIGHT OUTER JOIN userTBL U
 		ON B.userID=U.userID
 GROUP BY U.userID, U.userName
 ORDER BY SUM(price*amount)DESC;
 */		


/*
 buyTBL 테이블에서 합계를 내림차순으로 하고 userID로 묶어서
 userID, SUM 을 출력해준다ㅣ
 */ 		
SELECT userID, SUM(price*amount) AS '총구매액'
FROM buyTBL
GROUP BY userID
ORDER BY SUM(price*amount) DESC;

/*
buyTBL의 userID, userTBL의 userName, SUM 을 출력한다
buytbl 과 userTBL의 교집합(userID)
userTBL의 userID를 buyTBL의 ID에 저장한다.
buytbl의 userID 와 userTBL의 userName으로 그룹화
합계는 내림치순으로 한다
=>
기준 테이블 buyTBL, 조인 테이블 userTBL에 해당하는 값이 모두 존재하는 경우


*/
SELECT B.userID, U.userName, SUM(price*amount)AS '총구매액'
FROM buyTBL B
	INNER JOIN userTBL U
		ON B.userID=U.userID
GROUP BY B.userID, U.userName
ORDER BY SUM(price*amount)DESC;

/*
userID, userName,SUM 출력

buyTBL에 userTBL을 붙인다, userID 값을



*/
SELECT B.userID, U.userName, SUM(price*amount)AS '총구매액'
FROM buyTBL B
	RIGHT OUTER JOIN userTBL U
		ON B.userID=U.userID
GROUP BY B.userID, U.userName
ORDER BY SUM(price*amount)DESC;

SELECT B.userID, U.userName, SUM(price*amount)AS '총구매액'
FROM buyTBL B
	RIGHT OUTER JOIN userTBL U
		ON B.userID=U.userID
GROUP BY B.userID, U.userName
ORDER BY SUM(price*amount)DESC;
