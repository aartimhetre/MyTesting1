package arrey_study;

import java.util.Scanner;

public class swapTheNumber {

	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter x & y");
		Scanner a=new Scanner(System.in);
		x=a.nextInt();
		y=a.nextInt();
		System.out.println("Before swapping\nx = " + x +"\ny = " +y);
		x=x+y;
		y=x-y;
		System.out.println("After swapping\nx = " + x +"\ny = " +y);

	}

}
