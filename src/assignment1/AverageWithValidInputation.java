package assignment1;

import java.util.Scanner;

public class AverageWithValidInputation {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double average=0.0;
	boolean flag=false;
	int sum=0;
	for(int i=1;i<=3;i++) {
		do {System.out.println("enter the mark of the student"+i+" :");
		int m1=scan.nextInt();
		if(m1>=0 && m1<=100) {
			flag=true;
			sum+=m1;
		}else {
			flag=false;
			System.out.println("Invalid input, try again");
		}
		average=sum/3;
		}while(flag==false);
	}
	System.out.println("the average is : "+average);
}
}
