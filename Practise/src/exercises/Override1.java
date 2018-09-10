package exercises;
class Over
{
	void display()
	{
		for (int i=1;i<=4;i++)
		{
			for(int j=1 ;j<=4-i;j++)
			{ 
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*" + " ");
				}
			System.out.println();
		}
	}

	
}
public class Override1 extends Over {
	void display()
	{
		for (int i=1;i<=4;i++)
		{
			for(int j=1 ;j<=4-i;j++)
			{ 
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k + " ");
				}
			System.out.println();
		}
	}
	void getting()
	{
		display();
		System.out.println();
		super.display();
	}

	public static void main(String[] args) {
		Override1 ovv= new Override1();
		ovv.getting();
		

	}

}
