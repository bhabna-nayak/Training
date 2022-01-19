package arithmeticCalculator;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double firstNumber, secondNumber, result = 0;
		char operator;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the two numbers: ");
		firstNumber = scan.nextDouble();
		secondNumber = scan.nextDouble();
		
		System.out.println("Enter the operator: ");
		operator = scan.next().charAt(0);
		
		switch(operator) {
		
		case '+':
			result = firstNumber + secondNumber;
			break;
			
		case '-':
			result = firstNumber - secondNumber;
			break;
			
		case '*':
			result = firstNumber * secondNumber;
			break;
			
		case '/':
			result = firstNumber / secondNumber;
			break;
		
			default:
				System.out.println("Error! Enter correct data ");
		}
		scan.close();
		System.out.println("The final result is " + firstNumber + " " + operator + " " + secondNumber + " " + "=" + " " + result);
	}

}