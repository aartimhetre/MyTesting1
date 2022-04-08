package variable_types;

public class HR_Portal {

	public static void main(String[] args) {
		Employee SachinT=new Employee();//created object of employee
		SachinT.Emp_Name="Sachin Tendulkar";
		SachinT.Emp_code=10;
		SachinT.Emp_grade='A';
		SachinT.Emp_sal=1234.5268f;
		
		Employee RahulD=new Employee();
		RahulD.Emp_Name="Rahul Dravid";
		RahulD.Emp_code=11;
		RahulD.Emp_grade='B';
		RahulD.Emp_sal=125.2453f;
		
		SachinT.emp_info();
		RahulD.emp_info();
		

	}

}
