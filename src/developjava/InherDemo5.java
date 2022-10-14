package developjava;

public class InherDemo5 {
	public static void main(String[] args) {
		Maps map=new MyMap();
		System.out.println(map.money);
		map.wayToChennai();
		
	}
	}
	class Maps{
		int money=1000;
		public void wayToChennai() {
			System.out.println("Cler cut picture is drawn in this method way ");
		}
		// by extending a class. the sub class can enjoy all the properties and methods of super class

	}
	class MyMap extends Maps{
			//overriding a super class method..
	//public void wayToChennai() {
//			System.out.println("My logic is drawn in this method");
//		}
}
