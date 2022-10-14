package level2;

public class DataTypes3 {
public static void main(String[] args) {
	HouseMember father=new HouseMember();
	HouseMember mother=new HouseMember();
	HouseMember child=new HouseMember();
	HouseMember.income=10000;
	System.out.println("income before:"+HouseMember.income);
	father.expense=1000;
	mother.expense=500;
	child.expense=100;
	System.out.println(father.expense=100000);
	HouseMember.income=200;
	System.out.println(HouseMember.income);
}
}
class HouseMember{
	static int income;
	int expense;
	
}
