package exercises;

class Shape
{
	float side=10,
	radius=7,length=20,breadth=30,height=40;
}
class Square extends Shape
{
	void squarearea()
	{
		float sw= radius* radius;
		System.out.println("Area of circle is "+ sw +"cm(sq)");
	}
}
class Rectangle extends Shape
{
	void rectanglearea()
	{ 
		float r= breadth* height;
	   System.out.println("Area of rectangle is "+ r +"square");
	
	}
}
class Triangle extends Shape
{
	void trianglearea()
	{
		float t=0.5f* breadth* height;
		System.out.println("Area of triangle is "+ t +"square");
		
		
	}
}
public class Inherit1 {

	public static void main(String[] args) {
	
/*Inherit1 a=new Inherit1();
a.squarearea();
a.rectanglearea();
a.trianglearea();*/
		Square s =new Square();
		s.squarearea();
		Rectangle r = new Rectangle();
		r.rectanglearea();
		Triangle t=new Triangle();
		t.trianglearea();
	}

}
