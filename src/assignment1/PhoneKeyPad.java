package assignment1;

import java.util.Scanner;

public class PhoneKeyPad {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a name");
	String str=scan.next().toLowerCase();
	int strlen=str.length();
	scan.close();
	for(int i=0;i<=strlen-1;i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c') {
			System.out.print(2);
	}if(str.charAt(i)=='d'||str.charAt(i)=='e'||str.charAt(i)=='f') {
		System.out.print(3);}
	if(str.charAt(i)=='g'||str.charAt(i)=='h'||str.charAt(i)=='i') {
		System.out.print(4);}
	if(str.charAt(i)=='j'||str.charAt(i)=='k'||str.charAt(i)=='l') {
		System.out.print(5);}
	if(str.charAt(i)=='m'||str.charAt(i)=='n'||str.charAt(i)=='o') {
		System.out.print(6);}
	if(str.charAt(i)=='p'||str.charAt(i)=='q'||str.charAt(i)=='r'||str.charAt(i)=='s') {
		System.out.print(7);}
	if(str.charAt(i)=='t'||str.charAt(i)=='u'||str.charAt(i)=='v') {
		System.out.print(8);}
	if(str.charAt(i)=='w'||str.charAt(i)=='x'||str.charAt(i)=='y'||str.charAt(i)=='z') {
		System.out.print(9);}
}
}}
