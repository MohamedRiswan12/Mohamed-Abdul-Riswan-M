package assignment1;

public class HarmonicSum {
	public static void main(String[] args) {
		final int max_denominator=50000;
		double l2r=0.0;
		double r2l=0;
		double absDiff;
		for(double denominator=1;denominator<=max_denominator;++denominator) {
			double a=1/denominator;
			l2r+=a;
			
		}
		System.out.println("the sum from left to right is:"+l2r);
	for(double denominator =50000;denominator>=1;--denominator) {
		double a=1/denominator;
		r2l+=a;
		}
	System.out.println("the sum from right to left: "+r2l);
	
	if(l2r>r2l) {
		absDiff=l2r-r2l;
		
	}else {
		absDiff=r2l-l2r;
	}
	System.out.println("Abssolute difference between l2r and r2l is "+absDiff);
	}}



