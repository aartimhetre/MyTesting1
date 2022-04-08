package variable_types;

public class Employee {
//name-->string
//emp code-->TM1234,1234
//grade-->A,B,C,D-->char
//salary-->124.12-->float
	String Emp_Name;//declaring global non-static variable
	int Emp_code;
	char Emp_grade;
	float Emp_sal;
	public void emp_info()
	{
		System.out.println("====================");
		System.out.println("Employee name is "+Emp_Name);
		System.out.println("Employee code is "+Emp_code);
		System.out.println("Employee charactor is "+Emp_grade);
		System.out.println("Employee salary is "+Emp_sal);
		
	}
	public void emp_Details()
	{
		
	}
}
