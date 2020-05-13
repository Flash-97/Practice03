package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//변수
		int i;
		int r;
		int sum=0;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.println("숫자를 입력하세요");
		
		//입력
		i = sc.nextInt();
		
		//조건
		if (i%2==1) {
			for (r=1; r<=i; r= r+2) {
				sum = sum+r;
			}//for
			System.out.println("결과값: " + sum);
		}//if
		
		if (i%2==0) {
			for (r=0; r<=i; r= r+2) {
				sum = sum+r;
				
			}//for
			System.out.println("결과값: " + sum);
		}//if
		
		
		sc.close();
		
		
		
		
	}//main
 		
		
		
	
		
}


