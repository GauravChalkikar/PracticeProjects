package seleniumprojects;

public class InterfaceDemo implements FirstInterface,DemoInterface
{

	public static void main(String[] args)
	{
		FirstInterface ob1=new InterfaceDemo();
		ob1.Showname();
		FirstInterface.add();
		DemoInterface ob2=new InterfaceDemo();
		ob2.draw();
	}

	@Override
	public void draw() {
		System.out.println("Hi this is demointerface class");
		
	}

	@Override
	public void Showname() {
		System.out.println("hi this is first interface class");
		
	}

}
