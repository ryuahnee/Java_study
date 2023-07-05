package javaAlgorithm;

public class Ex03_p42 {

	public static void main(String[] args) {
		//구간의 합
	
		System.out.println("sum"+sum(2,5));		
		
	}
	
	public static int sum(int k, int j) {
		// s배열을 a보다 크게 만들어둔다
		int[] a= {15,13,10,7,3,12};
		int size = a.length;
		int[] s= new int[size+1];
		
		// 합배열 공식
		for(int i = 0; i<size; i++) {
			s[i+1] = s[i] + a[i];
		}
		//구간의 합 공식
		return s[j]-s[k-1];
	}

}
