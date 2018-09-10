import java.util.Scanner;

public class Tryingthis {
int a,b;
//Tryingthis()
//{}
void setdata (int a,int b)
{
	this.a=a;
	this.b=b;
}
	void display()
	{
	System.out.println("the value of a is :" + a);
	System.out.println("the value of b is :" + b);
}
}
class Execute extends Tryingthis
{
	public static void main(String[] args) {
		int num1,num2;
		Execute obj =new Execute();
		obj.setdata(10,20);
		obj.display();
		//Execute obj2 =new Execute();
        //obj2.setdata(30, 40);
		//obj2.display();
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=number.nextInt();
		System.out.println("Enter the second number");
		num2=number.nextInt();
		Execute obj2 =new Execute();
        obj2.setdata(num1, num2);
		obj2.display();
		

		

       
		
		
	}
}