package developjava;

public class TernaryDemo {
public static void main(String[] args) {
	int a=10;
	int b=20;
	String result=(a<b)?"a is lesser than b":"a is not lesser than b";
	
			boolean bbresult=(a>b)?true:false;
			
			int iresult=(a>b)?100:200;
			
			boolean bresult=(a<b)?(a!=10)?true:false:false;
			
			System.out.println(bresult);
}
}
