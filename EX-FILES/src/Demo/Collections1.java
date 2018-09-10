package Demo;

import java.util.ArrayList;
import java.util.Iterator;



public class Collections1 {

	public static void main(String[] args) {
		/*ArrayList<String> AL=new ArrayList<String>();  
		ArrayList<String> AL1=new ArrayList<String>();
		  AL.add("jhfjf" );  
		  AL.add("Vijay");  
		  AL.add("Raj");  
		  AL.add("Basha"); 
		  AL.add(2, "Nisar");
		  
		  AL1.add("Nisar Basha");
		  AL1.add("NSR");
		  AL.addAll(AL1);
		  
		  
		  System.out.println(AL.size());
		  System.out.println(AL);
		  AL.remove(2);
		 System.out.println(AL.containsAll(AL1));
		
		
		  // list.clear();
		  
		  for(String s:AL) {
			  System.out.println(s);
		  }
		 
		 /* Iterator itr=AL.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());

	}
		  System.out.println(AL);
		  System.out.println(AL1);*/
		ArrayList<String> abc=new ArrayList<String>();
		ArrayList<String> abc1=new ArrayList<String>();

		abc.add("RENGA");
		abc.add("RAJESH");
		abc.add("SIVA");
		abc.remove(2);
		abc.add(1, "SHOBI");
		
		abc1.add("A");
		abc1.add("B");
		abc1.add("C");
		
		System.out.println(abc.size());
		System.out.println(abc.isEmpty());
		System.out.println(abc.contains("rajesh"));
		System.out.println(abc.indexOf("RENGA"));
		System.out.println(abc.equals(abc1));
		//System.out.println(abc.addAll(0,));
		
		for(String obj:abc)
		{
			System.out.println(obj);
		}
		for(String str:abc1)
		{
			System.out.println(str);
		}
		
		}
		
		  
}

