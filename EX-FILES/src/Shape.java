import java.util.Scanner;

public class Shape {
    //double  ac,as,ar;
    
	 static void circle(double r)
	{
		double ac;
		ac =(3.14 * r * r);
		System.out.println("the area of circle is" + ac);
	}
	static void  square (double a) 
	{
		double as;
		as = (a*a);
		System.out.println("the area of square is" + as);

	}
     static void rectangle(double l,double b)
	{
    	 double ar;
    	 square(5);
		ar=(0.5 * l * b);
		System.out.println("the area of rectangle is" + ar);

	}
	public static void main(String[] args)
	{
		double radius ,side,length,breadth;
		Scanner number =new Scanner(System.in);
		System.out.println("Enter the radius");
		radius=number.nextDouble();
		System.out.println("Enter the side ");
		side=number.nextDouble();
		System.out.println("Enter the Length ");
		length=number.nextDouble();
		System.out.println("Enter the Breadth ");
		breadth=number.nextDouble();
		Shape s = new Shape();
		circle(radius);
		square(side);
		s.rectangle(length,breadth);
	
	}
	
}



