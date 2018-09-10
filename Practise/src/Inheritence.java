
public class Inheritence {
	void add()
	{
		System.out.println("addition method inherited");
	}

}
class A extends Inheritence
{
	
}
class B extends A
{
public static void main(String[] args) {
		
		B a=new B();
		a.add();
	}

}

