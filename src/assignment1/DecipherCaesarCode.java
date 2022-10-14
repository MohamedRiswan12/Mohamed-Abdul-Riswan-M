package assignment1;

import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str;
		System.out.println("Enter a plain text string: ");
		str=scan.next().toUpperCase();
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='A') {
				System.out.print((char)('A'+21));
			}if(str.charAt(i)=='B') {
				System.out.print((char)('B'+22));
			}if(str.charAt(i)=='C') {
				System.out.print((char)('C'+23));
			}if(str.charAt(i)=='D') {
				System.out.print((char)('D'-3));
			}if(str.charAt(i)=='E') {
				System.out.print((char)('E'-3));
			}if(str.charAt(i)=='F') {
				System.out.print((char)('F'-3));
			}if(str.charAt(i)=='G') {
				System.out.print((char)('G'-3));
			}if(str.charAt(i)=='H') {
				System.out.print((char)('H'-3));
			}if(str.charAt(i)=='I') {
				System.out.print((char)('I'-3));
			}if(str.charAt(i)=='J') {
				System.out.print((char)('J'-3));
			}if(str.charAt(i)=='K') {
				System.out.print((char)('K'-3));
			}if(str.charAt(i)=='L') {
				System.out.print((char)('L'-3));
			}if(str.charAt(i)=='M') {
				System.out.print((char)('M'-3));
			}if(str.charAt(i)=='N') {
				System.out.print((char)('N'-3));
			}if(str.charAt(i)=='O') {
				System.out.print((char)('O'-3));
			}if(str.charAt(i)=='P') {
				System.out.print((char)('P'-3));
			}if(str.charAt(i)=='Q') {
				System.out.print((char)('Q'-3));
			}if(str.charAt(i)=='R') {
				System.out.print((char)('R'-3));
			}if(str.charAt(i)=='S') {
				System.out.print((char)('S'-3));
			}if(str.charAt(i)=='T') {
				System.out.print((char)('T'-3));
			}if(str.charAt(i)=='U') {
				System.out.print((char)('U'-3));
			}if(str.charAt(i)=='V') {
				System.out.print((char)('V'-3));
			}if(str.charAt(i)=='W') {
				System.out.print((char)('W'-3));
			}if(str.charAt(i)=='X') {
				System.out.print((char)('X'-3));
			}if(str.charAt(i)=='Y') {
				System.out.print((char)('Y'-3));
			}if(str.charAt(i)=='Z') {
				System.out.print((char)('Z'-3));
			}
		}
		
	}
}
