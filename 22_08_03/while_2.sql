DROP PROCEDURE IF EXISTS whileProc2;
-----구문 시작
DELIMITER //

/*Proc 생성, 변수 초기화 선언
i는 반복문 횟수, hap은 i의 누적 값*/
CREATE PROCEDURE whileProc2()
BEGIN 
	DECLARE i INT;
	DECLARE hap INT;
	SET i= 1;
	SET hap =0;

/* 
i가 7의 배수면 
 */	
	myWhile: WHILE (i<=100) DO
IF (i%7=0) THEN
SET i=i+1;
ITERATE myWhile;
END IF;

		SET hap=hap+i;
		IF(hap>1000) THEN
LEAVE myWhile;
END IF;

		SET i= i+1;
	END WHILE;
	
	SELECT hap;
END //

CALL whileProc2()
