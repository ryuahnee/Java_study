
public class Ex05_05 {

	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			if(j != tmp) {
				tmp = j;
			for(int k = 0; k<ball3.length; k++) {
					ball3[k] = tmp;
					//
				}
			}
		}
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		
	}//main

}
