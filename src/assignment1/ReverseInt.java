package assignment1;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		int inNumber, inDigit=0,add=0;
		System.out.println("Enter a number : ");
		Scanner in=new Scanner(System.in);
		inNumber=in.nextInt();
		in.close();
	while(inNumber>0) {
		
//		 inDigit*=10;
		 inDigit=inDigit+inNumber%10;
		 
		inNumber=inNumber/10;
		add+=inDigit;
		
		
		
	}
	//System.out.println("reverse is  "+inDigit);
	System.out.println("Add Of numbers: "+inDigit);
	
	}

}
