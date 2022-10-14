package developjava;

public class InherDemo7 {
	public static void main(String[] args) {
		DominoPizza pizza=new RiswanPizza();
		pizza.shape();
		pizza.collectMoney();
		pizza.deliveryPizza();
		
	}
	}
	abstract class DominoPizza{
		public final void shape() {
			System.out.println("round round");
			
		}
		public final void makePizza() {
			System.out.println("As per the domino logic");
			
		}
		public abstract void collectMoney();
		public abstract void deliveryPizza();
	}
	class RiswanPizza extends DominoPizza{
		RiswanPizza(){
			
		}
		public void collectMoney() {
			System.out.println("If iam in india i collect money in rupees");
			
		}
		public void deliveryPizza(){
			System.out.println("if iam in russia i delivery pizza in car");
		}
}
