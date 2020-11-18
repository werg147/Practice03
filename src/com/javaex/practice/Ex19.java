package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int won;
		int n1 = 0;
		int n2;
		int n3;
		int n4;
		
		
		
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			System.out.print("예금액>");
			won = sc.nextInt();
				if(num==1) {
					n1 = won+n1;
					}
		}
		
		
		sc.close();

	}

}