package assignment1;

import java.util.Scanner;

public class ExchangeCipher {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str;
		System.out.println("Enter a plain text string: ");
		str=scan.next().toUpperCase();
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='A') {
				System.out.print((char)('Z'));
			}if(str.charAt(i)=='B') {
				System.out.print((char)('Y'));
			}if(str.charAt(i)=='C') {
				System.out.print((char)('X'));
			}if(str.charAt(i)=='D') {
				System.out.print((char)('W'));
			}if(str.charAt(i)=='E') {
				System.out.print((char)('V'));
			}if(str.charAt(i)=='F') {
				System.out.print((char)('U'));
			}if(str.charAt(i)=='G') {
				System.out.print((char)('T'));
			}if(str.charAt(i)=='H') {
				System.out.print((char)('S'));
			}if(str.charAt(i)=='I') {
				System.out.print((char)('R'));
			}if(str.charAt(i)=='J') {
				System.out.print((char)('Q'));
			}if(str.charAt(i)=='K') {
				System.out.print((char)('P'));
			}if(str.charAt(i)=='L') {
				System.out.print((char)('O'));
			}if(str.charAt(i)=='M') {
				System.out.print((char)('N'));
			}if(str.charAt(i)=='N') {
				System.out.print((char)('M'));
			}if(str.charAt(i)=='O') {
				System.out.print((char)('L'));
			}if(str.charAt(i)=='P') {
				System.out.print((char)('K'));
			}if(str.charAt(i)=='Q') {
				System.out.print((char)('J'));
			}if(str.charAt(i)=='R') {
				System.out.print((char)('I'));
			}if(str.charAt(i)=='S') {
				System.out.print((char)('H'));
			}if(str.charAt(i)=='T') {
				System.out.print((char)('G'));
			}if(str.charAt(i)=='U') {
				System.out.print((char)('F'));
			}if(str.charAt(i)=='V') {
				System.out.print((char)('E'));
			}if(str.charAt(i)=='W') {
				System.out.print((char)('D'));
			}if(str.charAt(i)=='X') {
				System.out.print((char)('C'));
			}if(str.charAt(i)=='Y') {
				System.out.print((char)('B'));
			}if(str.charAt(i)=='Z') {
				System.out.print((char)('A'));
			}
		}
		
	}
}
