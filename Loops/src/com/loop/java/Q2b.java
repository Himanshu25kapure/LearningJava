package com.loop.java;
import java.util.Scanner;

public class Q2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Num");
		int n=sc.nextInt();
		
		switch (n) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
        	    System.out.println("Wednesday");
        	    break;
        	    
        default:
            System.out.println("Fuck Off");
		}
        
	}

}
