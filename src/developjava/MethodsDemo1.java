package developjava;

public class MethodsDemo1 {
	public static void main(String[] args) {
		Cook obj=new Cook();
		int[] myarray=new int[5];
		obj.cutVeg(myarray);
		obj.cutVeg(new int[] {10,20,30});//passing an anonymous array
		
		//to call a varargs method
		obj.cut(10,20,30,40);
		obj.met(new Temp());
		
		obj.met2(new Temp[] {new Temp(),new Temp()});
		
		obj.met4(new Temp(),new Temp(),new Temp());
	}
}
class Cook{
	public void cutVegetables() {
		
	}
	//method overloading
	public void cutVegetables(int i) {
		
	}
	
	public void cutVeg(int arr[]) {
		
	}
	
	//varargs type of declaration
	
	public void cut(int... i) {
		
	}
	public void met(Temp temp) {
		
	}
	
	public void met2(Temp[] temp) {
		
	}
	
	public void met4(Temp... temp) {
		
	}
}
class Temp{
	
}


