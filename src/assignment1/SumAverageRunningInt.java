package assignment1;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum=0;
		double average;
		final int LOWERBOUND=1;
		final int UPPERBOUND=100;
		for (int number=LOWERBOUND;number<=UPPERBOUND;++number) {
			sum+=number;
			
		}
		average=(sum/100d);
		System.out.println("Sum is: "+sum);
		System.out.println("num is: "+average);
		
//		int number=LOWERBOUND;
//		while(number<=UPPERBOUND) {
//			sum+=number;
//			++number;
//		}
//		System.out.println("sum of the number:"+sum);
		int number=LOWERBOUND;
		do {
			sum+=number;
			++number;
		}while(number<=UPPERBOUND);
	}

}
