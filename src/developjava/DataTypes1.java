package developjava;

public class DataTypes1 {
public static void main(String[] args) {
	int x=100;
	
	Integer xx=100;
	Integer xxx=Integer.valueOf(x);
	x=xx;//auto unboxing 
	x=xx.intValue(); //unboxing
	byte b=120;
	Byte bb=Byte.valueOf(b);
	Integer xxxx=Integer.compare(20,20);
	System.out.println(xxxx);int n=Integer.parseInt("1232");
	System.out.println(n+22);
	

	
}
}
