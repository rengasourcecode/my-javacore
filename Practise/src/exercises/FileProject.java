package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProject {

	static String line;
	static String parts[];

	public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\Dinesh\\Desktop\\renga.txt");    
        BufferedReader br=new BufferedReader(fr);    

			    
			while (( line = br.readLine()) != null)
				{
			         parts = line.split(",");
			    }
       // line=br.readLine();
        //System.out.println(line);
				
		/*	for(String a : parts)
       	    {  System.out.println(a);
             } */
			
		for( int i=0;i<=parts.length-1;i++)
		{
			if (parts[i].contains("name"))
					{
				System.out.println(parts[i].toUpperCase());
				System.out.println(" ");
					}
			if (parts[i].contains("age"))
			{
		        System.out.println(parts[i].toUpperCase());
		        System.out.println(" ");
			}
			if (parts[i].contains("sex"))
			{
				System.out.println(parts[i].toUpperCase());
				System.out.println(" ");
			}
			else if (parts[i].contains("mobile"))
			{
				System.out.println(parts[i].toUpperCase());
				System.out.println(" ");

            }
			else if	(parts[i].contains("address"))
			{
			    System.out.println(parts[i].toUpperCase());
			    System.out.println(" ");


			} else if (parts[i].contains("email"))
			{
				System.out.println( parts[i].toUpperCase());
				System.out.println(" ");

            }
			
			
	   }
	
		
		
	        

	}
}


