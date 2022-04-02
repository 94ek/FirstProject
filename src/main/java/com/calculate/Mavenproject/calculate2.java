package com.calculate.Mavenproject;

import java.util.Scanner;

public class calculate2 {

		public double divide(int input1, int input2){
				return input1 / input2;  
				}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			while(true)					//infinite loop
			{
				
				System.out.println("Enter Operator:");
				char operator = sc.next().charAt(0);   
					
				Calculator obj = new Calculator(); 
				switch(operator)
				{
					case '+' :	int sum=0;
								System.out.println("Enter how many number you wants to add");
								int n = sc.nextInt();
								for(int i=1; i<=n; i++ ){
									System.out.println("Enter number "+i);
									int num1 = sc.nextInt();
									sum += num1;
								}
								System.out.println("Addition of numbers: " + sum);
								
					break;
					
					case '-' :	int sub=0;
								System.out.println("Enter how many number you wants to subtract");
								int n1 = sc.nextInt();
								for(int i=1; i<=n1; i++ ){
									System.out.println("Enter number "+i);
									int num1 = sc.nextInt();
									sub -= num1;	
								}
								System.out.println("Addition of numbers: " + sub);
					break;
					case '*' :	int mul=1;
								System.out.println("Enter how many number you wants to Multiply");
								int n2 = sc.nextInt();
								for(int i=1; i<=n2; i++ ){
									System.out.println("Enter number "+i);
									int num1 = sc.nextInt();
									mul *= num1;	
								}
								System.out.println("Addition of numbers: " + mul);
					break;
					case '/' :	System.out.println("Enter First Operand:");
								int num7 = sc.nextInt();
								System.out.println("Enter Second Operand:");
								int num8 = sc.nextInt();
						
								try		//Exception handling
								{
									double result3 = obj.divide(num7, num8);  
									System.out.println("Division of numbers: " + result3);
								}
								catch(ArithmeticException e)
								{
									System.out.println(e);  
								}
					break;
					default:	System.out.println("Invalid operator");    
				}		
			}	

	}

}
