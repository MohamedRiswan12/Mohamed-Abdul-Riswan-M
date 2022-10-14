package assignment1;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		String str;
		int strLen;
		char inChar;
		boolean isValid;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a Binary String: ");
		str=scan.next();
		strLen=str.length();
		isValid=true;
		for(int i=0;i<=strLen-1;i++) {
			inChar=str.charAt(i);
			if(!(inChar=='0'||inChar=='1')) {
				isValid=false;
				break;
			}
		}
		 
		if(isValid) {
			int decimal=Integer.parseInt(str,2);
			System.out.println("The equivalent decimal number for binary "+str+" is "+decimal);
		}else {
			System.out.println("error: invalid binary string "+str);
		}
	}
}