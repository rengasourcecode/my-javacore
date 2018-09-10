
public class Methodscalling {

	void add()
	{
		System.out.println("Addition method called");
	}
	void sub()
	{
		System.out.println("Subtraction method called");
		add();
		mul();	
	}
	static void mul()
	{
		System.out.println("multiplication method called");
	}
	public static void main(String[] args)
	{
		Methodscalling ab= new Methodscalling();
		//Methodscalling.mul();
		mul();
		ab.sub();
		
	}

}

