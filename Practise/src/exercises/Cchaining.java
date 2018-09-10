package exercises;

public class Cchaining {

	Cchaining()
	{
	 System.out.println("chaining goin on");
	}
	Cchaining(String name,String name2)
	{
		//this();
		this("shah","rukh","khan");
		String a,b;
		a=name;
		b=name2;
		System.out.println(a +" "+ b);
	
	}
	Cchaining(String name,String name2,String name3)
	{
		//this();
		String a,b,c;
		a=name;
		b=name2;
		c=name3;
		System.out.println(a +" "+ b + c);
	
	}
	public static void main(String[] args) {
		Cchaining chain=new Cchaining("aamir","khan");
		//Cchaining fg=new Cchaining();
		
	}
}
