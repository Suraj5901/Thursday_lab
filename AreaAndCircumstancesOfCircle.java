package com.Anudip;

import java.util.Scanner;

public class AreaAndCircumstancesOfCircle {
	public static void main(String[] args) {
		
		// A = pi*r*r , C = 2*pi*r
		double pi, areaOfCircle, circumstace, radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		 radius = sc.nextInt();
		
		 pi = 3.14;
		 areaOfCircle = pi*radius*radius;
		 circumstace = 2*pi*radius;
		
		System.out.println("Area of Circle : "+areaOfCircle);
		System.out.println("Circumstance of Circle: "+circumstace);
		
		
		
		
		
						
		
		
		
		
		
	}

}
