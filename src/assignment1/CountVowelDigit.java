package assignment1;

import java.util.Scanner;

public class CountVowelDigit {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
System.out.println("Enter the String: ");
String str=scan.next().toLowerCase();
int strlen=str.length();
int vow=0;
int dig=0;
scan.close();
for(int i=0;i<=strlen-1;i++) {
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
vow=vow+1;
System.out.println(str.charAt(i));

	}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
		dig=dig+1;
		System.out.println(str.charAt(i));
	}
}
	double pv=(double)vow/strlen*100;
	double pd=(double)dig/strlen*100;
	System.out.print("number of vowel : "+vow+"=");
	System.out.printf("%.2f%n ",pv);
	System.out.print("number of digit : "+dig+"=");
	System.out.printf("%.2f%n ",pd);
}
}
