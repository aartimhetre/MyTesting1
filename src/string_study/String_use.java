package string_study;

public class String_use {

	public static void main(String[] args) {
		//String a="pune";
		//int a1=10;
		//String_use s=new String_use();
		
		String m="Velocity";//without using new keyword
		String m1="Velocity";
		
		String n=new String("velocity");//with using new keyword
		String n1=new String("Velocity");
		String n2=new String ("Velocity Pune");
		
		System.out.println(m==m1);//using equals to equals to method we can console the boolean value i.e true or false but in constant pool area
		System.out.println(m==n);//using equals to equals to method we can console the boolean value i.e true or false but in non constant pool area
		
		System.out.println(m.equals(n));//using equals to method for constant pool area
		System.out.println(n.equals(n1));//using equals to method for non constant area
		
		System.out.println(m.length());//using length method for constant pool area
		System.out.println(n.length());//using length method for non constant pool area
		System.out.println("length of n2 is "+n2.length());
		
		int lengthofn1=n1.length();
		System.out.println("length is "+lengthofn1);
		
		System.out.println(n2.toUpperCase());//by using uppercase method
		
		String n23=n2.toUpperCase();
		System.out.println(n23.toLowerCase());//by using lowercase method
		
		String v="velocity";
		String v1="Velocity";
		
		System.out.println(v.equals(v1));// by using equals to method in the form of boolean 
		System.out.println(v.equalsIgnoreCase(v1));//by using equalsignorecase in the form of boolean
		
		System.out.println(v.contains("dg"));//by using contains method 
		System.out.println(v1.contains("v"));//by using contains method
		
		
		}

}
