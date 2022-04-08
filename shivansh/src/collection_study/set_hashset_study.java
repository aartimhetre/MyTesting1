package collection_study;

import java.util.HashSet;
import java.util.Iterator;

public class set_hashset_study {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("velocity");
		hs.add(100);
		hs.add("pune");
		hs.add('A');
		hs.add(null);
		hs.add(100);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains('A'));
		hs.remove(100);
		System.out.println(hs);
		
		
//		System.out.println("======by using for loop=======");
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println(hs.);
//		}
		System.out.println("=======by using for each loop=======");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		System.out.println("========by using iterator method=======");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	hs.clear();
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	}

}
