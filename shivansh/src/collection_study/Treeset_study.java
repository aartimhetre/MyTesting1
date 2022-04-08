package collection_study;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
		TreeSet te=new TreeSet();
		te.add(100);
		te.add(400);
		te.add(300);
		te.add(200);
		te.add(500);
		te.add(600);
		System.out.println(te);
		System.out.println(te.first());
		System.out.println(te.isEmpty());
		
		System.out.println("======for each loop====");
		for(Object o:te)
		{
			System.out.println(o);
		}

		System.out.println("========for iterator method======");
		Iterator it = te.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==============");
		//System.out.println(te.pollFirst());
		//System.out.println(te.pollLast());
		//System.out.println(te.clone());//remove first n last value 
		System.out.println(te.descendingSet());
		System.out.println(te.comparator());
		System.out.println(te.hashCode());//addition of all the elements
		
	}

}
