import java.util.Scanner;

public class OddEven {
    public static String findOddEven(int num){
        return  num % 2 == 0 ? String.format("The given number %d is even", num ) : String.format("The given number %d is odd", num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        System.out.println(findOddEven(number));
    }
}
