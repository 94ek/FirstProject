package com.calculate.Mavenproject;
import java.util.Scanner;

public class Calculator {

	public int sum(int input1, int input2){  
        return input1 + input2;  
    }
	public int substraction(int input1, int input2){  
        return input1 - input2;  
    }
	public int multiply(int input1, int input2){  
        return input1 * input2;  
    }
	public double divide(int input1, int input2){
			return input1 / input2;  
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true)					//infinite loop
		{
			System.out.println("Enter First Operand:");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Operand:");
			int num2 = sc.nextInt();
			System.out.println("Enter Operator:");
			char operator = sc.next().charAt(0);   
				
			Calculator obj = new Calculator(); 
			switch(operator)
			{
				case '+' :	int result = obj.sum(num1, num2);  
							System.out.println("Addition of numbers: " + result);
				break;
				
				case '-' :	int result1 = obj.substraction(num1, num2);  
							System.out.println("Substraction of numbers: " + result1);
				break;
				case '*' :	int result2 = obj.multiply(num1, num2);  
							System.out.println("Multiplication of numbers: " + result2);
				break;
				case '/' :	try					//Exception handling
							{
								double result3 = obj.divide(num1, num2);  
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
