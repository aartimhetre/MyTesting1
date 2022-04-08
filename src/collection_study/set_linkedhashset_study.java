package collection_study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class set_linkedhashset_study {

	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("pune");
		ls.add(100);
		ls.add("velocity");
		ls.add(null);
		ls.add(125.25f);
		ls.add('A');
		ls.add(100);
System.out.println(ls);
System.out.println(ls.isEmpty());
System.out.println(ls.size());

System.out.println("======by using iterator method=====");
Iterator it = ls.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}


System.out.println("=====by using for each loop======");
for(Object o:ls)
{
	System.out.println(o);
	}
	}

}
