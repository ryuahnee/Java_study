package java_jungsuk.chap04;

public class Ex04_09 {

	public static void main(String[] args) {
		/*
		 * [4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		 *  만일 문자열이 "12345" 라면 , ‘1+2+3+4+5’ 결과인 15를 출력이 출력되 어야 한다 (1)에 알맞은 코드를 넣으시오 . (1) .
		 */
		String str = "12345";

		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			sum += c-'0'; 					// ex.아스키코드표  '1'=49,'0'=48 
											// 49-48 = 1 
		}
		System.out.println("sum="+sum);
	}

}
