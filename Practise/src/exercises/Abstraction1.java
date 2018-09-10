package exercises;
abstract class Ab
{
	void method()
	{
		System.out.println("normal method called in abstract class");
	}
	
	abstract void method2();
}
interface Int
{
	int a=10;
	abstract void method3();
	
}

public class Abstraction1 extends Ab implements Int 
     {

	public void method3() {
		
		System.out.println("Nisar");
	}
   public void method2()
   {
	   System.out.println("abstract method");
   }

	public static void main(String[] args)
	{
		//int a=20;
		Abstraction1 a1=new Abstraction1();
		a1.method3();
		System.out.println(Int.a);
		a1.method2();
	}

	
	}