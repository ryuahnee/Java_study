package javaAlgorithm;

public class Ex03_01_list {

	public static void main(String[] args) {
		
		//String 값으로 받은 숫자를 더한값 
		String sNum= "10987654321";
		char[] cNum= sNum.toCharArray();
		int sum = 0;
		for(int i =0; i<cNum.length; i++) {
			sum = sum+(int)cNum[i]-'0';
		}
		System.out.println("sum:"+sum);
	}

}
