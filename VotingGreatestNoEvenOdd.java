package com.Anudip.Thursday_Lap_Practical;

import java.util.Scanner;

public class VotingGreatestNoEvenOdd {
	public static void main(String[] args) {
		
		// Wap to perform the following Operator 
		//1.Accept age and check eligible for voting or not \
//		2. Accept 3 no from the user and find out the greatest
//		3. Wap to accept a no from the user and check it is even or odd
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Eligible for voting: \n2.Find the greatest number: \n3.Even and Odd: \nEnter the Number: ");
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1:
			System.out.println("Enter the AGE : ");
			int age = sc.nextInt();
			if(age >= 18) {
				
				System.out.println("You are eligible for voting");
				
			}else {
				System.out.println("You are under 18 Not Eligible to Vote ");
				
			}
			
			break;
			
		case 2:
			System.out.println("Enter number 1");
			int num1 = sc.nextInt();
			System.out.println("Enter number 2");
			int num2 = sc.nextInt();
			System.out.println("Enter number 3");
			int num3 = sc.nextInt();
			
			if(num1>num2 && num1>3) {
				System.out.println(num1 +" Num1 is the greatest number");
				
			}else if(num2>num1 && num2>num3) {
				System.out.println(num2 +" Num2 is the greatest number");

				
			}
			else if(num3>num1 && num3>num2) {
				System.out.println(num3 +" Num3 is the greatest number");

				
			}
			else if(num1 == num2 && num1 == num3) {
				System.out.println("You have entered same number");
				
			}
			
			
			break;
			
			
		case 3:
			System.out.println("Enter the number : ");
			 num = sc.nextInt();
			if(num%2 == 0  ) {
				
				System.out.println(num+ " This is Even ");
				
			}else {
				System.out.println(num+ " This is Odd ");
				
			}
			
			break;
		
		default:
			break;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
						
		
		
		
		
		
	}

}
