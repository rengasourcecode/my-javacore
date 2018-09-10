package exercises;

import java.io.*;


public class fileio {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fio=new FileInputStream("D:\\JAVAPAPER1.txt");
		BufferedInputStream ibuf=new BufferedInputStream(fio);
		int d;
		while ((d = ibuf.read()) != -1) {
	        char ch=(char)d;   
			System.out.print(ch+"-");
	           
	     }
		
		FileOutputStream fout=new FileOutputStream("D:\\newtwo.txt");
		BufferedOutputStream obuf=new BufferedOutputStream(fout);
        int c;
        while ((c = ibuf.read()) != -1) {
           obuf.write((char)c);
     }
        fout.flush();

	}
}