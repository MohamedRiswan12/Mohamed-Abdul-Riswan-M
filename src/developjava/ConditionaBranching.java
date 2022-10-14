package developjava;

import java.util.Scanner;

public class ConditionaBranching {
	public static void main(String[] args) {
		boolean married=false;
		boolean earning=true;
		if (married) {
			System.out.println("you are ok");
			if(earning) {
				System.out.println("you are selected");
			}
		}
		if(married||earning) {
			System.out.println("you are ok and you are selected");
		
		}else {
			System.out.println("you are not eligible");
			
		}
		int n1=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		n1=scan.nextInt()
;
		if(n1%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
		if (n1==0) {
			System.out.println("monday");}
		else if(n1==2){
		     System.out.println("tuesday");}
		else if(n1==3){
		System.out.println("wednesday");
		}
		else {
			System.out.println("holiday");
		
		}
			
	
	}

}
