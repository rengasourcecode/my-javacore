package exercises;

public class Mainoverloading {

	static void default1()
	{
		main(4);
	}
	public static void main(String[] args) 
	{
		Mainoverloading.default1();
		System.out.println("main one");
		
	}
	public static void main(int x) 
	{
		System.out.println("main with arguement" + x);
	}
	
}
