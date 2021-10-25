// 4. WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//    he is pass or fail on basis of percentage (pass>=35) and also give them grade
//    >= 80 A+
//    >= 60 A
//    >= 50 B
//    >= 35 C
//    student needs to pass all the subjects

import java.util.Scanner;

public class Student2 {
        String name = "";
        int rollNumber;
        double englishMarks, mathsMarks,physicsMarks ;

        public static void main(String[] args) {
            Student2 student2 = new Student2();
            Scanner scanner = new Scanner(System.in);

            // Take user input and assign it to the variables
            System.out.print("Please enter your name : ");
            student2.name = scanner.next();
            System.out.print("Please enter your roll number : ");
            student2.rollNumber = scanner.nextInt();
            System.out.print("Please enter English marks : ");
            student2.englishMarks = scanner.nextDouble();
            System.out.print("Please enter Maths marks :");
            student2.mathsMarks= scanner.nextDouble();
            System.out.print("Please enter Physics marks : ");
            student2.physicsMarks = scanner.nextDouble();

            // Pass the values to the method
            student2.findPassFail(student2.name, student2.englishMarks, student2.mathsMarks, student2.physicsMarks);
        }

        public void findPassFail(String name, double english, double maths, double physics){
            double totalMarks = english + maths + physics;
            double averageMarks = totalMarks / 3;
            String grade = " ";
            String result;

            //Find pass or fail
            if(english >= 35 && maths >= 35 && physics >= 35) {
                result = "Passed";
                if (averageMarks >= 80.0) {
                    grade = "A+";
                } else if (averageMarks >= 60.0) {
                    grade = "A";
                } else if (averageMarks >= 50.0) {
                    grade = "B";
                } else{
                    grade = "C";
                }
            }else{
                result = "Failed";
            }


            if (result == "Passed") {
                System.out.format("%s has %s with grade %s", name, result, grade);
            } else {
                System.out.format("%s has %s", name, result);
            }

        }

}
