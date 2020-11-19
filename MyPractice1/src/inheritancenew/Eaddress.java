package inheritancenew;

import java.util.Scanner;

public class Eaddress {

	String area, city, flatno;
	Scanner scr = new Scanner(System.in);
	String a = "Gaurav";

	public String readData()

	{
		System.out.println("Enter area name");
		area = scr.nextLine();
		System.out.println("enter city name");
		city = scr.nextLine();
		System.out.println("Enter flatno");
		flatno = scr.nextLine();
		return a;

	}

	public void showData()

	{
		System.out.println("area  :" + area);
		System.out.println("city  :" + city);
		System.out.println("flatno  :" + flatno);
	}

}
