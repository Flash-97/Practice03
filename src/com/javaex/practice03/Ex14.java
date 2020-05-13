package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		int num;
		int i;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {
			sum += i;
			if (i < num) {
				System.out.print(i + "+");
			} //if 
			else {
					System.out.print(i);
				} //else
		} //for
		System.out.println();
		System.out.println("합계: " + sum);

		sc.close();
	}

}
