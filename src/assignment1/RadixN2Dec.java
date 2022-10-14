package assignment1;

import java.util.Scanner;

public class RadixN2Dec {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int radix;
	String str;
	System.out.println("Enter the String: ");
	str=scan.next();
	System.out.println("Enter the radix:(2,8,10,16)");
	radix=scan.nextInt();
	int decimal=Integer.parseInt(str,radix);
	System.out.println("The equivalent decimal number "+str+" is "+decimal);
	
}
}
