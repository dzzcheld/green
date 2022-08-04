USE sqlDB;
DROP TRIGGER IF EXISTS backUserTbl_UpdateTrg;
DELIMITER //
CREATE TRIGGER backUserTBL_UpdateTrg
		AFTER UPDATE 
		ON userTBL
		FOR EACH ROW
BEGIN
	INSERT INTO backup_userTBL VALUES(OLD.userID, OLD.userName, OLD.birthYear, 
	                                  OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate, 
								             '수정', CURDATE(), CURRENT_USER()
												  );
END //

DELIMITER;

DROP TRIGGER IF EXISTS backuserTbl_DeleteTrg;
DROP TRIGGER IF EXISTS backUiserTbl_DeletrTrg;
DELIMITER \\
CREATE TRIGGER backuserTbl_DeleteTrg
		AFTER DELETE 
		ON userTbl
		FOR EACH ROW
BEGIN
		INSERT INTO backup_userTBL VALUES( OLD.userID, OLD.userName, OLD.birthYear, 
													  OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate, 
													  '삭제', CURDATE(), CURRENT_USER() );
END \\

UPDATE usertbl SET addr='대전' WHERE userID='KKJ';
DELETE FROM usertbl WHERE height >=177;

SELECT * FROM backup_usertbl;

TRUNCATE TABLE usertbl;

SELECT * FROM backup_usertbl:
	