package assignment1;


public class ExtractDigits {
public static void main(String[] args) {
	int n=12345;
	while(n>0) {
		int digit=n%10;
		System.out.print(" "+digit);
		//int b=n;
		n=n/10;
	}
}
}
