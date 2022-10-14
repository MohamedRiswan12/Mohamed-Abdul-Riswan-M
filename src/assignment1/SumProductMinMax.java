package assignment1;

import java.util.Scanner;

public class SumProductMinMax {
	public static void main(String[] args) {
		int number1,number2,number3;
		int sum,product,min,max;
		Scanner scan=new Scanner(System.in);
		number1=scan.nextInt();
		number2=scan.nextInt();
		number3=scan.nextInt();
		scan.close();
		sum=number1+number2+number3;
		product=number1*number2*number3;
		min = number1; 
		 if (number2 < min) {  
		
		 min = number2; 
		 } 
		 if (number3 < min) { 
		 min = number3; 
		 } 
		 max = number1; 
		 if (number2 < max) {  
		
		 max = number1; 
		 } 
		 if (number3 < max) { 
		 max = number1; 
		 } 
		 if(number2>max)
			 max=number2;
		 if(number3>max)
			 max=number3;
		 System.out.println("The sum is "+sum);
		 System.out.println("Product is "+product);
		 System.out.println("minimum is "+min);
		 System.out.println("maximum is"+max);

		
	}

}
