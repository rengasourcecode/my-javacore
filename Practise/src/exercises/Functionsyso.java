package exercises;

public class Functionsyso {

	 String catch1()
	{
		//System.out.println("method called via syso");
		return "Method called via syso";
	}
	 int catch2(int a)
	{
		return a*a;
	}
	 String catch3(String s)
	{
		return s;
	}
	public static void main(String[] args)
	{
		Functionsyso fs=new Functionsyso();
		System.out.println(fs.catch1());
		System.out.println(fs.catch2(10));
		System.out.println(fs.catch3("DINESH SURE SHOT GOING"));
		
	}
}
