//CalcTravis.Filla
package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char operator;
		double firstNum, secondNum, result = 0;
		
		System.out.print("Enter first Number: ");
		firstNum = scnr.nextDouble();
		System.out.print("Input operator: \"+\",\"-\",\"/\",\"*\"");
		operator = scnr.next().charAt(0);
		System.out.print("Enter the Second Number: ");
		secondNum = scnr.nextDouble();
		
		if(operator == '+')
		{
			result = firstNum+secondNum;			
			System.out.println("Answer: " + result);
		}
		else if (operator == '-')
		{
			result = firstNum-secondNum;
			System.out.println("Answer: " + result);		}
			
		else if (operator == '/')
		{
			result = firstNum/secondNum;
			System.out.println("Answer: " + result);		}
		else if (operator == '*')
		{
			result = firstNum*secondNum;
			System.out.println("Answer: " + result);		}
		else
			System.out.print("Invalid operator!");
		
		
		
		scnr.close();

	}

}
