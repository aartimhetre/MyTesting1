package control_statements;

public class Nested_if_Else_study {
	// If username is correct then please enter password,if ur password is correct then "successful login"or welcome
			//if password is wrong then please check ur password ,else incorrect username
	public static void main(String[] args) {
		String Username="Velocity";
		String Password="Velocity@1234";
		if(Username=="Velocity")
		{
			System.out.println("username is correct,please enter password");
			if(Password=="Velocity@1234")
			{
				System.out.println("password is correct.login success");
			}
		else
		{
			System.out.println("please check ypur password");
		}
		}
		else
			{
				System.out.println("incorrect username");
				
			}
		}	

	}


