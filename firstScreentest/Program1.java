package firstScreentest;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber, secondNumber;
		double result_operation_output;
		Scanner scannerObject = new Scanner(System.in);
		do {
			System.out.println("==============================================");
			System.out.println("1. + for ADDITION");
			System.out.println("2. - for SUBTRACTION");
			System.out.println("3. * for MULTIPLICATION");
			System.out.println("4. / for DIVISION");
			System.out.println("7. Q for QUIT");
			System.out.println("==============================================");

			System.out.print("Enter your first number:\n");
			firstNumber = scannerObject.nextDouble();

			System.out.print("Enter your second number:\n");
			secondNumber = scannerObject.nextDouble();

			System.out.print("Enter an operators like (+, -, *, /,) only:\n ");

			mchar operator = scannerObject.next().charAt(0);

			switch (operator) {
			case '+':
				result_operation_output = firstNumber + secondNumber;
				break;

			case '-':
				result_operation_output = firstNumber - secondNumber;
				break;

			case '*':
				result_operation_output = firstNumber * secondNumber;
				break;

			case '/':
				result_operation_output = firstNumber / secondNumber;
				break;			
			case 'Q':
				System.exit(0);

			default:
				System.out.printf("Please enter specified operator only");
				return;
			}
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " is : " + result_operation_output);
		} while (result_operation_output != 'Q');
		scannerObject.close();
	}
}