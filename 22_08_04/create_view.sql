USE tableDB;

CREATE VIEW v_userTBL                                                    
AS
	SELECT userid, NAME, addr FROM usertbl;
	
SELECT * FROM v_usertbl;