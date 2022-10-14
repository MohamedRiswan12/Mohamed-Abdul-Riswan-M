package assignment1;

import java.util.Scanner;

public class Add2Integers {
public static void main(String[] args) {
	int num1,num2,sum;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter First Integer: ");
	num1=scan.nextInt();
	System.out.println("Enter second Integer");
	num2=scan.nextInt();	
	scan.close();
	sum=num1+num2;
	System.out.println("The sum is: "+sum);
}
}
