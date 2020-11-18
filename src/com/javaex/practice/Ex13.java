package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			sum = sum+i;	
		}
		
		System.out.println("합계: " + sum);
		
		sc.close();

	}

}
