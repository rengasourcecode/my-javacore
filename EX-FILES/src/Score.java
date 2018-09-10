import java.util.Scanner;

 public class Score
{
	int a =10 ,b=20,c=40;
    int add()
	{
		return(a+b+c);
	}
	int mul()
	{
		return(a*b*c);

	}
	void data ()
	{
		Score s= new Score();
		System.out.println(s.add());
		System.out.println(s.mul());
     }
	static void forloop()
	{
		for(int i =0;i<10;i++) 
		{
			System.out.println(i);
		}
	}
}

  class Results extends Score
{
	public static void main(String[] args) {
	Results r=new Results();
		//r.add();
		//r.mul();
	r.data();
	forloop();
	}
	}
