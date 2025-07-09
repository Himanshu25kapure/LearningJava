package com.loop.java;
import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter a number=");
		int num = sc.nextInt();
		
		if (num % 2 ==  0) {
			System.out.print("Number is Even");
			
		}
		
		else {System.out.print("Number is Odd");}
		
		

	}

}