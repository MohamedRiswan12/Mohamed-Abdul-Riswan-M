package developjava;

public class BuilderPattern {
public static void main(String[] args) {
	Computer mycomputer=new Computer.BuildComputer().setCabinet("glass Cabinet").build();
	System.out.println(mycomputer);
}
}
class Computer{
	private String cabinet;
	private String ram;
	private String cpu;
	private String harddisk;
	public Computer(BuildComputer bc) {
		this.cabinet=bc.cabinet;
		this.ram=bc.ram;
		this.harddisk=bc.harddisk;
		this.cpu=bc.cpu;
		
	}
	public String toString() {
		return this.cabinet+":"+this.ram+":"+this.cpu+":"+this.harddisk;
	}
	
	static class BuildComputer {
		
		private String cabinet;
		private String ram;
		private String cpu;
		private String harddisk;
		
		
		
		
		 BuildComputer setCabinet(String cabinet) {
			 this.cabinet=cabinet;
			 return this;
			 
		 }
		 BuildComputer setRam(String ram) {
			 this.ram=ram;
			 return this;
			 
		 }
		 BuildComputer setCpu(String cpu) {
			 this.cpu=cpu;
			 return this;
			 
		 }
		 BuildComputer setHarddisk(String harddisk) {
			 this.harddisk=harddisk;
			 return this;
			 
		 }
		 public Computer build() {
			 return new Computer(this);
		 }
	}
	
	
}