package java_jungsuk.chap04;

public class Ex04_03 {
	public static void main(String[] args) {
		
//		[4-3]1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int v = 0;
		int sum = 0;
		for(int i = 1; i <11; i ++) {
			v += i;
			sum += v;
		}
		System.out.println(sum);
	}	

}
