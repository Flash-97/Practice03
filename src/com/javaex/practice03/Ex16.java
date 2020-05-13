package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int num;
		int i;
		int count=0; //개수
		int sum=0; //합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		num = sc.nextInt();
		
		for (i=1; i<=num; i++) {
			if(i%5==0) {
				count++; //5의배수 개수
				sum += i;
			}
		}
		System.out.println("5의배수의 개수: " + count);

		System.out.println("5의배수의 합: " + sum);
		
		
		
		
		
		sc.close();
	}
		
		
}


