package git_root;

class Test28{
	double base=5.0;
	double height=3.5;
	//넓이
	double getArea(){
	return (base*height)/2;
	}
	//빗변
	double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	//둘레
	double getPeromerter() {
		return base + height + Math.sqrt(base*base+height*height);
	}
	
}


public class Ex_28 {

	public static void main(String[] args) {
		 
		Test28 ob=new Test28();
		System.out.println("삼각형의 넓이:"+ob.getArea());
		System.out.println("빗변길이:"+ob.getHypotenuse());
		System.out.println("둘레길이:"+ob.getPeromerter());
		

	}

}


/*ob 객체 생성
 * 
 *Test 28 클래스(필드. 메소드 생성)
 *빗변, 둘레, 
 *
 *
 * ==========================================================================
 * [문제28]다음을 수정/완성하시오
(1)클래스명:Test28
     필드명 : -base:double  (초기값:5.0)
                 -height:double (초기값:3.5)
     메서드명: +getArea():double
                   +getHypotenuse():double 
                   +getPerimeter():double
(2)조건
   1)공  식 : 삼각형의 넓이 = (밑변 * 높이) /2
                빗변길이 = Math.sqrt(밑변*밑변+높이*높이)  
                둘레길이 = 밑변 + 높이 + 빗변길이 
   2) Test28로 객체 ob를 생성한다
   3) getArea()는 삼각형의 넓이를 리턴한다
       getHypotenuse() 빗변의 길이를 리턴한다
       getPerimeter()는 둘레길이를 리턴한다 

[출력화면]
삼각형의넓이 : 8.75
빗변길이 : 6.10
둘레길이 : 14.60
출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 * 
 */