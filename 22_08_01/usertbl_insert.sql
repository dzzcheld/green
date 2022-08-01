DROP TABLE IF EXISTS `last_insert_id_table`;

/*테이블 생성
  id, col 값 선언 및 기본키 선언*/
CREATE TABLE `last_insert_id_table`(
`id` INT(11) NOT NULL AUTO_INCREMENT, 
`col` VARCHAR(10) COLLATE UTF8MB4_UNICODE_CI DEFAULT NULL,
PRIMARY KEY(`id`)

/*자동으로 1부터 증가하는 값, 숫자만 가능함*/
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=UTF8MB4_UNICODE_CI;

/*col 값에 데이터를 입력해준다, 메서드*/
INSERT INTO last_insert_id_table(col)
VALUES('1row'),('2row'),('3row');


SELECT * FROM LAST_INSERT_ID_TABLE;

SELECT LAST_INSERT_ID();
/*
SELECT LAST_INSERT_ID()
사용하면 마지막에 입력된 값 출력
*/
