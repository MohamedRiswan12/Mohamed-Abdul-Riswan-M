package assignment1;

public class AbsDiff {
	public static void main(String[] args) {
		int sumOdd=0;
		int sumEven=0;
		int absDiff;
		int a=1;
		int b=100;
		for(int number=a;number<=b;++number) {
			if(number%2==1) {
				sumOdd+=number;
			}
			else {
				sumEven+=number;
			}
		}
		System.out.println("sum of the sumOdd is:"+sumOdd);
		System.out.println("sum of the sumEven is:"+sumEven);
		if(sumOdd>sumEven) {
			absDiff=sumOdd-sumEven;
			
			
		}else {
			absDiff=sumOdd-sumEven;
			
		}
		System.out.println("Absolute Difference between sumOdd and sumEven is  "+absDiff);
		
		
	
}

}
