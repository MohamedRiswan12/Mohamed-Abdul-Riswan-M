package level2;

public class ArrayDemo {
	public static void main(String[] args) {
		int x=10;
		int[] nums= {10,20,30,40};
		System.out.println(nums[2]);
		System.out.println(nums.length);
		nums[2]=100;
		System.out.println(nums[2]);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
			
		}
		for(int j:nums) {
			System.out.println(j);
		}
		
	}

}
