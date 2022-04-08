package control_statements;

public class Switch_study_grade {

	public static void main(String[] args) {
		// i am in grade
		//A=>=75
		//B=>=60 to <75
		//C= >=45 to <60
		//D= <45
		char grade='B';
		switch (grade) {
		case 'A':System.out.println("marks should be >=75");
		break;
		case 'B':System.out.println("marks should be >=60 to <75");
		break;
		case 'C':System.out.println("marks should be >=45 to <60");
		break;
		case 'D':System.out.println("marks should be <45 ");
		break;

		default:
			break;
		}
	}

}
