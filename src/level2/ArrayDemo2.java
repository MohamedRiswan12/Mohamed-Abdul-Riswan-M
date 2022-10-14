package level2;

public class ArrayDemo2 {
public static void main(String[] args) {
	int[][] arr={{10,20,30},
	{22,12,122,1221},
	{23,33,43}};
	System.out.println(arr[0][1]);
	System.out.println(arr.length);
	System.out.println(arr[1].length);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+"\t");
		}
		System.out.println();
		
		
	}
			
		
		for(int i[]:arr) {
		   for(int j:i) {
			System.out.println(j+"\t");
		}
		   System.out.println();
	}
}
}
