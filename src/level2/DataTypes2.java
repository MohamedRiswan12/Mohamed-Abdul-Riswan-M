package level2;

public class DataTypes2 {
public static void main(String[] args) {
	Xyz obj=new Xyz();
	Xyz obj2=new Xyz();
	
	obj.y=50;
	System.out.println(obj2.y);
	System.out.println(obj.x);
	
	
}
}
class Xyz{
	static int x=10;
	int y=20;
}