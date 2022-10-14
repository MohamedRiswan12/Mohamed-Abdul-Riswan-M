package assignment1;

public class Product1ToNum {
	public static void main(String[] args) {
		long product=1;
		final long LOWERBOUND=1L;
	final long UPPERBOUND=13L;
	
		for(int n=1;n<=UPPERBOUND;++n) {
			
            product*=n;
			//num=product;
			
		}
		System.out.println("Factorial of "+UPPERBOUND+" is "+product);
		
	}


}
