package developjava;

public class SwitchcaseDemo {
public static void main(String[] args) {
	int day=4;
	switch (day) {
		default:{
			System.out.println("enough");
			break;}
			case 1:{
				System.out.println("sunday");
				break;
				}
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
				
		}
	String sday="monday";
	switch(sday) {
	case "monday":
		System.out.println("day1");
		break;
	case "tuesday":
		System.out.println("day2");
		break;
		
			
	}
	char c='a';
	switch (c) {
	case 'a':{
		System.out.println("a for apple");
		break;
	}
	case 'b':{
		System.out.println("b for ball");
	}
	}
	
	}
}

