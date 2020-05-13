package com.javaex.practice03;

public class Ex09 {

	public static void main(String[] args) {

		int i;
		int r;
		
		for (i=1; i<=10; i++) {
			for (r=i; r<i+10; r++) {
				System.out.print(r + "\t");
			}
			System.out.println("");
		}
	}

}
