package assignment1;

public class ComputePi {
	public static void main(String[] args) {
		double sum=0.0;
		int max_denominator=1000;
		for(double denominator=1;denominator<=max_denominator;denominator+=2) {
			
			if(denominator%4==1) {
				sum=sum+(1/denominator);
				}
				else if (denominator%4==3) {
					sum=sum-(1/denominator);
					
				}
				else {
					System.out.println("Impossible!!");
				}
			
			}
		double pi=4*sum;
		
		System.out.println("Pi is " + pi);
	}

}
