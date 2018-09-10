package Demo;

public class Forloop{

	public static void main(String[] args) {
		
		/*for printing 5 10 15 upto 100
		
		 for(int i=5;i<=100;i+=5)
		   {
			    System.out.println(i);
		   }*/
		
		/*for printing  12345
		                12345
		                12345
		                12345
		                12345 
		 */               
		for (int i=1;i<=5;i++)
		{
			  for (int a=1;a<=5;a++)
			{
		         System.out.print(a);
			}
			    System.out.println();
		}
        
		/*for printing  11111
                        22222
                        33333
                        44444
                        55555 

		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=5;a++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		/*for printing 1
		               12
		               123
		               1234
		               12345 
		 
		for (int i=1;i<=5;i++)
		{
			for(int a=1;a<=i;a++)
			{
				System.out.print(a);
			}
			System.out.println();
			
		}*/
		
		/*for printing 1
		               22
		               333
		               4444
		               55555
		 
		for (int i=1;i<=5;i++)
		{
			for(int a=1;a<=i;a++)
			{
				System.out.print(i);
			}
			System.out.println();	
		}*/	
		
		/*for printing 55555
		               4444
		               333
		               22
		               1
		
		for (int i=5;i>=1;i--)
		{
			for(int a=i;a>=1;a--)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		/* for printing     1
		                   2 2
		                  3 3 3
		                 4 4 4 4
		                5 5 5 5 5 */
		
	/*for (int i = 1; i <=5; i++) 
	{ 
		for (int b = 1; b <=5 - i; b++) 
	   {  
			System.out.print(" ");
	   }
	    for (int c = 1; c <= i; c++)
	{  
	    	System.out.print(i + " ");
	} 
	        System.out.println();
	}*/

}
}
