package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//변수
		int i;
		int num;
		int max=0;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.println("숫자를 입력하세요");
		
		//조건
		for (i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			
			if (num>max) {
				max=num;
				
			} //if
			
		} //for
		System.out.println("최대값은 " + max + " 입니다.");
		
		
		
		
		
		
		sc.close();
	}

}
