package oops.abstopic.interfacetopic.concept;

public interface A 
{
	// 1) constant variables---[public static final]
	public int NO = 10;// static final

	// 2) Abstract Method--[public abstract]
	abstract void test1();// public  
	public abstract void test2();  
	
	// 3) Non-Abstract Method(private,default,static)

	// java-8
	static void test3()
	{
		System.out.println("A--static test3()");
	}
	// java-8
	default void test4()
	{
		System.out.println("A--default test4()");
		test5();
	}
	// java-9
	private void test5()
	{
		System.out.println("A--private test5()");
	}
}
