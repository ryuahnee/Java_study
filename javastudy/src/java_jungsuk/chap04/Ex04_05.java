package java_jungsuk.chap04;

public class Ex04_05 {

	public static void main(String[] args) {
		
//		[4-5] 다음의 for문을 While문으로 변경하시오.
		
/*
 * 		for(int i=0; i<=10; i++) {
 * 			 for(int j=0; j<=i; j++)
 * 				 System.out.print("*");
 * 		System.out.println(); }
 */		
			System.out.println("---------------------");
			
			int i = 0;
			while(i<=10) {		
				int j = 0;		// 반복마다 j를 0으로 초기화 후 반복
				while(j<=i) {
					System.out.print("*");
					j++;
				}
				System.out.println("");
				i++;
			}
			
			
			
			
	}//main
}//class
