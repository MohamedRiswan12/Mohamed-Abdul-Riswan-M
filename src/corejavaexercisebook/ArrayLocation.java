package corejavaexercisebook;

import java.util.Scanner;

public class ArrayLocation {
public static void main(String[] args) {
	int arr[];
	int c=0;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter the size of the array");
	int size=scan.nextInt();
	arr=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("enter the elements in the aray");
		arr[i]=scan.nextInt();
	}
	System.out.println("enter the number");
	int num=scan.nextInt();
	for(int i=0;i<size;i++) {
		if(num==arr[i]) {
			System.out.println("the index of the element is"+i);
			
		}else {
			c++;
		}
	}if(c==size) {
		System.out.println("enter the correct number");
	}
	
}
}
