package com.Anudip;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		
	// WAP to accept a  no from the user and find out the Factorial
		
		int num, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		
//		while(num >= 1) {
//			fact = num*fact;
//			num--;
//			
//			
//		}
		
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
			
		}
		System.out.println(" factor number is "+ num+ " factorial number is: "+fact);


		
		
		
		
						
		
		
		
		
		
	}

}
