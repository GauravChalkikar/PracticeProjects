package seleniumprojects;

import java.util.Scanner;

public class New1 {
	int a,b,c;
Scanner scr=new Scanner(System.in);
	float x,y,z;
	public void add(int a, int b)
	{
		System.out.println("input valur for a");
		a=scr.nextInt();
		System.out.println("Enter valur for b");
		b=scr.nextInt();
		c=a+b;
		System.out.println("Value for c="+c);
	}
	public void add(float x,float y)
	{
		System.out.println("Enter value for X");
		x=scr.nextFloat();
		System.out.println("Enter value for Y");
		y=scr.nextFloat();
		z=x+y;
		System.out.println("Value for z="+z);
	}
	
	public static void main (String[] args)
			{
		New1 ob=new New1();
		
			}
	
	
}




