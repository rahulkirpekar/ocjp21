package oops.polymorphism.compiletime;

// 12.324f----(float)
// 12.324 ----(default)----double

// CompileTime Polymorphism
public class MethodOverloaddingTopic 
{
	public static void addFun(int no1,int no2) 
	{
		System.out.println("No1 : " + no1);
		System.out.println("No2 : " + no2);
		int ans = no1+no2;
		System.out.println("Addition(int two args) : "+ans);
	}
	public static void addFun(long no1,long no2) 
	{
		System.out.println("No1 : " + no1);
		System.out.println("No2 : " + no2);
		long ans = no1+no2;
		System.out.println("Addition(long two args) : "+ans);
	}
	public static void addFun(float no1,float no2) 
	{
		float ans = no1+no2;
		System.out.println("Addition(float two args) : "+ans);
	}
	public static void addFun(double no1,double no2) 
	{
		double ans = no1+no2;
		System.out.println("Addition(double two args) : "+ans);
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		int ans = no1+no2+no3;
		System.out.println("Addition(int three args) : "+ans);
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		int ans = no1+no2+no3+no4;
		
		System.out.println("Addition(int four args) : "+ans);
	}
	
	public static void main(String[] args) 
	{
		addFun(10L, 20L);
		
//		addFun(10,20);
	}
}
// Rules of Method  Overloadding 
// 1) argument count
// 2) excat datatype match
// 3) Type pramotion Rule

