// 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//    HRA = basic salary 10%
//    DA = Basic salary 8%
//    TA = Basic salary 9%
//    PF= Basic salary 20%
//    Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    double basicSalary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        //Get employee details
        System.out.print("Employee name : ");
        employee.name = scanner.next();
        System.out.print("Employee id : ");
        employee.id = scanner.nextInt();
        System.out.print("Employee's basic salary : ");
        employee.basicSalary = scanner.nextDouble();

        employee.calculate(employee.name, employee.basicSalary);

    }

    public void calculate(String name, double basicSalary){
        double HRA = basicSalary * 0.1;
        double DA = basicSalary * 0.08;
        double TA = basicSalary * 0.09;
        double PF = basicSalary * 0.2;
        double grossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("Please find the calculations for " + name + " below:");
        System.out.format("HRA = %f \n",HRA);
        System.out.format("DA = %f \n",DA);
        System.out.format("TA = %f \n",TA);
        System.out.format("PF = %f \n",PF);
        System.out.format("Gross Salary = %f \n",grossSalary);


    }
}
