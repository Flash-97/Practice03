package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//변수
		int num;
		int i;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.print("숫자를 입력하세요: ");
		
		//입력
		num = sc.nextInt();
		
		//조건 
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
		//기호 % 나누어진 나머지의 값
		
		
		
		
		sc.close();
	}
		
		
}


