package developjava;

public class ClassDemo {
public static void main(String[] args) {

	TrainingRoom tr1=new TrainingRoom();
	TrainingRoom tr2=new TrainingRoom();
	System.out.println(tr1.toi);
	System.out.println(tr1.taa);
	System.out.println(tr2.toi);
	System.out.println(tr2.taa);
	
	
	
}
}
class TrainingRoom {
	static Toilet toi=new Toilet();
	Table taa=new Table();
	
}
class Toilet{
	
	
	
}
class Table{
	
}