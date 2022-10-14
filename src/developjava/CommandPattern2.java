package developjava;

public class CommandPattern2 {
public static void main(String[] args) {
	//BadSon shoaib=new BadSon();
	//shoaib.serveFather();
	Servant servant=new Servant();
	servant.setCommand(new EatKadalaUrundaCommand(), 1);
	servant.setCommand(new PlayTTCommand(), 2);
	servant.setCommand(new PlayTTDoublesCommand(), 3);
	GoodSon shoiab=new GoodSon();
	shoiab.serveFather(servant);
}
}
class BadSon{
	public void serveFather() {
		Father myfather=new Father();
		myfather.eatkadalaUrunda();
		myfather.playTTGame();
	}
}
class GoodSon{
	public void serveFather(Servant servent) {
		KingFather myfather=new KingFather();
		myfather.eatkadalaUrunda(servant);
		myfather.playTTGame(servant);
	}
}
class KingFather{
public void eatkadalaUrunda(Servant servant) {
		servant.executeCommand(1);
		
	}
public void playTTGame(Servant servant) {
	servant.executeCommand(2);
	
}
public void playTTDoubleservant(Servant servant) {
	servant.executeCommand(3);
}
}
class Servant{
	Command2 c[]=new Command2[5];
	public Servant() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand2();
		}
	}
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	public void setCommand(Command2 command,int slot) {
		c[slot]=command;
	}
}
abstract class Command2{
	public abstract void execute();
}
class DummyCommand2 extends Command2{
	@Override
	public void execute() {
		System.out.println("i dont know this command sir...");
	}
}
class EatKadalaUrundaCommand extends Command2{
	@Override
	public void execute() {
		Lift lift=new Lift();
		lift.operateLift();
		Car car=new Car();
		car.driveCar();		
		PottiKadai kadai=new PottiKadai();
		kadai.buyKadalaUrunda();
	}
}
class PlayTTCommand extends Command2{
	@Override
	public void execute() {
		Tv tv=new Tv();
		tv.switchOn();
		tv.changeChannel();
		VGame vgame=new VGame();
		vgame.playTTGameSingles();		
	}
}
class PlayTTDoublesCommand extends Command2{
	@Override
	public void execute() {
		Tv tv=new Tv();
		tv.switchOn();
		tv.changeChannel();
		VGame vgame=new VGame();
		vgame.playTTGameDoubles();
	}
}
class Father{
	public void eatkadalaUrunda() {
		Lift lift=new Lift();
		lift.operateLift();
		Car car=new Car();
		car.driveCar();		
		PottiKadai kadai=new PottiKadai();
		kadai.buyKadalaUrunda();
	}
	public void playTTGame() {
		Tv tv=new Tv();
		tv.switchOn();
		tv.changeChannel();
		VGame vgame=new VGame();
		vgame.playTTGameDoubles();
	}
}
class Car{
	public void driveCar() {
		System.out.println("driving car....");
	}
}
class Tv{
	public void switchOn() {
		System.out.println("TV switch on...");
	}
	public void changeChannel() {
		System.out.println("channel changed....");
	}
}
class VGame{
	public void playTTGameSingles() {
		System.out.println("TT game singles...");
	}
	public void playTTGameDoubles() {
		System.out.println("TT game doubles...");
	}
}
class PottiKadai{
	public void buyKadalaUrunda() {
		System.out.println("buy and eat kadala urunda...");
	}
}
class WalkingTrack{
	public void walk() {
		System.out.println("walking on the walking track..");
	}
}
class Lift{
	public void operateLift() {
		System.out.println("operating lift...");
	}
}

















