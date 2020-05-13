package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {

		int i =1;
		boolean flag = true;
		
		while(flag) {						//예상하는 값
			if(i>=5) {						//1
				flag = false;				//2
			}								//3
			System.out.println(i);			//4
			i=i+1;							//5
		}
	}

}
