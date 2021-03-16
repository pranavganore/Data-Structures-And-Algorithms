package com.pbg.RECURSION;

public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binaryString(4);
	}

	private static void binaryString(int n) {
		// 
//		String slate = new String();
		BS_Helper(" ", n);
	}

	private static void BS_Helper(String slate, int n) {
		
		if(n == 0)	System.out.println(slate);
		else {
			BS_Helper(slate+"0", n-1);
			BS_Helper(slate+"1", n-1);
		}
			
		
		
	}

}
