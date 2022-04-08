package control_statements;

public class Switch_study {

	public static void main(String[] args) {
		// if my year is
		//1. I am in 1st year of engg
		//2. I am in 2nd year of engg
		//3.I am in 3 rd year of engg
		//4.I am in 4th year of engg
		//Please Enter valid value between 1-4--> Default
		
		int Year=0;
		
		switch (Year) 
		{
		case 1:System.out.println("I am in 1st year of engg");
		break;
		case 2:System.out.println("I am in 2nd year of engg");
		break;
		case 3:System.out.println("I am in 3 rd year of engg");
		break;
		case 4:System.out.println("I am in 4th year of engg");
		break;
		
		default:System.out.println("please enter valid value between 1-4");
			break;
		}
		{
		
		}

	}

}
