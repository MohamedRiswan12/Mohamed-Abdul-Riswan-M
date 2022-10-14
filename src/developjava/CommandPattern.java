package developjava;

public class CommandPattern {

}
class ChithiCitizen{
	public void getDeathCertificate(){
}
}
class AmmaCitizen{
	static SevaCenter sc;
	static {
		sc=new SevaCenter();
		sc.setCommand(1,new Governor());
	}
	public void getDeathCertificate() {
		sc.executeCommand(1);
	}
}
class SevaCenter{
	Command c[]=new Command[5];
	public SevaCenter() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
			
		}
	}
	public void setCommand(int slot,Comman)
	
	
	
	
	
	
	
	
	
}