import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		
		   Map<Integer,String> map=new TreeMap<Integer,String>();  
		   map.put(103,"Qmit");  
		   map.put(102,"Vijay"); 
		   map.put(101,"Rahul");  
		   map.put(105,"Aahul");
		   Map<Integer,String> map1=new TreeMap<Integer,String>();  
		   map1.put(103,"Qmit");  
		   map1.put(102,"Vijay"); 
		   map1.put(101,"Rahul");  
		   map1.put(105,"Aahul");
	  System.out.println(map.hashCode());
	  System.out.println(map1.hashCode());
		   System.out.println(map.get(102));
		  for(Map.Entry m:map.entrySet()){ 
			  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		  
			
			
		  }	
	

}
}
