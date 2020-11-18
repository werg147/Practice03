package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();

	}

}
