package java_jungsuk.chap04;

import java.math.MathContext;
import java.util.Random;

public class Ex04_07 {
	public static void main(String[] args) {
		
//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//		코드를 완성하라 (1)에 알맞은 코드를 넣으시오 .
		
			int value = ((int)Math.random()*7);
			System.out.println("value:"+value);
			
	}	
}
