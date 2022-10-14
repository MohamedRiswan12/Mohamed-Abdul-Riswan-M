package assignment1;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the square Pattern");
		int size=scan.nextInt();
		for(int row=1;row<=size;row++) {
			for(int coloumn=1;coloumn<=size;coloumn++) {
				System.out.print("#"+" ");
			}System.out.println();
		}
	}

}
