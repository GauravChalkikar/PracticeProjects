package inheritancenew;

public class Personalinfo extends Eaddress {
	String age, height, salary;
	static String name1;

	public void readInfo() {
		System.out.println("enter age");
		age = scr.nextLine();
		System.out.println("enter height");
		height = scr.nextLine();
		System.out.println("enter salary");
		salary = scr.nextLine();
	}

	public void displayInfo() {
		System.out.println("age  :" + age);
		System.out.println("height  :" + height);
		System.out.println("salary  :" + salary);

	}

	public static void main(String[] args) {
		Personalinfo ob1 = new Personalinfo();
		name1 = ob1.readData();
		System.out.println("name1" + name1);
		ob1.readInfo();
		ob1.displayInfo();
		ob1.showData();
	}
}
