package developjava;

public class InherDemo4 {
	/* Advantages of inheritance
	 * 1. Child can replace parent
	 * 2. you can create a part whole hierarchy
	 * 3. you can eliminate if-else-if conditions
	 * 		rules - a. Convert the condition to classes
	 * 				b. Create a part whole hierarchy.
	 * 				c. Create a association between the classifier abstract class and
	 * 					the using class.
	 * 4. you can make the using object reusable
	 * 5. Composition (Foodd example)
	 *
	 * 6. Code Reusability
	 */
	public static void main(String[] args) {
		
	}
}
class IbacoIceCream{
	
}
abstract class Cream extends IbacoIceCream{
	
	
}
class Vanila extends Cream{
	IbacoIceCream iic;
	public Vanila() {
		
	}
	public Vanila(IbacoIceCream iic) {
		this.iic=iic;
	}
	public String toString(){
		return "Vanilla..."+iic;
	}
	
}
class Strawberry extends Cream{
	IbacoIceCream iic;
	public Strawberry() {
		
		
	}public StrawBerry(IbacoIceCream iic){
		
	}
}