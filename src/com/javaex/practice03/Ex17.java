package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		//변수
		int line;
		int star;
		int i;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.print("숫자를 입력하세요: ");
		
		//입력
		line = sc.nextInt();
		
		//조건
		for (star=1; star<=line; star++) {
			for (i=0; i<=line-star; i++) {
				System.out.print("*");
			} //속for
			System.out.println("");
		} //겉for
		
		
		
		
		
		
		//스캐너닫기
		sc.close();
	} //main
		
		
}


