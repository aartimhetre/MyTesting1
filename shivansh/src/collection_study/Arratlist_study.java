package collection_study;

import java.util.ArrayList;
import java.util.Iterator;

public class Arratlist_study {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("Velocity");
		al.add("Null");
		al.add('A');
		al.add(254);
		al.add("Null");
		al.add("Velocity");
		al.add(584);
		al.add(125.45);
		al.add("Pune");
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("Mumbai");
		System.out.println(al);
		al.add(0,"satara");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.contains(254));
		System.out.println(al.contains('c'));
		
		System.out.println(al.isEmpty());
		System.out.println(al.get(7));
		
		System.out.println("========using for loop========");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=======using iterator method========");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("======using for each loop========");
		for(Object o:al)
		{
			System.out.println(o);
		}
		
	}

}
