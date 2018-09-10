package exercises;

class Sq
{
	void find(int side)
	{
		System.out.println("Area of square is "+ side *side);
	}
	
}
class Rt extends Sq
{
	void find(int length,int breadth) 
	{
		System.out.println("Area of Rectangle is "+ length *breadth);
    }
}
public class Overload1 extends Rt{

	void find(float breadth,float height,float side)
	{
		System.out.println("Area of triangle is "+ 0.5f*(breadth*height*side));

	}
	public static void main(String[] args) 
	{
		Overload1 ov=new Overload1();
		ov.find(10);
		ov.find(20, 50);
		ov.find(20, 90, 1);
		}

}
