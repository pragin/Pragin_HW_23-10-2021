import java.util.Scanner;

// 10. Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry
public class Cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter from a to f to find a city name : ");
        char character = scanner.next().charAt(0);

        findCity(character);
    }

    public static void findCity(char character){
        if(character == 'A' || character == 'a'){
            System.out.println("The city is Athens");
        }else if(character == 'B' || character == 'b'){
            System.out.println("The city is Bangalore");
        }else if(character == 'C' || character == 'c'){
            System.out.println("The city is Colombo");
        }else if(character == 'D' || character == 'd'){
            System.out.println("The city is Denvor");
        }else if(character == 'E' || character == 'e'){
            System.out.println("The city is Eden");
        }else if(character == 'F' || character == 'f'){
            System.out.println("The city is Frankfurt");
        }else{
            System.out.println("Invalid character. Please choose from a to f");
        }
    }
}

