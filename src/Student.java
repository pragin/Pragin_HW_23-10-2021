// 3.WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//   he is pass or fail on basis of percentage (pass>=35) and also give them grade
//   >= 80 A+
//   >= 60 A
//   >= 50 B
//   >= 35 C

import java.util.Scanner;

public class Student {
    String name = "";
    int rollNumber;
    double englishMarks, mathsMarks,physicsMarks ;

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        // Take user input and assign it to the variables
        System.out.print("Please enter your name : ");
        student.name = scanner.next();
        System.out.print("Please enter your roll number : ");
        student.rollNumber = scanner.nextInt();
        System.out.print("Please enter English marks : ");
        student.englishMarks = scanner.nextDouble();
        System.out.print("Please enter Maths marks :");
        student.mathsMarks= scanner.nextDouble();
        System.out.print("Please enter Physics marks : ");
        student.physicsMarks = scanner.nextDouble();

        // Pass the values to the method
        student.findPassFail(student.name, student.englishMarks, student.mathsMarks, student.physicsMarks);
    }

    public void findPassFail(String name, double english, double maths, double physics){
        double totalMarks = english + maths + physics;
        double averageMarks = totalMarks / 3;
        String grade = " ";
        String result;

        //Find pass or fail
        if(averageMarks >= 80.0){
            grade = "A+";
            result = "Passed";
        }else if(averageMarks >= 60.0){
            grade = "A";
            result = "Passed";
        }else if(averageMarks >= 50.0){
            grade = "B";
            result = "Passed";
        }else if(averageMarks >= 35.0){
            grade = "C";
            result = "Passed";
        }else{
            result = "Failed";
        }

        if(result == "Passed") {
            System.out.format("%s has %s with grade %s", name, result, grade);
        }else{
            System.out.format("%s has %s", name, result);
        }

    }
}
