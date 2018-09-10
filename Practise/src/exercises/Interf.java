package exercises;

public class Interf  implements Interface1,InterfaceIN
{
public void test()
{
	System.out.println("Test method in Interface1 is called");
}
public void add()
{
	System.out.println("add method in Interface2 is called");
}
	public static void main(String[] args)
	{
		Interf iff = new Interf();
		iff.add();
		iff.test();
	}

}
