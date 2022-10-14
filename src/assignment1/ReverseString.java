package assignment1;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String str;
	int strLen;
	String str1="";
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string: ");
	str=scan.next();
	strLen=str.length();
	for(int charIdx=strLen-1;charIdx>=0;--charIdx) {
		 
		 str1=str1+str.charAt(charIdx);
		 
		
	}
	System.out.println("Reverse of the String is: "+str1);
	
}
}
