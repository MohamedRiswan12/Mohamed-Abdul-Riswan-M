package developjava;

public class AccessSpecifier {
private int pri=10;
int nomod=12;
protected int pro=15;
public int pub=20;

class Access{
	
	void met() {
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
		System.out.println(pub);
	}
}
}
class SubClass extends AccessSpecifier{
	void met() {
	System.out.println(pro);
	System.out.println(nomod);
	//System.out.println(pri);
	System.out.println(pub);
}
}
class NonSubClass{
	AccessSpecifier obj= new AccessSpecifier();
	void met() {
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
	//	System.out.println(obj.pri);
		System.out.println(obj.pub);
	}
}