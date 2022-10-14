package assignment1;
import java.util.Scanner;

public class SquarePattern2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the square Pattern");
	int size=scan.nextInt();
	int col=1;
	do {
		int row=1;
		do {
			System.out.print("# ");
			row++;
		}while(row<=size);
		System.out.println();
		col++;
	}while(col<=size);
}
}
