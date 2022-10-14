package assignment1;

import java.util.Scanner;

public class PrintArrayInStars {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the no of items");
	int num=scan.nextInt();
	System.out.println("enter the items ");
	String j=scan.next();
	int[] items;
	items= new int[num];
	
	if(items.length>0) {
		for(int i=0;i<items.length;i++) {
			items[i]=j.charAt(i);
			
			for(int jj=1;jj<=items[i];jj++) {
				
				System.out.print("*");
			}
		}
		
	}scan.close();
	for(int i=0;i<items.length;i++) {
		if(i==0) {
			
		}else {
			//System.out.println(/);
		}
	}
}
}
