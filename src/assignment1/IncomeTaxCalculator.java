package assignment1;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K=0.1;
		final double TAX_RATE_ABOVE_40K=0.2;
		final double TAX_RATE_ABOVE_60K=0.3;
		int taxableIncome;
		double taxpayable = 0;
		double taxPayable=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Taxable Income");
		
		taxableIncome=in.nextInt();
		
		
		if(taxableIncome<=20000) {
			taxPayable=(taxableIncome-20000)*0.0;
			
		} else if(taxableIncome<=40000) {
			taxPayable=((taxpayable*0.0)+(taxableIncome-20000))*0.1;
			
			
		}  else if(taxableIncome<=60000)
		{taxPayable=((20000*0.1)+(taxableIncome-40000)*0.2);
			}
		else {
			taxPayable=(20000*0.1)+(20000*0.2)+(taxableIncome-60000)*0.3;
			
		}
		System.out.printf("The income tax payable is: $%.2f%n",taxPayable);
		
		}

}
