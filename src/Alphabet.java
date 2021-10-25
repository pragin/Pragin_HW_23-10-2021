// 16. Write a Java program that takes the user to provide a single character from the
//     alphabet. Print Vowel or Consonant, depending on the user input.
//     For eg:
//          Input an alphabet: p
//          Expected Output :
//          Input letter is Consonant

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get user input
        System.out.print("Choose a letter from a to z : ");
        char letter = scanner.next().charAt(0);

        findVowelConsonant(letter);

    }

    public static void findVowelConsonant(char letter){
        if(letter == 'a'
              || letter == 'e'
              || letter == 'i'
              || letter == 'o'
              || letter == 'u'){
            System.out.println("Input letter is vowel");
        }else{
            System.out.println("Input letter is consonant");

        }
    }
}
