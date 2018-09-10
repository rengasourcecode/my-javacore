package exercises;

abstract class Shape1
{
	abstract int area(int a);
	
}
class Circle1 extends Shape1
{
	int area(int a)
	{
		return a*a;
	}
	
}
class Rectangle1 extends Shape1
{
	int area(int a)
	{
		return a*a*a;
	}
}
public class Abstract1 {

	public static void main(String[] args)
	{
		Circle1 s1= new Circle1();
		Rectangle1 s2=new Rectangle1();
		System.out.println(s1.area(5));
		System.out.println(s2.area(5));
		
	}

}
