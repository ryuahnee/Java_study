package java_jungsuk.chap04;

public class Ex04_10 {

	public static void main(String[] args) {
		
		/*
		 * [4-10] int타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		 *  만일 변수 num이 12345 라면 , ‘1+2+3+4+5’ 결과인 15를 출력이 출력되 어야 한다 
		 *  (1)에 알맞은 코드를 넣으시오 .
		 */
		
		int num = 12345;
		int sum = 0;
		
		while(num!=0) {
			sum += num%10;				//1. 12345의 나머지 : 5 
			num = num/10;				//2. 12345의 뒷자리 제외 : 1234
		}
		System.out.println("sum="+sum);
		System.out.println("num="+num);
		
	}//main

}
