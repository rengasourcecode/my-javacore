package exercises;

public class Overridding extends Bc {

   void display()
	{
		System.out.println("NAME : DINESH");
		System.out.println("SEX : MALE");
	}
	void weight()
	{
		//super.display();
		//display();
		//super.display();
		
	}
public static void main(String[] args) {
	Overridding or=new Overridding();
	//mo.display();
	or.weight();
	}
}
class Bc
{
	void display()
	{
		System.out.println("HEIGHT ");
	}
}

		
	
