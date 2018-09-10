package exercises;

public class Static2 {

	void add()
	{
		this.mul();
		System.out.println("addition method called");
	}
	static void sub()
	{   
		System.out.println("subtraction method called");

	}
	void mul()
	{
		System.out.println("subtraction method called");

		
	}
	public static void main(String[] args)
	{
		Static2 s=new Static2();
		s.add();
		sub();
		
	}
}
