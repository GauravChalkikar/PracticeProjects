package overRide;

public class Sub extends Base {
	public void add() {
		System.out.println("This is SubClass");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Base ob=new Base();
		Base ob = new Sub();
		ob.add();

	}

}
