package corejavaexercisebook;

import java.util.Scanner;

public class AverageWithoutMain {
	public static void main(String[] args) {
		AverageWithoutMain obj=new AverageWithoutMain();
		obj.average();
	}
	
	
	void average(){
	 Scanner scan = new Scanner(System.in);
     System.out.println("Total number to find the average of: ");
     double n = scan.nextDouble();
     
     double
     sum = 0;
     
     System.out.println("Enter the numbers: ");
     
     for(int i=0;i<n;i++){
         sum += scan.nextInt();
     }
     
     double average = sum/n; 
     
     System.out.println("Average of n given numbers is "+ average);
}
}
