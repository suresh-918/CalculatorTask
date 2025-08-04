import java.util.Scanner;

public class CalculatorTask {
	
	public static double add(double a,double b) {
		return a + b;
	}
	public static double substraction(double a,double b) {
		return a - b;
	}
	public static double multiplication(double a,double b) {
		return a * b;
	}
	public static double division(double a,double b) {
		return a / b;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option;
		double num1,num2;
		
		System.out.println("---Simple Calculator ---");
		
		do {
			System.out.println("---Select one operation: ");
			System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            
            if(option >=1 && option <=4) {
            	System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                
                switch(option) {
                	case 1:
                		System.out.println(" Result : " + add(num1,num2));
                		break;
                	case 2:
                		System.out.println(" Result : " + substraction(num1,num2));
                		break;
                	case 3:
                		System.out.println(" Result : " + multiplication(num1,num2));
                		break;
                	case 4:
                		System.out.println(" Result : " + division(num1,num2));
                		break;
                }
            }
            else if(option != 5) {
            	System.out.println(" In valid input, please select correct option ");
            }
		}
		while(option != 5);
		System.out.println("Calculator exited. Thank you!");
		scanner.close();

	}

}
