package Demo;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Colletions2 {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("VIKRAM");
		hset.add("RENGA");
		hset.add("RAJESH");
		hset.add("VIKRAM");
		hset.add("ANJANA");
		hset.add("RENGA");
	
		
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		
		lhset.add("VIKRAM2");
		lhset.add("RENGA3e3");
		lhset.add("RAJESHss");
		lhset.add("VIKRAM");
		lhset.add("ANJANA");
		lhset.add("RENGA");
		lhset.addAll(hset);
		
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Sachin");
		tset.add("Sourav");
		tset.add("Kohli");
		tset.add("Ambani");
		//System.out.println("Nsr");
		
		PriorityQueue<String> qq=new PriorityQueue<String>();
		qq.offer("basha");
		qq.add("Bhai");
		
		ArrayDeque<String> dq=new ArrayDeque<String>();
		dq.add("ABC");
		dq.add("DEF");
		dq.addFirst("123");
		dq.addLast("456");
		
		
		for(String s:dq) //deque
		{
			System.out.println(s);
		}
		System.out.println(" ");  
		
		for(String e:qq)  //queue
		{
			System.out.println(e);
		}
		
		
		for(String ts:tset) //Treeset
		{
			System.out.println(ts);
		
		}
		System.out.println(" ");

		for(String hs:lhset)  //linkedHastset
		{
			System.out.println(hs);

		}			System.out.println(" ");

		for(String hs1:hset) //Hashset
		{
			System.out.println(hs1);
			

		}
	}

}
