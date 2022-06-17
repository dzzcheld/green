package get_0617;

public class Test_2 {

	public static void main(String[] args) {
		
	int money=65430;
	
	int i=0;
	
	int arr[]= {10000, 1000, 100, 10};
	

	
	while(true) {
		
		if(i<=arr.length) {
			
		int	a=money/arr[i];		//반복문이 돌 때마다 사라짐
			System.out.println( money+"나누기"+ arr[i] +"는" + a);
			
		int b=money%arr[i];
			System.out.println("나머지"+b);
			money=b;
			i++;
		}
	}
	
	}

}

/*
 * [문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
money = 65430원
만원 = 6
천원 = 5
백원 = 4
십원 = 3

출처: https://private.tistory.com/13 [공부해서 남 주자:티스토리]
 *
 * =====================================================================
 * <구상>
 *
 *65430/10000 => 6나옴, 
 *65430%10000 => 5430(계속 저장됨)
 *
 *whie(true)
 *	if(money==!0)
 *		print( money/[0])
 * 		momey%[0]
 * 		i++
 * 
 * money값이 반복문이 돌아갈 때마다 새로워짐
 * 반복문이 돌 때 마다 money값을 저장 시키면 된다
 * 
 * 
 * money를 arr[i]로 나누면
 * 65430 / 10000 인데 이게 while 지역변수 int a 에 저장.
 * i가 증가한다
 * 
 * 
 * 
 */
