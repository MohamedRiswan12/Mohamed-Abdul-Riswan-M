package developjava;

public class Product1ToN {
	public static void main(String[] args) {
		int product=1;
		final int LOWERBOUND=1;
	final int UPPERBOUND=10;
	
		for(int n=1;n<=UPPERBOUND;++n) {
			
            product*=n;
			//num=product;
			
		}
		System.out.println("Factorial of "+UPPERBOUND+" is "+product);
		
	}

}
