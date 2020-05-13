package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//변수
		int i;
		int r;
		int sum=1;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.println("숫자를 입력하세요");
		
		//입력
		i = sc.nextInt();
		
		//조건
		for (r=i; r>=1; r--) {
			sum = sum*r;
			
			
		} //for
		System.out.println("결과값: " + sum);
		
		
		
		sc.close();
	}//main
		
	
}


