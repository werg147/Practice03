package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int n;
		int s;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			for(s=n; s>i; s--) {
				System.out.print("*");
			}
		System.out.println("*");
		}
		
		
		
		sc.close();

	}

}
