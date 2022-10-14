package developjava;

public class InnerClasses {
public static void main(String[] args) {
	KaliMark.Bovonto obj=new KaliMark().new Bovonto();
	KaliMark.Cola obj1=new KaliMark.Cola();
	obj.met();
}
}
class KaliMark{
	private int money;
	class Bovonto{
		public void met() {
			System.out.println(money);
		}
	}
	static class Cola{
		
		
	}
	
}