package corejavaexercisebook;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		int a;
		boolean aa;
		Scanner scan=new Scanner(System.in);
		float b=12.3f;
		a=scan.nextInt();
		aa=scan.hasNextBoolean();
		double bb=scan.nextDouble();
		char c='b';
		String d="hello";
		int cc=c;
		byte ddd=(byte)a;
		short aaa=ddd;
		System.out.println(a);
		System.out.println(b);
		System.out.println(aa);
		System.out.println(b);
		System.out.println(bb);
		System.out.println(c);
		System.out.println(d);
		System.out.println(cc);
		System.out.println(ddd);
		System.out.println(aaa);
		
	}

}
