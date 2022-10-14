package assignment1;

import java.util.Scanner;

public class CheckBinStr {
	public static void main(String[] args) {
		String str;
		int strLen;
		char inChar;
		boolean isValid;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a Binary Code: ");
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
			System.out.println(str +" is a Binary String");
		}else {
			System.out.println(str+" is not a binary string");
		}
	}
}
