package developjava;

public class MethodsDemo2 {
public static void main(String[] args) {
	Truck matador;
	Truck mazda[]=new Truck[5];
	mazda[0]=new Truck();
	mazda[1]=new Truck();
	MethodsDemo2 obj=new MethodsDemo2();
}
public void acceptOneTruck(Truck truck) {
}
public void acceptArrayOftrucks(Truck[] truck) {
}
public void acceptManyTrucks(Truck...truck) {
}
public String met() {
	return "aa";
}
public Truck getTruck(){
	return new Truck();
}
public Truck[] arrayTruck() {
	return new Truck[] {new Truck(),new Truck()};
}}

class Truck{
	
}