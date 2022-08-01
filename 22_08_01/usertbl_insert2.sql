/*테이블 데이터 삭제*/
DROP TABLE IF EXISTS `last_insert_id_tabletwo`;

/*테이블 데이터 생성
  id, col , 기본키
*/
CREATE TABLE `last_insert_id_tabletwo`(
`id` INT(11) NOT NULL AUTO_INCREMENT, 
`col` VARCHAR(10) COLLATE UTF8MB4_UNICODE_CI DEFAULT NULL, 
PRIMARY KEY(`id`)

/*자동으로 1부터 증가하는 값 입력*/
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8MB4
COLLATE=UTF8MB4_UNICODE_CI;

/*last_insert_id_tabletwo 메서드에 매개변수 col을 넣고 호출*/
INSERT INTO last_insert_id_tabletwo(col)
VALUES('1row');
INSERT INTO last_insert_id_tabletwo(col)
VALUES('2row');
INSERT INTO last_insert_id_tabletwo(col)
VALUES('3row');

SELECT *FROM last_insert_id_tabletwo;
SELECT LAST_INSERT_ID();
