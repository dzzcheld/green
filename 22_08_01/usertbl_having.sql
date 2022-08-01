SELECT userID AS '사용자', SUM(price*amount) AS '총구매액'
FROM buytbl
GROUP BY userID
HAVING SUM(price*amount)>1000
ORDER BY SUM(price*amount);
/*
집계 함수  HAVING 은 WHERE 절에 나타 날 수 없음
GROUP BY 절 다음에 꼭 위치해야 함
*/