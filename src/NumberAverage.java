import java.util.Scanner;

// 7. WAP input any five number and then find average of five numbers
public class NumberAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter number 1 : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number 2 : ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter number 3 : ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter number 4 : ");
        double num4 = scanner.nextDouble();
        System.out.print("Enter number 5 : ");
        double num5 = scanner.nextDouble();

        calculateAverage(num1,num2,num3,num4,num5);

    }

    public static void calculateAverage(double  num1, double num2, double num3, double num4, double num5){
        double average = (num1 + num2 + num3 + num4 + num5) / 5.0;

        System.out.format("Average of %.2f %.2f %.2f %.2f %.2f is %.2f", num1, num2, num3, num4, num5, average);
    }
}
