package control_statements;

public class Switch_study_days {

	public static void main(String[] args) {
	//sunday= 1st day of week
    //monday= 2nd day of week
	//tuesday=3rd day of week
	//wednesday= 4th day of week
	//thuresday=5th day of week		
	//friday=6th day of week
	//saturday=7th day of week
String day="friday";
switch (day) {
case "sunday":System.out.println("1st day of week");
break;
case "monday":System.out.println("2nd day of week");
break;
case "tuesday":System.out.println("3rd day of week");
break;
case "wednesday":System.out.println("4th day of week");
break;
case "thursday":System.out.println("5th day of week");
break;
case "friday":System.out.println("6th day of week");
break;
case "saturday":System.out.println("7th day of week");
break;

default:
	break;
} 
	}

}
