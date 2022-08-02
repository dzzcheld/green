/*
현재 연 월 일
현재 시간
현재 연 월 일 시간
*/
SELECT CURDATE(), CURTIME(), NOW(), SYSDATE();

/*
	연, 월, 일  시간, 분, 초
*/
SELECT YEAR('2022-05-12'),
MONTH('2022-5-12'),
DAY('2022-05-12'), 
HOUR('02:17:00'), 
MINUTE('02:17:00'),
SECOND('02:17:00');

/*연월일 , 시 분 초 만 추출함*/
SELECT DATE(NOW()), TIME(NOW());

/*두 날짜와 시간의 차이*/
SELECT DATEDIFF('2023-01-01', NOW()), 
TIMEDIFF('23:23:59', '12:11:10');

/*일요일을 시작으로 현재가 몇 번째 요일인지 알려준다
월, 365일 중 몇 째 날인지를 반환*/
SELECT DAYOFWEEK(CURDATE()),
MONTHNAME(CURDATE()), 
DAYOFYEAR(CURDATE());

/*
buytbl
*/
SELECT LAST_DAY('2020-05-01');
SELECT MAKEDATE(2020,32);


