package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		//변수
		int num;
		int saving=0;
		int pay=0;
		int sum=0;
		
		//출력
		while(true) {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택>");
		//입력
		num = sc.nextInt();
		
		//조건    “1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다
				//“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
				//“3.잔고” 선택시 현재 잔고가 출력됩니다.
				//“4.종료” 선택시 종료됩니다
		
		if(num==1) {
			System.out.print("예금액>");
			saving = sc.nextInt();
			sum +=saving;
			System.out.println("");
			
		} 
		else if (num==2) {
			pay = sc.nextInt();
			System.out.print("출금액>");
			sum -=pay;
			System.out.println("");
		} 
		else if (num==3) {
			System.out.println("잔고액>"+ sum);	
			System.out.println("");
		} 
		else if(num==4) {
			System.out.println("프로그램 종료");	
			
		}
		else {
			
			System.out.print("다시 입력해주세요");
			System.out.println("");
		}
			
	} //while
			
			
		
		
		
		
		
			

	} //main
		
		
}


