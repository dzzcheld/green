package get_0630;

import java.util.Random;
import java.util.*;

public class Ex_26 {

	public static void main(String[] args) {
		
		
		
		
		
		
		int[] num = { 45, 23, 13, 50, 25 };
		int blank = 0;
		int i = 0;

		for (int k = 1; k < num.length - 1; k++) {

			for (i = 1; i < num.length - 1; i++) {
				if (num[i - 1] > num[i]) {
					blank = num[i];
					num[i] = num[i - 1];
					num[i - 1] = blank;
					continue;
				}
				blank = num[num.length - k];
				num[num.length - k] = num[num.length - k - 1];
				num[num.length - k - 1] = blank;
				continue;

			}
		}
		for (int k = 0; k < num.length; k++) {
			System.out.println(num[k]);
		}

	}

}
/*
 * Random.ran=new Random();
 * int num[] =(int)(ran*50)+1;
 * 
 * =============================================================================
 * ================== [문제26] 크기가 5인 정수형배열을 잡아 난수(1~50)를 저장하여 출력하시오
 * 
 * 
 * --출력--
 * 
 * [정렬전] num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25
 * 
 * [정렬후] num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
 * 
 * 합 = xx 출처: https://private.tistory.com/13 [오토봇팩토리:티스토리]
 * 
 */
