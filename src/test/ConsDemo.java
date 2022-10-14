package test;

public class ConsDemo {
public static void main(String[] args) {
	//Table obj=new DiningTable();
	//Table obj2=new ComputerTable();
	Table key=ComputerTable.met();
	
}
}
abstract class Table{
	
	Table() {
		System.out.println("hello");
		
	}
}
class ComputerTable extends Table{
private ComputerTable(){
	System.out.println("hello ComputerTable");
	
}
static ComputerTable met() {
	return new ComputerTable();
}
}
class DiningTable extends Table{
	DiningTable(){
		System.out.println("DiningTable Called");
	}
}