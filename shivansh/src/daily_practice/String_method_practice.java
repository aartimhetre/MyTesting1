package daily_practice;

public class String_method_practice {

	public static void main(String[] args) {
		
		String a="Aarti";
		String b=a.replaceAll("Aarti","Manoj");
        System.out.println(b);
        
        System.out.println("=========");
        
        String c="Aarti mhetre";
        String d=" ";
        String[] e=c.split(d);
        System.out.println(e[0]);
        System.out.println(e[1]);
        
        System.out.println("==========");
        
        String f="Aarti";
       String g=f.toUpperCase();
       System.out.println(g);
       
       System.out.println("==========");
       
       String h="AARTI";
       String i=h.toLowerCase();
       System.out.println(i);
       
       System.out.println("==========");
       
       String j="aaru";
       char k=a.charAt(0);
       System.out.println(k);
       
       System.out.println("==========");
       
       String l="Aarti ";
       String m="Manoj ";
       String n="Mhetre ";
       String o=l.concat(m).concat(n);
       System.out.println("My name is "+ o);
       
       System.out.println("===========");
       
       String p="Aarti";
       String q="aarti";
      boolean r=p.equals(q);
      System.out.println(r);
      
      System.out.println("===========");
     
      String s="Aarti";
      int t=s.length();
       System.out.println(t);
       
       System.out.println("==========");
       
       String u="Aarti";
       int v=u.indexOf('r');
       System.out.println(v);
       
       System.out.println("===========");
       
       String w=" ";
       Boolean x=w.isBlank();
       System.out.println(x);
       
       System.out.println("==========");
       Boolean y=w.isEmpty();
       System.out.println(y);
       
       System.out.println("=========");
       
       String ab="aarti";
       String cd=ab.substring(2);
       
       System.out.println(cd);
       
	}

}
