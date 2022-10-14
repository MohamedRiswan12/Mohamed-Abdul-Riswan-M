package assignment1;

import java.util.Scanner;

public class SalesTaxCalculator {
public static void main(String[] args) {
	final double salesTaxR=0.07;
	final int sentinel=-1;
	double price,actualPrice,salesTax;
	double totalPrice=0,totalActualPrice=0.0,totalSalesTax=0.0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the price: ");
	price=scan.nextInt();
	while(price!=sentinel) {
		
		
		actualPrice=price/1.07;
		salesTax=price-actualPrice;
		totalPrice=actualPrice+salesTax;
		totalActualPrice=actualPrice+actualPrice;
		totalSalesTax=salesTax+salesTax;
		System.out.printf("Actual price is: $%.2f%n",actualPrice);
		System.out.printf("Sales tax :$%.2f%n",salesTax);
		System.out.println("Enter The Tax Inclusive Price: ");
		price=scan.nextDouble();
		
	}
	System.out.printf("Total Price is: $%.2f%n",totalPrice);
	System.out.printf("Total Actual Price: $%.2f%n",totalActualPrice);
	System.out.printf("Total Sales Tax : $%.2f%n",totalSalesTax);
}
}
