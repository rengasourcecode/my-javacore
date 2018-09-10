package exercises;

public class Usingthis {
	
	int rollno;
	String name;
	
	Usingthis()
	{
		this(54,"jhvhjv");
	}
	

	Usingthis(int rollno,String name)
	{
		this.rollno=rollno;
	    this.name=name;
		System.out.println(rollno+ " "+name);
	}
	
	 void display()
	{
		Usingthis ut= new Usingthis(10,"renga");
	}
	
	
	/*public static void main(String[] args) {
		
		Usingthis ut=new Usingthis(10,"Ravi");
		ut.display();
		System.out.println(ut.rollno);
	}*/

}

class derived extends Usingthis
{
	derived()
	{
		System.out.println(100);
	}
public static void main(String[] args) {
		
		derived D=new derived();
		D.display();
	//display();
		
}
}
