package get_0617;

public class test_1 {

	public static void main(String[] args) {
		
		String a="100";
		String b="200";
		
		int ia=Integer.parseInt("100");
		int ib=Integer.parseInt("200");
		
		System.out.printf("%d * %d = %d", ia, ib, (ia*ib)); 
	}

}
/*
 * 문제1]
String a = "100";
String b = "200";
a 와  b의 값을 형변환해서 두수의 곱을 구하시오

--출력--
100 * 200 = 20000 
출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]

=========================================================================
두 변수를 정수형으로 변경한다
(형변환)

연산하여 저장 혹은 출력하기

=========================================================================
=>
String 형태를 int 형태를 바꿀떄는
Integer.parseInt()를 사용한다
parseInt() 
String타입의 숫자를 int 타입으로 변환해준다.
Integer 클래스의 static 함수다

static 변수
-동일한 이름의 객체(메모리 할당)를 생성하면 그 만큼 메모리가 중복된다.
 이러한 경우에 static을 사용하여 여러 객체가 하나의 메모리를 참조하도록 하면
 메모리 효율이 높아진다.
-일반적으로 static은 상수의 값을 갖는 경우가 많아서 
 public static final 으로 선언하여 사용한다.
 
static 메소드
-격체의 생성 없이 호출이 가능하다.
-주로 여러 번 사용되는 유틸리티 관련 메소드를 구현 하는게 적합하다.
-static 메소드에서 접근하기 위한 변ㅅ후는 반드시 static 변수로 선언되어야 한다. 
 (할당되지 않은 메모리 영역에 접근 하므로)
 


형식지정자는 printf("형식지정", 값);
 * 
 */
