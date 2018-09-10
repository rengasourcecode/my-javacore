package exercises;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class iostream1 {

	public static void main(String[] args) 
	{
		// Transfering the datas from one file to another
		
	    /*FileInputStream fi =new FileInputStream("D:\\newone.txt");
		FileOutputStream fo=new FileOutputStream("D:\\newfour.txt");
		int k;
		while((k=fi.read())!=-1)
		{
			fo.write((char)k);
		}*/
		
		//Putting tha datas into the new file from source code
		
	    /*FileOutputStream fo1 =new FileOutputStream("D:\\newonetwo.txt");
	    String s ="Entering the data's into this file from source 2code";
	    byte b[]=s.getBytes();
	    fo1.write(b);*/
		
		//Getting data from the output file 
		
	    /*FileInputStream fi2 =new FileInputStream("D:\\newone2.txt");
	    int u;
	    while((u=fi2.read())!=-1)
	    {
	    	System.out.print((char)u);
	    }
			System.out.println(" ");*/
		
		// Using Buffered I/O Class obj
		
		/*FileInputStream fi3 =new FileInputStream("D:\\newone2.txt");
		FileOutputStream fot1 =new FileOutputStream("D:\\newbufferedone1.txt");

		BufferedInputStream bfi3 = new BufferedInputStream(fi3);
		BufferedOutputStream bfo3 = new BufferedOutputStream(fot1);

		String c = "BUFFERED TEXT";
		byte p[]=c.getBytes();
		bfo3.write(p);
		bfo3.flush();
		//bfo3.close();
		int u;
	    while((u=bfi3.read())!=-1)
	    {
	    	System.out.print((char)u);
	    }
			//System.out.println(" ");*/
		
		// SEQUENCING TWO FILES
		
		/*FileInputStream fis =new FileInputStream("D:\\newonetwo.txt");
		FileInputStream fis2 =new FileInputStream("D:\\buffered.txt");
		FileOutputStream fis3 =new FileOutputStream("D:\\sequence.txt");

		SequenceInputStream sis= new SequenceInputStream(fis,fis2);
		int h;
		while((h=sis.read())!=-1)
		{
			//System.out.print((char)h);
			fis3.write(h);
		}*/
		
		// SEQUENCING MULTIPLE FILES ( using ENUMERATION & VECTOR ELEMENTS )
		
	  /*FileInputStream fis =new FileInputStream("D:\\A.txt");
		FileInputStream fis2 =new FileInputStream("D:\\B.txt");
		FileInputStream fis3 =new FileInputStream("D:\\C.txt");
		FileInputStream fis4 =new FileInputStream("D:\\D.txt");
		FileOutputStream fis5 =new FileOutputStream("D:\\E.txt");

		Vector v = new Vector();
		v.add(fis);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		Enumeration e =v.elements();
		
		SequenceInputStream si= new SequenceInputStream(e);
		int n;
		while((n=si.read())!=-1)
		{
			System.out.print((char)n);
			fis5.write(n);
		}*/

		

// BYTE ARRAY OUTPUT STREAM
		/*FileOutputStream fos1 =new FileOutputStream("D:\\F.txt");
		FileOutputStream fos2 =new FileOutputStream("D:\\G.txt");
		ByteArrayOutputStream barray =new ByteArrayOutputStream();
		barray.write(65);;
		barray.writeTo(fos1);
		barray.writeTo(fos2);
		barray.flush();*/
		
		
//DATA OUTPUT STREAM
		
		/*FileOutputStream fos7 =new FileOutputStream("D:\\H.txt");
		DataOutputStream dos7 = new DataOutputStream(fos7);
		dos7.writeBytes("renganathan");
		dos7.flush();*/
		
//USING CONSOLE
		Console c=System.console();    
		System.out.println("Enter your name: ");  
		System.out.println();
		String n = c.readLine("D:\\newonetwo.txt");
		/*System.out.println("Welcome "+n);    
        System.out.println("successfully done");*/
	}
}
