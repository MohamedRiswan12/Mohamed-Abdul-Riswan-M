package assignment1;

public class SumAverage {
	public static void main(String[] args) {
		int count=0;
		int LOWERBOUND=111;
		int UPPERBOUND=8899;
		double average=0;
		int sum=0;
		
		for(int number=LOWERBOUND;number<=UPPERBOUND;++number) {
		count+=number;
		average=(count/(UPPERBOUND-LOWERBOUND));
		sum+=number;
		++count;
		
		}
		System.out.println("average is"+average);
		System.out.println("sum:"+sum);
	}

}
