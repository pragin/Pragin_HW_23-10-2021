// 12. Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class AlphabetCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the alphabet from user
        System.out.print("Enter an alphabet in uppercase : ");
        char character = scanner.next().charAt(0);

        convertCase(character);
    }

    public static void convertCase(char character){
        System.out.println(Character.toLowerCase(character));
    }
}
