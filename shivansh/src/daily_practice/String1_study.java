package daily_practice;

public class String1_study {

	public static void main(String[] args) {
		
		String s="Velocity";//constant pool area with out using new keyword
		String s1="Velocity";
		String s2="Test";
		
		String n=new String("Velocity");//non constant pool area with using new keyword
		String n1=new String("Velocity");
		String n2=new String("Velocity pune");
		
		System.out.println(n.equals(s));//by using equals method of string
		System.out.println(s.equals(n2));
		System.out.println(s.equals(s2));
		
		String a="Velocity";
		System.out.println(a.length());
		
		String b="velocity";
		System.out.println(b.toUpperCase());//by using touppercase
		
		String c=b.toUpperCase();
		System.out.println(c.toLowerCase());//by using tolowercase
		
		System.out.println(a.equalsIgnoreCase(s2));//by using equalsignorecase
		
		System.out.println(a.contains("ly"));
		
		String m="";
		String p=" ";
		
		System.out.println(m.isEmpty());
		System.out.println(m.isBlank());
		System.out.println(p.isBlank());
		System.out.println(p.isEmpty());
		
		char output=a.charAt(7);//by using charAt method
		System.out.println("charAt 4 is "+output);
		
		System.out.println(a.startsWith("vel"));//by using startswith method sequence of character
		
		System.out.println(a.endsWith("ci"));//by using endswith method sequence of character
		
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,5));//using substring method
		
		String e="I ";
		String f="love ";
		String g="my ";
		String h="India";
		String t=e.concat(f).concat(g).concat(h);//using concat method 
		System.out.println("sentence is "+t);
		
		System.out.println(h.replace("i","p"));//using replace method
			
	}

}
