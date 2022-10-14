package assignment1;

import java.util.Scanner;
public class TestPalindromeWord {
	public static void isPalindrome(String str) {
		String rev="";
		boolean ans=false;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			ans=true;
			System.out.println("It Is A Palindrome");
		}else {
	System.out.println("It Is Not A Palindrome");
	}}
	
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Word : ");
	String str=scan.next().toLowerCase();
	isPalindrome(str);
	
	
}
}
