USE sqldb;

SET @myVar1=5;
SET @myVar2=3;
SET @myVar3=4.25;
SET @myVar4='가수 이름==>';

/*@myVar1 출력*/
SELECT @myVar1;

/*myVar2, myVar3 의 합을 출력한다*/
SELECT @myVar2 + @myVar3;

/* myVar4 출력  */
SELECT @myVar4, userNamㅁe FROM usertbl WHERE height>180;