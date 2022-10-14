package developjava;

public class SingleTonPattern {
public static void main(String[] args) {
	Resource obj=Resource.createSingleTonInstance();
	System.out.println(obj);
	Resource obj2=Resource.createSingleTonInstance();
	System.out.println(obj2);
}
}
class Resource{
	private static Resource obj;
	static{
		System.out.println("static block is called");
	}
	private Resource(){
		System.out.println("Private resource Object created");
	}
	public static Resource createSingleTonInstance() {
		if(obj==null) {
			obj=new Resource();
		}
		return obj;
	}
}