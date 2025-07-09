package com.loop.java;
import java.util.Scanner;


public class Q1b { //Print addition of  first 5 number by taking input from user

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number=");
		int n = sc.nextInt();
		
		int sum=0;
		for (int i=1 ; i<=n ; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}

}
