package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i;
		int sum = 0;
		int c = 0;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			if(i%5==0) {
				sum = sum+i;
				c++;
			}
		
		}
		
		System.out.println("5의배수의 개수: " + c);
		System.out.println("5의배수의 합: " + sum);
		
		sc.close();

	}

}

