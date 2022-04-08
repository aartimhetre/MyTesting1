package daily_practice;

public class Total_study1 {
int a=10;
float value=125.4568f;
String name="Aarti";
char Grade='A';
public Total_study1(int num1)
{
	a=num1;
	System.out.println("the value of a is "+num1);
	}
public Total_study1(String name1,char G1)
{
	name=name1;
	Grade=G1;
	System.out.println("the value of name is "+name1);
	System.out.println("the value of grade is "+G1);
	}

	public static void main(String[] args) {
	Total_study1 ts1=new Total_study1(300);
    ts1.disply();
    ts1.multiplication();
    Total_study1 ts2=new Total_study1("Dipali", 'B');
    ts2.disply();
	}
public void disply()
{
	float sum=a+value;
	System.out.println("the value of sum is "+sum);
	}
public void multiplication()
{
	float mul=a*value;
	System.out.println("the value of mul is "+mul);
	}
public void dis()
{
	System.out.println("the name of customer");
	System.out.println("the value of garde");
	}

}
