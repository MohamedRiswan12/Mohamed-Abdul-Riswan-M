package assignment1;

import java.util.Scanner;

public class InputValidation {
public static void main(String[] args) {
	int numberIn ;
	boolean isValid;
	isValid=false;
	do {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 0-10 or 90-100: ");
		numberIn=scan.nextInt();
		if((numberIn>=0&&numberIn<=10) || (numberIn>=90&&numberIn<=100)){
			isValid=true;
			System.out.println("You have entered : "+numberIn);
		}else {
			System.out.println("Invalid Input Try Again...");
		}
	

	
	}while(!isValid);
	
}
}
