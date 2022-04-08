package arrey_study;

import java.util.Arrays;

public class Arrey_info {

	public static void main(String[] args) {
		
//		String name1="Velocity";
//		String  name2="corporate";
//		String name3="training";
//		String name4="center";
//		
//		int salary=50000;
//		
//		//1.declaration
//		 String institute[]=new String[5];
//		 
//		 //2.initialization
//		 institute[0]="velocity";
//		 institute[1]="corporate";
//		 institute[2]="training";
//	     institute[3]="center";
//	     
//	     //3.usage
//	     System.out.println(institute[0]);
//	     System.out.println(institute[1]);
//	     System.out.println(institute[2]);
//	     System.out.println(institute[3]);
//	     
//	     System.out.println("==========================");
//	     for (int i=0;i<=3;i++)
//	     {
//	    	 System.out.println(institute[i]);
//	     }
		//////2.
		//1.declaration
		
		char grade[]=new char[8];
		
		//2.initiation
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		//3.USAGE
		System.out.println(grade[0]);
		System.out.println(grade[5]);
		
		System.out.println("===================");
		for(int i=0;i<=5;i++)
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("===================");
		for(int j=5;j>=0;j--)
		{
			System.out.println(grade[j]);
		}
		System.out.println("===================");
		Arrays.sort(grade);
		for(int k=0;k<=grade.length-1;k++)
	{
			System.out.println(grade[k]);
		}
		System.out.println("====================");
		for(int l=grade.length-1;l>=0;l--)
		{
			System.out.println(grade[l]);
		}
		
		

	}
}
