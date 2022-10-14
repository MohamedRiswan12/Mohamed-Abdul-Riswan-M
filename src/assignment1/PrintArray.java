package assignment1;

import java.util.Scanner;

public class PrintArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter ther number of items: ");
	int num=scan.nextInt();
	int[] items;
	System.out.println("enter the values for all the items: ");
	String j=scan.next();
	items=new int[num];
	if(items.length>0) {
		for(int i=0;i<items.length;i++) {
			items[i]=j.charAt(i);
			
			
		}
	}
	System.out.print("[");
	for(int i=0;i<items.length;i++) {
		if(i==0) {
			System.out.print((char)items[i]);}
		else {
			System.out.print(","+(char)items[i]);
		
	}
	}
	System.out.print("]");
	scan.close();
}
}
