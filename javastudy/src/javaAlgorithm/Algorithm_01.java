package javaAlgorithm;

public class Algorithm_01 {

	public static void main(String[] args) {
		int[] array = {1,10,5,8,7,6,4,3,2,9};
		
		int index = 0;
		int temp = 0;
				
		for(int i = 0; i < array.length; i++) {
			int min = Integer.MAX_VALUE;
				for(int j = i ; j < 10; j++) {
					if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
				temp = array[i];
				array[i] = array[index];
				array[index] = temp;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d " , array[i]);
		}
		
		System.out.println();
		
//		for(int i = 0; i < num.length; i++) {
//				min = num[i];
//				if(max < num[i]) {
//				max = num[i];
//			}
//	}
//		System.out.println("최소값 :" + min );
//		System.out.println("최대값 :" + max );
		

	}//main

}

