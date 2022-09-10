package oops;

public class ConstructorMain 
{
	public static void main(String args[])
	{
		System.out.println("*******************Welcome to Constructors****************************************");
		System.out.println();
		
		System.out.println("------------------First instance for class Constructors-----------");
		Constructors obj1 = new Constructors();
		Constructors c= new Constructors();
		Constructors b = new Constructors();
		Constructors d = new Constructors();
		System.out.println();
		
		System.out.println("--------------------Second instance for class Constructors---------");
		Constructors obj2 = new Constructors(1,"Super");
		int sum=Constructors.toSumNumbers(3,3);
		System.out.println(sum);
		obj2.toDisplayConstructors();
		obj2.display();
		System.out.println();
		
		System.out.println("------------------Third instance for class Constructors2-----------");
		Constructors2 obj3 = new Constructors2();
		obj3.toDisplayConstructors();
		obj3.toDisplayConstructors(3);
		System.out.println();
		
		System.out.println("-----------------------Fourth instance for class Constructor3-------------");
		Constructor3 obj4 = new Constructor3();
		}
		
}
