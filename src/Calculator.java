import java.util.Scanner;

// 13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//     subtraction, multiplication and division according to their symbol (using if else)
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input capture
        System.out.print("Please enter number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter number 2 : ");
        int number2 = scanner.nextInt();
        System.out.print("Please choose an operator from the list [ +, -, /, *] : ");
        char operation = scanner.next().charAt(0);

        double result = calculate(number1, number2, operation);
        System.out.format("The result of %d %c %d = %.2f", number1, operation,number2, result);
    }

    public static double calculate(int num1, int num2, char operator){
        if(operator == '+' ){
            return num1 + num2;
        }else if(operator == '-'){
            return num1 - num2;
        }else if(operator == '/'){
            return num1 / num2;
        }else if (operator == '*'){
            return num1 * num2;
        }

        return 0;
    }
}
