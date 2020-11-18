package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y;
		int x1;
		int x2;
		int n;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(y=1; y<=(n*2)-1; y++) {
			for(x1=n; x1>y; x1--) {
				System.out.print("*");
			} for(x2=n; x2<y; x2++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		sc.close();

	}

}
