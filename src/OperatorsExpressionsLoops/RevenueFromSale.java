package OperatorsExpressionsLoops;

import java.util.Scanner;

public class RevenueFromSale {
    public static void main(String[] args) {

        double unitPrice, quantitySold, totalRevenue;
        double discountPrice = 0;
        double totalDiscount = 0;

        Scanner myObj = new Scanner(System.in);

        System.out.print("Input unit price ($): ");
        unitPrice = myObj.nextInt();

        System.out.print("Input quantity: ");
        quantitySold = myObj.nextInt();

        if (quantitySold >= 100 && quantitySold <= 120)
        {
            discountPrice = unitPrice - (unitPrice * 0.15);
        }
        if (quantitySold > 120)
        {
            discountPrice = unitPrice - (unitPrice * 0.20);
        }
        else
        {
            discountPrice = unitPrice;
        }

        totalRevenue = discountPrice * quantitySold;
        totalDiscount = (unitPrice * quantitySold) - totalRevenue;
        System.out.println("Unit price: $" + discountPrice);
        System.out.println("Total revenue: $" + totalRevenue);
        System.out.println("Discount: $" + totalDiscount);
    }
}
