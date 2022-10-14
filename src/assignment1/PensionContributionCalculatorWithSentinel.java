package assignment1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the salary");
		int sal=scan.nextInt();
	System.out.println("Enter age : ");
	int age=scan.nextInt();
	double con;
	double e;
	double r;
	double tot;
	int sentinel=-1;
	while(sal!=sentinel) {
	if (sal>=0 && sal<=6000) {
		con=sal;
		
	}else {
		con=6000;
		
	}if(age<=55){
		e=con*0.2;
		r=con*0.17;
		
	}else if(age<=60) {
		e=con*0.13;
		r=con*0.13;
	}else if(age<=65){
		e=con*0.075;
		r=con*0.09;
		
	}else {
		e=con*0.05;
		r=con*0.075;
	}
	tot=e+r;
	System.out.printf("The contribution of employee: $%.2f%n ",e);
	System.out.printf("the contribution of employee:  $%.2f%n",r);
	System.out.printf("The total contribution: $%.2f%n ",tot );
	System.out.println(); 
	System.out.println("enter the salary: ");
	sal=scan.nextInt();
	if (sal==-1) {
		System.out.println("bye...");
		break;
	}
	System.out.println("enter the age: ");
	age=scan.nextInt()
;	}
	}
}
