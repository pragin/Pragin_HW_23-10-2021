import java.util.Scanner;

// 15. WAP input any number, the print Day name of the week accordingly by using if else
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a number from 1 t 7 to find the day of the week : ");
        int num = scanner.nextInt();

        if(num >0 && num <=7 ){
            findDay(num);
        }else{
            System.out.println("!!!Please choose a number from 1 to 7!!!");
        }

    }

    public static void findDay(int num){
        if(num == 1){
            System.out.println("The day is Sunday");
        }else if(num == 2){
            System.out.println("The day is Monday");
        }else if(num ==3){
            System.out.println("The day is Tuesday");
        }else if(num ==4){
            System.out.println("The day is Wednesday");
        }else if(num == 5){
            System.out.println("The day is Thursday");
        }else if(num == 6){
            System.out.println("The day is Friday");
        }else{
            System.out.println("The day is Saturday");
        }
    }
}
