package exercises;

public class Trycatch {
	public static void main(String[] args)
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			//System.out.println(b);
			
		}
		catch(Exception e)
		
		{ 
			System.out.println(e);
		System.out.println("niZZZZZar");
			
		}
		finally
		{
			System.out.println("niZZZZZZZZZZar");
		}
		
		
	}

}
