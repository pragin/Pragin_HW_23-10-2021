import java.util.Scanner;

// 8. WAP to input any number and fid our if it is positive , negative or zero
public class PossitiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get user input
        System.out.print("Please enter the number : ");
        int num = scanner.nextInt();

        findPositiveNegative(num);
    }

    public static void findPositiveNegative(int num){
        if(num > 0){
            System.out.println("The given number " + num + " a positive number");
        }else if(num < 0){
            System.out.println("The given number " + num + " a negative number");
        }else{
            System.out.println("The given number " + num + " zero");
        }
    }
}
