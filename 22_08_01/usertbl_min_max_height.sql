SELECT userName, height 
FROM usertbl 
WHERE height=(SELECT MAX(height)FROM usertbl)
OR height=(SELECT MIN(height) FROM usertbl);