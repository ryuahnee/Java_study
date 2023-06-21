package java_jungsuk.chap04;

public class Ex04_12 {

	public static void main(String[] args) {
		
		for(int i=0; i<=2; i++) {					//단구성
			for(int j = 1 ; j<=3; j++) {			//곱해지는 수 
				for(int k=2; k<=4; k++) {			//단 구성 첫 줄기준
					if(i==2 && k ==4) {break;}		// 10단은 출력하지 않는다.
					System.out.printf("%d*%d=%d\t",i*3+k,j,(i*3+k)*j);
					} 
				System.out.println();
				}
			System.out.println();
			}
		
	}//main
}
