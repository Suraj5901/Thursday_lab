package com.Anudip;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		// Wap using switch case which will display the option of all operators
		
		int num, num1, num2, res, airthematic, comparision, bitwise, logical, assignment;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.Airthematic Operator: \n2.Comparision Operator: \n3.Bitwise Operator: \n4.Logical Operator \n5.Assignment Operator: \nEnter the number: ");
		 num = sc.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("1.Addition: \n2.Subtraction: \n3.Multiplication \n4.Division\n5.Modulation\nEnter the Number");
			airthematic = sc.nextInt();
			
			switch(airthematic) {
			
			case 1:
				System.out.println("Enter the two number for Addition ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				 res = num1+num2;
				 System.out.println(res + " this is the result");
				break;
				
			case 2:
				System.out.println("Enter the two number for Subtraction ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				 res = num1-num2;
				 System.out.println(res + " this is the result");
				break;
				
			case 3:
				System.out.println("Enter the two number for Multiplication ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				 res = num1*num2;
				 System.out.println(res + " this is the result");
				break;
				
			case 4:
				System.out.println("Enter the two number for Division ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				 res = num1/num2; 
				 System.out.println(res + " this is the result");
				break;
			case 5:
				System.out.println("Enter the two number for Mod ");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				 res = num1%num2;
				 System.out.println(res + " this is the result");
				break;
				
				default:
					System.out.println("Invalid");
					break;
			
			}
			
			
			 
			 
			break;
			
			
		case 2: 
			
			System.out.println("1.Equal To: \n2.Greater than: \n3.Less than \n4.Division\n5.Modulation\nEnter the Number");
			comparision = sc.nextInt();
			
			switch() {
			
			case 1:
				break;
			
			}
			
			
			System.out.println("Enter the two number");
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
			boolean res1 = num1 == num2;
			 System.out.println(res1 + "this is the result");
			break;
			
			
		case 3: 
			
			System.out.println("Enter the number ");
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
			 res = num1 & num2;
			 System.out.println(res + "this is the result");
			 
			break;
			
			
		case 4: 
			
			System.out.println("Enter the two number for Addition ");
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
			boolean res2 = num1 >5 && num2<5;
			 System.out.println(res2 + "this is the result");
			break;
			
			
		case 5: 
			System.out.println("Enter the number ");
			 num1 = sc.nextInt();
			 
			 res = num1 += 5;
			 System.out.println(res + "this is the result");
			break;
			
		
			
			
		
		default:
			System.out.println("");
			
		}
		
		
		
		
						
		
		
		
		
		
	}

}
