package developjava;

public class ProtoTypeDemo {
public static void main(String[] args) throws Exception{
	//singleton resources and properties are both shared
//	Sheep mothersheep=new Sheep();
//	Sheep dolly=mothersheep;
//	mothersheep.name="iam the mother";
//	System.out.println(dolly.name);
	
	
	//multiton
//	Sheep mothersheep=new Sheep();
//	Sheep dolly=new Sheep();
//	mothersheep.name="iam the mother";
//	System.out.println(dolly.name);
	
	
	//prototype
	Sheep mothersheep=new Sheep();
	Sheep dolly=mothersheep.createClone();
	mothersheep.name="iam the mother";
	System.out.println(dolly.name);
	System.out.println(mothersheep.name);
}
}
class Sheep implements Cloneable{
	String name;
	public Sheep(){
		System.out.println("Sheep object Created");
		
	}
	public Sheep createClone()throws Exception {
		return (Sheep)super.clone();
		}
}