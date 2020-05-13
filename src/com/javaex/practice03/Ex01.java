package com.javaex.practice03;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("while문");
		int index = 0;
		while(index < 3) {
			System.out.println("index= " + index); //while문 index = 0, 1, 2
			index++;
		}
		System.out.println("for문");                
		for(int order=0; order<3; order++) {       //for문 order = 0, 1 ,2
			System.out.println("order= " + order);
		}
		
	}

}
