package corejavaexercisebook;

import java.util.Scanner;

public class ResizeAnArray {
public static void main(String[] args) {
	int len=5;
	int[] arr=new int[len];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	len=7;
	arr=new int[len];
	arr[5]=6;
	arr[6]=7;
	System.out.println(arr.length);
}
}
