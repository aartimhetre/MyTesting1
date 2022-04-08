package collection_study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_collection_study {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("aarti");
		ls.add("pranav");
		ls.add(null);
		ls.add(45);
		ls.add('B');
		ls.add(null);
		ls.add(453.254f);
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		//System.out.println(ls.offerFirst(ls));
		System.out.println(ls.size());
		System.out.println(ls.getLast());
		System.out.println(ls.remove(null));
		
		System.out.println("======using for loop======");
		for(int i=0;i<=ls.size()-1;i++)
		{
			System.out.println(ls.get(i));
		}
		
		System.out.println("========using for each method======");
		for(Object o:ls)
		{
			System.out.println(o);
		}
		
		System.out.println("=======using listiterator cursor method========");
		ListIterator li = ls.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("======using iterator cursor method======");
		Iterator or = ls.iterator();
		while(or.hasNext())
		{
			System.out.println(or.next());
		}
	}

}
