package developjava;

public class InherDemo6 {
	public static void main(String[] args) {
		
	}
	}
	class WayToChennai{
		//the rule of the super class method, this method shoould not be overriden
		//all super class methods which are having a logic should be declared final
		//the sub class should never ever or could not override it ever
		//having final for the super class methods with logic is a must
	public final void map() {
		System.out.println("way is defined....");
		
	}


	}
	class MyWayToChennai extends WayToChennai{
//		public void map() {
//			
//		}
		
}
