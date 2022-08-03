/* 사용자 이름, mibole1 과 mobile2 를 합쳐서 전화번호라 칭한다
 usertbl로 부터 
 userName(포함하지 않는) usertbl 에서 mobile이 null인 유저 이름을
 =>
 사용자 이름과 mobile1, mobile2 를 합쳐서 전화번호라고 칭해서 출력
 usertbl 에서 mobile 1이 null 값인 userName 을 제외한 userName(mobile 1이 있는)을 출력한다*/
SELECT userName, CONCAT (mobile1, mobile2) AS '전화번호' 
FROM usertbl
WHERE userName NOT IN(SELECT userName FROM usertbl WHERE mobile1 IS NULL);

/*
usertbl 에서 mobile1 이 null인 userName 과 mobile1, mobile2를 합친 전화번호를 출력한다
*/
SELECT userName, concat(mobile1, mobile2) AS '전화번호' FROM usertbl
WHERE userName IN(SELECT userName FROM usertbl WHERE mobile1 IS NULL);