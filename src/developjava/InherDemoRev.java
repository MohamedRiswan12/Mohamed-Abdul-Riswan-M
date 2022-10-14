package developjava;

import java.util.Scanner;

public class InherDemoRev {
public static void main(String[] args) {
	//BadFan shaitan=new BadFan();
	GoodFan khaitan=new GoodFan();
	Scanner scan=new Scanner(System.in);
	while (true) {
		System.out.println("press enter to pull fan...");
		scan.next();
		khaitan.pull();
	}
	
}
}
//super man- kirukku code
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
		}else if(state==1){
			System.out.println("low speed state");
		}else if(state==2) {
			System.out.println("medium speed state");
		}else if(state==3) {
			System.out.println("High speed state");
		}else {
			System.out.println("switch of state");
		}
	}
}
class GoodFan{
	//to eliminate conditions, you need to convert the conditions to classes
	State state=new SwitchOffState();
	public void pull() {
		state.changeFanState(this);
	}
}

abstract class State{
	public abstract void changeFanState(GoodFan fan);
}
class SwitchOffState extends State{
	public void changeFanState(GoodFan fan) {
		System.out.println("switch on state");
		fan.state=new SwitchOnState();
	}
	
}
class SwitchOnState extends State{
	public void changeFanState(GoodFan fan) {
		System.out.println("low speed state..");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	public void changeFanState(GoodFan fan) {
		System.out.println("high Speed state");
		fan.state=new HighSpeedState();
		
	}
}
class HighSpeedState extends State{
	public void changeFanState(GoodFan fan) {
		System.out.println("switch Off State");
		fan.state=new SwitchOffState();
	}
}


























