package assignment1;

public class CozaLozaWoza1 {
	public static void main(String[] args) {
		boolean printed ;
		final int LOWERBOUND=1,UPPERBOUND=110;
		for(int number=LOWERBOUND;number<=UPPERBOUND;++number) {
			printed=false;
		if(number%3==0) {
			System.out.print("Coza");
			printed=true;}
		if(number%5==0) {
			System.out.print("Loza");
			printed=true;}
		if(number%7==0) {
			System.out.print("Woza");
			printed=true;
		}
		if(!printed) {
			System.out.print(number);
			}
		if (number%11==0) {
			System.out.println();
			
		}
		else {
			System.out.print(" ");
		}
		}
	}

}
