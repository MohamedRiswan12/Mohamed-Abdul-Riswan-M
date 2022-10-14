package assignment1;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		String str;
		int strLen;
		char inChar;
		boolean isValid;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a HexaDecimal String: ");
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
			int decimal=Integer.parseInt(str,16); 
			System.out.println("The equivalent decimal number for hexadecimal "+str+" is "+decimal);
		}else {
			System.out.println("error: invalid hexadecimal string "+str);
		}
}
}
