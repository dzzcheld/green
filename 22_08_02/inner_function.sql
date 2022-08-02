/*
 	문자열의 왼쪽/오른쪽 공백 제거
*/
SELECT LTRIM(	'hee'	), RTRIM(	'hee'	);
/*
	문자열의 공백 제거
*/
SELECT TRIM(' a  ');

/*
문자열을 반복한다
해당 문자열을 바꿔준다
해당 문자열을 거꾸로 출력한다
*/
SELECT REPEAT('abc', 2);
SELECT REPLACE('abd fff', 'abd', 'ttt');
SELECT REVERSE('asdl');

/*
길이만큼 공백 반환
시작 위치부터 길이만큼 문자 반환
*/
SELECT SPACE(5);
SELECT SUBSTRING('123456', 3,4);

/*올림, 내림, 반올림
	슷자 10을, 원래 진수에서(10), 2진수로 변환
*/
SELECT CEILING(3.5), FLOOR(3.5), ROUND(3.5);
SELECT CONV(10, 10, 2);  

/*
	1부터 9 미만의 난수
	( RAND()*(n-m) )을 사용
*/
SELECT FLOOR(1+(RAND() * (10-1)));

/*
소수점을 기준으로 왼쪽은 음수, 오른쪽은 양수 
정수 위치까지 구하고 나머지는 버린다
*/
SELECT TRUNCATE(12345.234589,2);
SELECT TRUNCATE(12345.234589,-2);

/*hh mm ss 를 더하고 뺴주는 기능이 있다*/
SELECT ADDTIME('2020-01-01 23:59:59', '1:1:1');
SELECT SUBTIME('2020-01-01 23:59:59', '1:1:1');