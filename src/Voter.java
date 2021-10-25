import java.util.Scanner;

// 11. Write Java program to allow the user to input his/her age. Then the program will show if the
//     person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//     old.
public class Voter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get voter's age
        System.out.print("Enter voter's age : ");
        int age = scanner.nextInt();

        findEligible(age);
    }

    public static void findEligible(int age){
        if(age >= 18){
            System.out.println("You are eligible to vote!!!");
        }else{
            System.out.println("You are NOT eligible to vote!!!");
        }
    }
}
