package com.Anudip.Thursday_Lap_Practical;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		
		// Wap using switch case which will display the option of all operators
		
		int num, num1, num2, res, airthematic, comparision, bitwise, logical, assignment;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.Airthematic Operator: \n2.Comparision Operator: \n3.Bitwise Operator: \n4.Logical Operator \n5.Assignment Operator: \nEnter the number: ");
		 num = sc.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("1.Addition: \n2.Subtraction: \n3.Multiplication \n4.Division\n5.Modulation\n6.Increament \n7.Decreament \nEnter the Number");
			airthematic = sc.nextInt();
			
			
			// Aithematic
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
				
			case 6:
				System.out.println("Enter the  number for Increament by 1 ");
				 num1 = sc.nextInt();
				 num1++;
				
				
				 System.out.println(num1 + " this is the result");
				break;
				
				
			case 7:
				System.out.println("Enter the  number for Decreament by 1 ");
				 num1 = sc.nextInt();
				 num1--;
				 
				 System.out.println(num1 + " this is the result");
				break;
				
				
//			case 8: 
//				
//				 while (true) {
//			            System.out.print("Enter a command ('back' to go one step back, 'exit' to quit): ");
//			            String command = sc.nextLine();
//
//			            if (command.equals("back")) {
//			                System.out.println("Going one step back...");
//			                break; 
//			            } else if (command.equals("exit")) {
//			                System.out.println("Exiting the program...");
//			                System.exit(0); 
//			            } else {
//			                System.out.println("Invalid command. Try again.");
//			            }
//			        }
				
				default:
					System.out.println("Invalid");
					break;
			
			}
			
			
			 
			 
			break;
			
			
		case 2: 
//			Comparision
			System.out.println("1.Equal To: \n2.Not Equal to: \n3.Greater than: \n4.Less than \n5.Greater than equal to: \n6.Less than or equal to: \nEnter the Number");
			comparision = sc.nextInt();
			
			switch(comparision) {
			
			case 1:
				
				System.out.println("Enter the two number");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
//				boolean res1 = num1 == num2;
//				 System.out.println(res1 + "this is the result");			 
				 if(num1 == num2) {
					 System.out.println( "both the input are equal");				 
				 }
				 else {
					 System.out.println("both the input are not equal");
				 }
				
				break;
				
				
				case 2:
								
					System.out.println("Enter the two number");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
							 
					 if(num1 != num2) {
						 System.out.println( "both the input are not equal");				 
					 }
					 else {
						 System.out.println("both the input are  equal");
					 }
					
					break;
								
								
								
				case 3:
										
					System.out.println("Enter the two number");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
						 
					 if(num1 > num2) {
						 System.out.println( num1+" num1 is greater than num2: "+num2);				 
					 }
					 else {
						 System.out.println(num1+" num1 is less than num2: "+num2);
					 }
					
					break;
					
					
					
					
					
					
					
				case 4:
					
					System.out.println("Enter the two number");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
							 
					 if(num1 < num2) {
						 System.out.println( num1+" num1 is less than num2: "+num2);				 
					 }
					 else {
						 System.out.println(num1+" num1 is greater than num2: "+num2);
					 }
					
					break;
					
					
					
					
				case 5:
					
					System.out.println("Enter the two number");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
							 
					 if(num1 >= num2) {
						 System.out.println( num1+" num1 is greater than equal to num2: "+num2);				 
					 }
					 else {
						 System.out.println(num1+" num1 is less than equal to num2: "+num2);
					 }
					
					break;
					
					
					
				case 6:
					
					System.out.println("Enter the two number");
					 num1 = sc.nextInt();
					 num2 = sc.nextInt();
							 
					 if(num1 <= num2) {
						 System.out.println( num1+" num1 is less than equal to num2: "+num2);				 
					 }
					 else {
						 System.out.println(num1+" num1 is greater than equal to num2: "+num2);
					 }
					
					break;
				
				
				
				default : 
					System.out.println("Invalid Input");
					break;
			
			}
			
			break;
			
		case 3: 
			
			// Bitwise Operator
			System.out.println("1.And Operator: \n2.Or Operator: \n3.Xor Operator: \nEnter the Number");
			bitwise = sc.nextInt();
			
			switch(bitwise) {
			
			case 1: 
				System.out.println("Enter the two number");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
						 
				System.out.println( " And Operator Result is : "+(num1 & num2));				 
							
				
				
				break;
				
			case 2: 
				System.out.println("Enter the two number");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
						 
				System.out.println( "OR Operator Result is : "+(num1 | num2));	
				break;
				
			case 3: 
				
				System.out.println("Enter the two number");
				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
						 
				System.out.println( "XOR Operator Result is : "+(num1 ^ num2));	
				break;
				
				default:
					break;
			
			}
			
			
			 
			break;
			
			
		case 4: 
			
			
			// Logical Operator
						System.out.println("1.And Operator(&&): \n2.Or Operator(||): \n3.Not Operator(!): \nEnter the Number");
						logical = sc.nextInt();
						
						switch(logical) {
						
						case 1: 
							System.out.println("Enter the  number");
							 num1 = sc.nextInt();
							 System.out.println("Enter the minimum number");
							 num2 = sc.nextInt();
							 System.out.println("Enter the maximum number");
							 num = sc.nextInt();
							 
							 
							 if (num1 > num2 && num1 < num) {
						            System.out.println("The number is within the range.");
						        } else {
						            System.out.println("The number is outside the range.");
						        }
									 
							
										
							
							
							break;
							
						case 2: 
							System.out.println("Enter your age:");
							 num1 = sc.nextInt();
							 System.out.println("Are you student? (if student type true or false)");
							boolean isStudent = sc.nextBoolean();
									 
							 if (num1 >= 18 || isStudent) {
						            System.out.println("You are eligible for student discount");
						        } else {
						            System.out.println("You are not eligible for student discount");
						        }	
							break;
							
						case 3: 
							
							System.out.println("Is it Raining (Enter True if yes or Enter False if no)");
							boolean isRain = sc.nextBoolean();
									 
							if(!isRain) {
								System.out.println("Not Raining Outside Enjoy the whether");
								
							}else {
								System.out.println(" Rain has been started take the Umbrella with yourself ");
								
							}
							break;
							
							default:
								System.out.println("Invalid Input");
								break;
						
						}
			
		
			break;
			
			
		case 5: 
			//Assignment Operator
			System.out.println("1.Add(+=): \n2.Sub(-=): \n3.multi(*=): \n4.Div(/=): \n5.Mod(%=): \nEnter the Number");
			assignment = sc.nextInt();
			
			
			switch(assignment) {
			case 1:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				
				num = num1 += num2;
				
				System.out.println("After Addition : "+num);
				
				break;
				
			case 2:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				
				num = num1 -= num2;
				
				System.out.println("After Subtraction : "+num);
				break;
				
			case 3:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				
				num = num1 *= num2;
				
				System.out.println("After Multiplication : "+num);
				break;
				
			case 4:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				
				num = num1 /= num2;
				
				System.out.println("After Division : "+num);
				break;
				
			case 5:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				
				num = num1 %= num2;
				
				System.out.println("After Modulus : "+num);
				break;
				
				default:
					System.out.println("Invalid input");
					break;
			}
			
			
			break;
			
		
			
			
		
		default:
			System.out.println("Invalid Input");
			break;
			
		}
		
		
		
		
						
		
		
		
		
		
	}

}
