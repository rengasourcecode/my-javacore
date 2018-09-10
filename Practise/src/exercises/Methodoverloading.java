package exercises;

public class Methodoverloading extends B
{
	int a=10;
	
	 void display()
	{ 
		 System.out.println(a);
		System.out.println("NAME : DINESH");
		System.out.println("SEX : MALE");
		//System.err.println(a);
	}
public static void main(String[] args) 
{
Methodoverloading mo=new Methodoverloading();
	mo.display();
	System.out.println(mo.b);
	//mo.display(172);
	//display();
	//display(72);
	}
}
class B
{
	int b =20;
	
	 void display()
	{
		System.out.println(b);
	}
}
