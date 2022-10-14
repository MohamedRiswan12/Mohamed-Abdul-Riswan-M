package assignment1;

public class Swap2Integers {
	public static void main(String[] args) {
		int firstNumber=10,secondNumber=9;
		System.out.println("Before Swap Number 1:"+firstNumber);
		System.out.println("before Swap Number 2:"+secondNumber);
		int temp;
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		System.out.println("After Swap Number 1:"+firstNumber);
		System.out.println("After Swap Number 2:"+secondNumber);
	}

}
