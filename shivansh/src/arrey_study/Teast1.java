package arrey_study;//how to do combination of declaration n initiation

public class Teast1 {

	public static void main(String[] args) {
		//1.declaration
//		int money[]=new int[4];
//		
//		//2.initiation
//		money[0]=10;
//		money[1]=20;
//		money[2]=30;
//		money[3]=40;
//		
//		//1.declaration 2.initiation
//		//int money1[]= {10,20,30,40};
//		//String name[]= {"pune","mumbai","latur","satara"};
//		
//		for(int i=0;i<=money.length-1;i++)
//		{
//			System.out.println(money[i]);
//		}
      
		//======matrix form========
		int money[][]= {{10,20},{30,40}};
		
		for(int j=0;j<=money.length-1;j++)
		{
			for(int k=0;k<=money.length-1;k++)
			{
				System.out.print(money[j][k]+" ");
			}
		System.out.println();
		}
		
}

}
