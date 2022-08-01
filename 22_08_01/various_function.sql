SELECT IF(100>200 , '참이다', '거짓이다');

/*
수식 1이 널이면 수식 1 반환, 
수식 1이 널이 아니면 수식 2 반환
*/
SELECT IFNULL (NULL,'널이군요'),
IFNULL(100,'널이군요');


/*수식 1과 수식 2가 같으면 null 반환
 다르면 수식 1 반환*/
SELECT NULLIF(100,100),
NULLIF(200,100);

/*
문자의 아스키 코드, 혹은 숫자의 아스키 코드 값에 해당하는 문자 돌려줌
*/
SELECT ASCII('A'), CHAR(65);

/*		bit 수 만큼 반환(24 / 믄자수 만큼 반환(3/	byte만큼 변환(3				*/
SELECT BIT_LENGTH('ABC'), CHAR_LENGTH('ABC'), LENGTH('ABC');

/*
SELECT CONCAT
문자열로 이어준다
SELECT CONCAT_WS
구분자 포함 문자를 이어준다
*/
SELECT CONCAT( '일','이', '삼');
SELECT CONCAT_WS('#', '일','이', '삼');

/* 10의 n-1 승 단위로 콤마 구분자 */
SELECT FORMAT(123456.123456,4);

SELECT INSTR('abc','a');
SELECT LOCATE('c','abc);