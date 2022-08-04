CREATE DATABASE IF NOT EXISTS compressDB;
USE compressDB;

/*
CREATE TABLE normalTBL(emp_no INT, first_name VARCHAR(14));
CREATE TABLE compressTBL(emp_no INT, first_name VARCHAR(14));
*/

RcompressdbOW_FORMAT=COMPRESSED;

/*
INSERT INTO normalTBL
		SELECT emp_no, first_name FROM employees.employees;
INSERT INTO compressTBL
		SELECT emp_no, first_name FROM employees.employees;
*/
SHOW TABLE STATUS FROM compressDB;

USE mysql;
/*
DROP DATABASE IF EXISTS compressDB;
*/	

/*
	같은 자료를 넣고도 용량의 차이가 있음을 알 수 있다.
*/