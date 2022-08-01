USE sqlDB;
CREATE TABLE bigTBL1(SELECT * FROM employees.employees);
CREATE TABLE bigTBL2(SELECT * FROM employees.employees);
CREATE TABLE bigTBL3(SELECT * FROM employees.employees);

DELETE FROM bigtbl1;
DROP TABLE bigtbl2;
TRUNCATE bigtbl3;

/*
삭제(중요하다)

DELETE

내용만 제거하고 싶을 때 사용한다(데이터 삭제)

DROP

완전 삭제를 하고 싶을 때 사용한다(테이블 완전 삭제)

TRUNCATE

일부분의 메타파일을 남겨준다(테이블 완전 삭제)
*/