package control_statements;

public class Else_if2 {

	
public static void main(String[] args) {
		
Else_if2 f2=new Else_if2();
f2.testgrade();
	}
public void testgrade()
{
//	if my grade is
//	A--> %>=75
//	B--> % >=60-<=75
//	C--> %>40-<60
//	D--> fail}
	char grade='B';
	if (grade=='A')
	{
		System.out.println(" marks is >75");
	}
	else if(grade=='B')
{
	System.out.println("marks is >=60 to <=75");
	}
 else if(grade=='c')
 {
	 System.out.println("marks is <60 to >=40");
 }
 else 
 {
	 System.out.println("marks is >40 then fail");
 }
}
}