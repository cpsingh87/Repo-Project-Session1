package Package1;

public class TestClass
{

	int age;
	int roll_no;
	public void Method1() 
	{
		System.out.println("Welcome All");
		
	}
	
	public void Method2()
	{
		System.out.println("Welcome all of you");
	}
	
	public static void main(String[] args) 
	{
		Class1 refVar1= new Class1();
		refVar1.age=30;
		refVar1.roll_no=1;
		refVar1.Method1();
		System.out.println("Variable1 Age is "+refVar1.age+" having roll no "+ refVar1.roll_no );
		refVar1.age=60;
		refVar1.roll_no=2;
		refVar1.Method2();
		System.out.println("Variable2 Age is "+refVar1.age+" having roll no "+ refVar1.roll_no );
	}

}
