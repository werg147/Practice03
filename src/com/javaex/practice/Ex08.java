package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int dan;
		int no;
		int mul;
		
		for(no=1; no<=9; no++) {
			for(dan=2; dan<=9; dan++) {
				mul = dan*no;
				System.out.print(dan + "*" + no + "=" + mul);
				System.out.print("\t");
			}
			System.out.println("");
		}
		

	}

}
