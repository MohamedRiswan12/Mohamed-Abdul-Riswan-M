package level2;

public class ArrayDemo3 {
public static void main(String[] args) {
	int arr[]=new int[4];// {i,i,i,i}
	String[] s=new String[3];
	arr[1]=100;
	for (int i:arr) {
		System.out.println(i);
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	s[0]="new college";
	s[1]="siet";
	s[2]="nandanam college";
	for (String str:s) {
		System.out.println(str);
		
	}
	for (int i=0;i<s.length;i++) {
		System.out.println(s[i]);
		
	}
	
}
}
