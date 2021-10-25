// 5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class NumberInterchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for user input
        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();

        interchangeNumbers(num1,num2);
    }

    public static void interchangeNumbers(int a, int b){

        System.out.format("Before interchange : a = %d and b = %d", a, b);
        int temp;
        temp = a; //Assign variable a's value in temp
        a = b; //Assign variable b's value to a
        b = temp; //Assign a's value stored in variable temp to b;

        System.out.format("\nAfter interchange : a = %d and b = %d", a, b);

    }
}
