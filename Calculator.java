import java.util.Scanner;

public class Calculator {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        double first = sc.nextDouble();
	        double second = sc.nextDouble();
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = sc.next().charAt(0);
	        double result;
	        switch(operator)
	        {
	            case '+':
	                result = first + second;
	                break;
	            case '-':
	                result = first - second;
	                break;
	            case '*':
	                result = first * second;
	                break;
	            case '/':
	                result = first / second;
	                break;
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	        }
	        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	    }
	}