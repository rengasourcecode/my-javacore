
public class Usingsuper
{
Usingsuper(int a)

{ 
	System.out.println(a);
	
}

}
class ab extends Usingsuper
{
	ab()
	{
		super(100);
	}
	public static void main(String[] args) 
	{
		//Usingsuper sss=new Usingsuper();
		  ab d=new ab();
		}
}

