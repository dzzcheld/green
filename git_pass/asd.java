package get_0630;

import java.util.*;

public class asd {

	public static void main(String[] args) {
		
		int []num=new int[5];
		Random rand=new Random();
		
		for(int t=0; t<num.length; t++) {
			int ra=rand.nextInt(50)+1;
			num[t]=ra;
			System.out.println(num[t]);
		}
		
		System.out.println("``````````````````````````````````````");
			
		
	
		
		int blank = 0;
		int i = 0;
		int max=0;
		
			for(int k=1; k<num.length; k++) {
			for (i = 1; i < num.length ; i++) {
				if (num[i - 1] > num[i]) {
					blank = num[i];
					num[i] = num[i - 1];
					num[i - 1] = blank;
					
				}
				max=num[num.length-k];
				
		}
			
			}

		
		for (int k = 0; k < num.length; k++) {
			System.out.println(num[k]);
		}

		
		
		
		
		
		

		
		
		
	}

}


/*
 * blank = num[num.length - k];
				num[num.length - k] = num[num.length - k - 1];
				num[num.length - k - 1] = blank;
				continue;
 * 
 * 
 * */
