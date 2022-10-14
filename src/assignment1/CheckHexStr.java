package assignment1;

import java.util.Scanner;

public class CheckHexStr {
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
			if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')|| (inChar >= 'a' && inChar <= 'f'))) {
				isValid=false;
				break;
			}}
		if(isValid) {
			System.out.println(str+" is a hex string");
		}else {
			System.out.println(str+" is not a hex string");
		}
}}
