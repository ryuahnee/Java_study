package java_jungsuk.chap04;

public class Ex04_4 {
	public static void main(String[] args) {
		
//		[4-  4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int v = 0 ;
		int sum = 0;
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			int num = (i%2 == 0 )? -i : +i;
				v += num;
				sum = v;
		if(sum >= 100) {
			System.out.println(num);	
			break;
		}
		}
		
	}	//main

}
