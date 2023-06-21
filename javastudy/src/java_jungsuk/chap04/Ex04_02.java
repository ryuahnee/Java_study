package java_jungsuk.chap04;

public class Ex04_02 {

	public static void main(String[] args) {

		int sum = 0;
		boolean a = true;
//		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		for(int i =1; i <= 20 ; i++) {
			if(i%2 == 0 || i%3 == 0) {
				continue;
			}else {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
