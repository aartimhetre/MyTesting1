package control_statements;

public class Switch_study_month {

	public static void main(String[] args) {
	//Jan=this is 1st month of yr
	//Feb=this is 2nd month of yr
	//march=this is 3re month of yr
	//april=this is 4th month of yr
    //may=this is 5th month of yr
	//june=this is 6th month of yr
	//july=this is 7th month of yr
	//aug=this is 8th month of yr
	//sep=this is 9th month of yr
	//oct=this is 10th month of yr
	//nov=this is 11th month of yr
	//dec=this is 12th month of yr
		String month= "jan";
		switch (month) 
		{
		case "jan":System.out.println("jan is 1st month of yr");
		break;
		case "feb":System.out.println("feb is 2nd month of yr");
		break;
		case "march":System.out.println("march is 3rd month of yr");
		break;
		case "april":System.out.println("april is 4th month of yr");
		break;
		case "may":System.out.println("may is 5th month of yr");
		break;
		case "june":System.out.println("june is 6th month of year");
		break;
		case "july":System.out.println("july is 7th month of year");
		break;
		case "aug":System.out.println("august is the 8th month of year");
		break;
		case "sep":System.out.println("this is 9th month of yr");
		break;
		case "oct":System.out.println("this is 10th month of yr");
		break;
		case "nov":System.out.println("this is 11th month of yr");
		break;
		case "dec":System.out.println("this is 12th month of yr");
		break;

		default:
			break;
		}

	}

}
