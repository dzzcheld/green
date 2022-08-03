DROP PROCEDURE IF EXISTS whileProc;
DELIMITER $$
CREATE PROCEDURE whileProc()
BEGIN
/*변수 선언 및 초기화
  i는 반복문 횟수
  hap은 1~100까지의 합
*/
DECLARE i INT;
DECLARE hap INT;
	SET i=1;
	SET hap=0;

/*반복문 */
WHILE (i<=100) DO
SET hap=hap+i;
SET i=i+1;
END WHILE;

SELECT hap;
END $$

CALL whileProc();
