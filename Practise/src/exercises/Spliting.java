package exercises;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Spliting {

	static String str;
	static String parts[];
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr =new FileReader("C:\\Users\\Dinesh\\Desktop\\KAVITHAI.txt");
		BufferedReader br =new BufferedReader(fr);
		
		//System.out.println(str);
		
		//System.out.println("splitting");
		
		while((str=br.readLine())!= null)
		{
			parts= str.split(",");
		}
		
		for( int i=0;i<parts.length;i++)
			
   	    { 
			if(parts[i].contains("name"))
			{
			System.out.println(parts[i]);
         } 
		

	}

	}}
