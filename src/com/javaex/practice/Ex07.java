package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y;
		int x;
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(y=1; y<=num; y++) {
			for(x=1; x<=y; x++) {				
				System.out.print(y);
			}
			System.out.println("");
		}
		
		sc.close();
		
	}

}
