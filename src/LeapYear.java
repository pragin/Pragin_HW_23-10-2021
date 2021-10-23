import java.util.Scanner;

// 2. WAP to input any year like 1989 and find out if it is leap year

//How to determine whether a year is a leap year
//        To determine whether a year is a leap year, follow these steps:
//
//        1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//        4. The year is a leap year (it has 366 days).
//        5. The year is not a leap year (it has 365 days).
public class LeapYear {
    public static String findLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 0 ){
              return String.format("The given year %d is not a leap year", year);
            }else{
                return String.format("The given year %d is a leap year", year);
            }

        }else{
           return String.format("The given year %d is not leap year", year);
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();
        System.out.println(findLeapYear(year));
    }
}
