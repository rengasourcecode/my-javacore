import java.util.Scanner;
import Demo.*;

//import Demo.Forloop;

public class Conditional extends  Forloop{

	static Scanner ac =new Scanner(System.in);

	public static void main(String[] args) {
		 //ac.close();
	       // System.out.println(age + gender + educated);
			//age=70;
			//gender="female";
			//educated="no";
		//int age;
		//String gender,educated;
		//Scanner ac =new Scanner(System.in);
		
		System.out.println("Enter the GENDER : ");
       String gender =ac.next();
		System.out.println("Whether He/She is educated ? (yes/no): ");
       String educated = ac.next();
        System.out.println("Enter the AGE : ");
		int age=ac.nextInt();
        //System.out.println("age"+age+"Gender"+gender);
       
        if (gender.equalsIgnoreCase("male") && educated.equalsIgnoreCase("yes"))
        {
        		if (age<= 18)
        		{
        			System.out.println("the insurance amount is 1500000");
        		}
        		    else if(age >18 && age <=40)
        		{
        			System.out.println("the insurance amount is 1300000");
        		}
        		    else if (age>40 && age<=60)
        		{
            		System.out.println("the insurance amount is 1200000");
            	}
        		    else if (age>60 && age<=80)
            	{
                	System.out.println("the insurance amount is 1100000");
            	}
        		
         }
        	
        	else if( gender.equals("male") && educated.equalsIgnoreCase("no"))
        	{
        		if (age<=18)
        		{
        			System.out.println("the insurance amount is 500000");
        		}
        		else if(age >18 && age<=40)
        		{     
        			System.out.println("the insurance amount is 300000");
        		}
        		else if (age>40 && age<=60)
        		{
            			System.out.println("the insurance amount is 200000");
            	}
        		else if (age>60 && age<=80)
            	{
                			System.out.println("the insurance amount is 100000");
            	}
             }
        
        
        	
        	else if(gender.equalsIgnoreCase("female") && educated.equalsIgnoreCase("yes"))
        	{
            		if (age<=18)
            		{
            			System.out.println("the insurance amount is 3500000");
            		}
            		else if(age >18 && age<=40)
            		{
            			System.out.println("the insurance amount is 3300000");
            		}
            		else if (age>40 && age<=60)
            		{
                		System.out.println("the insurance amount is 3200000");
                	}
            		else if (age>60 && age<=80)
                	{
                    			System.out.println("the insurance amount is 3100000");
                	}
        	}
                 
            	else if(gender.equalsIgnoreCase("female") && educated.equalsIgnoreCase("no"))
            	{
            		if (age<=18)
            		{
            			System.out.println("the insurance amount is 2500000");
            		}
            		else if(age >18 && age<=40)
            		{
            			System.out.println("the insurance amount is 2300000");
            		}
            		else if (age>40 && age<=60)
            		{
                		System.out.println("the insurance amount is 2200000");
                	}
            		else if (age>60 && age<=80)
                	{
                    	System.out.println("the insurance amount is 2100000");
                	}
                      
            	}
     ac.close();
	//a.close();
	//b.close();
	//c.close();
	}
}
