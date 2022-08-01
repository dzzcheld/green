SELECT userID AS'사용자 아아디', AVG(amount) AS '평균 구매 개수'
FROM buytbl GROUP BY userID;