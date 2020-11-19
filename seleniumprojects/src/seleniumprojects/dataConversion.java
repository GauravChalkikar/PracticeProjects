package seleniumprojects;

public class dataConversion
{
String str="100.233";
float i;
public void StringtoFundamental() 
{
i=Float.parseFloat(str);
System.out.println("Valur of integar="+i);
}
public void fundamentaltoObject()
{
	float ob;
ob=Float.valueOf(i);
System.out.println("float to Object conversion="+ob);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
dataConversion dt=new dataConversion();
dt.StringtoFundamental();
dt.fundamentaltoObject();
	}

}
