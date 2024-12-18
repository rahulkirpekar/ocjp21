package oops.classtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student Array
		
//		Student s1 = new Student();//s1--[rno name std marks]
//		Student s2 = new Student();//s2--[rno name std marks]
//		Student s3 = new Student();//s3--[rno name std marks]
	
		
		
		
		// s -- reference variable(address<----object)
		
		// Student--Object---Run(Instance--Instance Variables)
//		System.out.println("s1==>" + s1);
//		System.out.println("s2==>" + s2);
//		System.out.println("s3==>" + s3);

		Student s[] = new Student[5];
		
		System.out.println("s===>"+s);
		
		
		for(int i = 0 ; i < s.length ; i++) 
		{
			// i--[0,1,2,3,4]
			// s[0]
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i].dispData();
		}

//		s2.dispData();
//		s3.dispData();
	}
}