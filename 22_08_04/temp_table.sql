/*임시 테이블 생성 및 변수 선언*/
USE employees;
CREATE TEMPORARY TABLE IF NOT EXISTS tempTBL (id INT, NAME CHAR(7));
CREATE TEMPORARY TABLE IF NOT EXISTS employees (id INT, NAME CHAR(7));
DESCRIBE tempTBL;
DESCRIBE employees;

/*데이터 저장*/
INSERT INTO tempTBL VALUES (1, 'This');
INSERT INTO employees VALUES (2, 'MariaDB');
SELECT * FROM tempTBL;
SELECT * FROM employees;

USE employees;
SELECT * FROM tempTBL;
SELECT * FROM employees;

DROP TABLE tempTBL;

USE employees;
SELECT * FROM employees;