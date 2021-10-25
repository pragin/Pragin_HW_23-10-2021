// 9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//    commission
//    sales amount >= 50,000 35%
//    sales amount >= 30,000 20%
//    >= 20,000 10%
//    >= 10,000 5%
//    < 10,000 2%

import java.util.Scanner;

public class Sales {
    int id;
    String sellerName;
    double saleAmount;
    double basicSalary;
    public static void main(String[] args) {
        Sales sales = new Sales();
        Scanner scanner = new Scanner(System.in);
        //Get sale details
        System.out.print("Enter sales id : ");
        sales.id = scanner.nextInt();
        System.out.print("Enter seller's name : ");
        sales.sellerName = scanner.next();
        System.out.print("Enter sale amount : " );
        sales.saleAmount = scanner.nextDouble();
        System.out.print("Enter seller's basic salary : ");
        sales.basicSalary = scanner.nextDouble();

        //Print the results
        System.out.format("Based on sale amount %.2f the seller %s has earned ", sales.saleAmount,sales.sellerName);
        System.out.println(sales.calculateCommission(sales.saleAmount) + " commission");

    }

    public double calculateCommission( double saleAmount){
        if(saleAmount >= 50000){
            return saleAmount * 0.35;
        }else if(saleAmount >= 30000){
            return saleAmount * 0.20;
        }else if(saleAmount >= 20000){
            return  saleAmount * 0.10;
        }else if(saleAmount >= 10000){
            return saleAmount * 0.05;
        }

        return saleAmount * 0.02;
    }

}
