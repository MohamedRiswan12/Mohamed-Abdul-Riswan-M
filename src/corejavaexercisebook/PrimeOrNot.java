package corejavaexercisebook;

import java.util.Scanner;

public class PrimeOrNot {
	
		  public static void main(String[] args) {

		    int num;
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter a Number");
		    num=scan.nextInt();
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}
