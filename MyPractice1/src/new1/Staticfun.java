package new1;

public class Staticfun {
	String name;// Nonstatic varianbe
	static int age = 25;// static varaible

	public void sendMain()// non static method
	{
		System.out.println("Send Mail");
	}

	public static void sumMethod() // static method
	{
		System.out.println("This is summethod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumMethod();
		Staticfun ob = new Staticfun();

		ob.sendMain();

	}

}
