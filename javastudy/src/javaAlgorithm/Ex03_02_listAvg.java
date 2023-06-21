package javaAlgorithm;

public class Ex03_02_listAvg {

	public static void main(String[] args) {

//		모든점수 = 모든점수/m*100
	int[] A	= {30,60,80};
	int N 	= A.length;
	int sum = 0;
	int max = 0;
		
		for(int i = 0; i< A.length; i++) {
			if(A[i]> max) {
				max = A[i];
				sum= sum+ A[i];
			}
		}
		System.out.println((double)sum*100/max/N);
		
	}//main
}
