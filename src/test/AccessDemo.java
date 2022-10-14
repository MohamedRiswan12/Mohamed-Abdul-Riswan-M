package test;
import developjava.AccessSpecifier;
public class AccessDemo extends AccessSpecifier{
	AccessSpecifier obj= new AccessSpecifier();
	void met() {
		System.out.println(pro);
	//	System.out.println(nomod);
		//System.out.println(pri);
		System.out.println(pub);
	}
}
class DiffPackNonSubClass {
	AccessSpecifier obj= new AccessSpecifier();
	void met() {
		//System.out.println(obj.pro);
		//System.out.println(obj.nomod);
		//System.out.println(obj.pri);
		System.out.println(obj.pub);
	}
}
