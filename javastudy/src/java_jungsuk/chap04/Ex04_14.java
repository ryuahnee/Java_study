package java_jungsuk.chap04;

import java.util.Random;

public class Ex04_14 {
	public static void main(String[] args) {
		
			Random ran = new Random();
		
			// 1~100사이의 임의의 값을 얻어서  answer에 저장한다
			int answer = ran.nextInt(101);
			int input = 0; // 사용자입력을 저장할 공간
			int count = 0; // 시도횟수를 세기위한 변수
			
			// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
			java.util.Scanner s = new java.util.Scanner(System.in);
			
			System.out.println("answer: " +answer);
			do {
				count++;
				System.out.print("1 과 100 사이의 값을 입력하세요:"); 
				input = s.nextInt(); 
					if(answer == input) {
						System.out.println("맞췄습니다.\r\n" +"시도횟수는 "+count+"번 입니다 .");
						break;
					}else if(answer <= input) {
						System.out.println("더 작은 수를 입력하세요.");
					}else if(answer >= input) {
						System.out.println("더 큰 수를 입력하세요.");
					}else {
						System.out.println("값을 잘못 입력하셨습니다.");
					}
			} while(true); // 무한반복문
	}

}
