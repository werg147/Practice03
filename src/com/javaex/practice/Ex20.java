package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;
		//int num = 89;
		int no;
		
		System.out.println("========================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("========================");
		
		
		while(true) {	
			System.out.print(">>");
			no = sc.nextInt();
			
			if(no<num) {
				System.out.println("더 높게");
			} else if(no>num) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String y = sc.nextLine();
				break;
				
			}
		
		}
		
	
		sc.close();

	}

}

