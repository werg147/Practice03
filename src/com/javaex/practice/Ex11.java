package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num; //숫자 입력값
		int sum = 0;
		int i;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		
		for(i=1; i<=num; i++) {
			if(num%2==0) {
				if(i%2==0) {
				sum = sum+i;
				}
			} else if(num%2==1){
				sum = sum+i;
			}
		}
		
		System.out.println("결과값: " + sum);
		
		sc.close();
		
	}
	
}
