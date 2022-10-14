package level2;

public class DataTypes {
	int x=10;
	static int y=100;
	final int z=100;
	
public static void main(String[] args) {
	final float pi=3.14f;
	System.out.println(y);
	int a=10;
	DataTypes obj=new DataTypes();
	obj.met();
	
	
}
public void met() {
	int i=10;
	System.out.println("value of i:"+i);
}
}
