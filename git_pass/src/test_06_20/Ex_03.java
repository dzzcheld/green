package test_06_20;

public class Ex_03 {

	public static void main(String[] args) {
		
		int alpha=1500000;	// 기본금
		int editional=55000;
		double tax=alpha*0.1;
		double total=alpha+editional-tax;
		
		System.out.println("-----출력-----");
		System.out.println("실수령액 : " + String.format("%.0f", total) +"원");
	}

}


/*
 * [문제3] 급여명세서를 작성하시오
  조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
  조건2) 실수령액 = 기본급 + 시간수당 - 세금

	--출력--
	실수령액 : 1405000원

 *변수- 기본급, 수당, 세금, 실수령액 => 4개 필요 
 * int alpha, int eddional, double tax, double total
 * 
 * 
 * Math.round()
 * -반올림하여 가까운 int 로 리턴된다.
 * System.out.println("실수령액 : " + Math.round(total) +"원");
 * 
 * String.format()
 * -인자로 전달된 format 에 맞게 문자열을 만들어 리턴한다.
 * System.out.println("실수령액 : " + String.format("%.0f", total) +"원");
 */