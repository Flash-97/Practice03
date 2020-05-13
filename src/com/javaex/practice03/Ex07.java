package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// 변수
		int num;
		int num1;
		int num2;

		// 스캐너
		Scanner sc = new Scanner(System.in);

		// 출력
		System.out.println("숫자를 입력하세요");
		// 입력
		num = sc.nextInt();

		// 조건
		for (num1 = 1; num1 <= num; num1++) {
			for (num2 = 1; num2 <= num1; num2++) {
				System.out.print(num1);
			}
			System.out.println(" ");

		} // 맨위 for문

		// 스캐너 닫기
		sc.close();

	} // main

}
