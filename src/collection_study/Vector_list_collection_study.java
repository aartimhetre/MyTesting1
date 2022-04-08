package collection_study;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_list_collection_study {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Aarti");
		v.add(45.254f);
		v.add("null");
		v.add("pranav");
		v.add(25000);
		v.add('A');
		v.add("pranav");
		System.out.println(v);
        v.remove(3);
        System.out.println(v);
        System.out.println(v.size());
        
        System.out.println("======by using for loop=======");
        for(int i=0;i<=v.size()-1;i++)
        {
        	System.out.println(v.get(i));
        }
        
        System.out.println("======by using for each loop=====");
        for(Object o:v)
        {
        	System.out.println(o);
        }
        
        System.out.println("======by using listiterator======");
        ListIterator it = v.listIterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        System.out.println("=======by using enumeration method======");
        Enumeration en=v.elements();
        while(en.hasMoreElements())
        {
        	System.out.println(en.nextElement());
        }
	}

}
