package java_jungsuk.chap04;

public class Ex04_15 {

	public static void main(String[] args) {
		
		int number = 12321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			for(int i =1; i < 100000; i=i*10) {
				result = result+(tmp%10)*i; 
				tmp = tmp/10;
			}
		}
		if(number == result) {
			System.out.println( number + " 는 회문수 입니다 .");
		}else {
			System.out.println( number + " 는 회문수가 아닙니다 .");
		}
		
	}//main

}
