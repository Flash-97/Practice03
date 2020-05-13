package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		int num = 0;
		int in_num = 0;

		char exit;
		Scanner sc = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println("   [숫자맞추기게임 시작]");
		System.out.println("===========================");

		in_num = (int) (Math.random() * 100) + 1;

		while (true) {
			//System.out.println(in_num);
			System.out.print(">>");
			num = sc.nextInt();

			if (num < in_num) {
				System.out.println("더 높게");

			} 
			else if (num > in_num) {
				System.out.println("더 낮게");
			} 
			else if (num == in_num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y,n) >>");
				exit = sc.next().charAt(0);
				if (exit == 'y') {
					System.out.println("===========================");
					System.out.println("   [숫자맞추기게임 종료]");
					System.out.println("===========================");
					break;
				} else if (exit == 'n') {
					in_num = (int) (Math.random()*100)+1;
				}
			
			}
		} // while
	}

}
