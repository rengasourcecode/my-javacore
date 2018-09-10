package exercises;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamss {

	public static void main(String[] args) throws IOException  {
		  FileOutputStream fout=new FileOutputStream("C:\\DINESH\\abc.text");    
         /* String s= "Welcom to BIX ";
		  byte [] b=s.getBytes();*/
		  DataOutputStream data=new DataOutputStream(fout);
		  data.writeLong(8122330536L); 
		  
           
                 //  FileInputStream fint=new FileInputStream ("D:\\texttest.txt");
        // int a=fint.read();
       /*  int i;    
         while((i=data.read())!=-1){    
          System.out.print(i);  
         }*/
          System.out.println("Correct");
	



	}}
