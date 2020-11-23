package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		int y;
		int x;
		
		for(y=1; y<=10; y++) {
			for(x=y; x<10+y; x++) {
				System.out.print(x + "\t");
			}
			System.out.println("");
		}

	}
}
