package assignment1;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
public static void main(String[] args) {
	double income,tax;
	int sentinel=-1;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the taxable income: ");
	income=scan.nextDouble()
;
while(income !=sentinel)
{
	if(income<=20000) {
		tax=income*0;
	}
	else if (income<=40000) {
		tax=(income-20000)*0.1;
	
	}else if(income<=60000) {
		tax=20000*0.1+(income-40000)*0.2;
	}else{
		tax=20000*0.1+20000*0.2+(income-60000)*0.3;
	}
		System.out.printf("The Income tax payable Is: %.2f%n " ,tax);
		System.out.println("Enter the taxable income:" );
		income=scan.nextDouble();
		
		
	}System.out.println("bye...");
}

}

