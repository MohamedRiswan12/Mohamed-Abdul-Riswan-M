package assignment1;

import java.util.Scanner;

public class CylinderComputation {
public static void main(String[] args) {
		
		double radius,volume,surfaceArea,baseArea,height;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius");
		radius=in.nextDouble();
		System.out.println("Enter the Height:");
		height=in.nextDouble()
;		baseArea=Math.PI*radius*radius;
		surfaceArea=2.0*Math.PI*2.0*baseArea;
		volume=baseArea*height;
		System.out.printf("Base Area is: %.2f%n",baseArea);
		System.out.printf("Surface Area is : %.2f%n ",surfaceArea);
		System.out.printf("Volume is : %.2f%n ",volume);
	
		
		
		
}
}
