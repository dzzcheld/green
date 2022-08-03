DROP PROCEDURE IF EXISTS ifProc2;
USE employees;

/*DELIMITER; 문장을 구분하기 위해 사용함
*/
DELIMITER //

----테이블 생성 및 변수 선언부
CREATE PROCEDURE ifProc2()
BEGIN
DECLARE hireDATE DATE;
DECLARE CURDATE DATE;
DECLARE days INT;

/*hire_date 를 새로 만든 변수인 hireDATE 에 저장한다
  employees 데이터베이스의 employees 테이블에서
  emp_no 10001 인 hire_date
	=> employees 테이블에서 emp_no 가 10001인 hire_date를
	   hireDATE 변수에 저장한다  
*/
SELECT hire_date INTO hireDATE 
FROM employees.employees
WHERE emp_no=10001;

/*
현재 시간을 알 수 있는 구문
hireDATE와 현재시간의 차이를 days에 저장
*/
SET CURDATE = CURRENT_DATE();
SET days= DATEDIFF(CURDATE, hireDATE);

IF(days/365) >=5 THEN
	SELECT CONCAT('입사한지', days, '일이나 지났습니다. 축하합니다!');
ELSE
	SELECT CONCAT('입사한지', days, '일밖에 안되었네요. 열심히 일하세요');
END IF;
END //

CALL ifProc2();