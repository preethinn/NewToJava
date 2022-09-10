package oops;

public class Abmain 
{
	public static void main(String args[])
	{
		System.out.println("****************************Welcome to Abstract Class*************************");
		System.out.println();
		
		System.out.println("-------------------------First Instance-------------------------------");
		AbstractClass obj = new Child();//Run time polymorphism
		int sum=obj.summation(21, 20);//sum=41
		System.out.println(sum);
		obj.concreteMetod();
		System.out.println();
		
		System.out.println("-----------------------------Second Instance-------------------------");
		Child obj2 = new Child("subclass",1);
		Child.numberOfClass();
		//obj2.concreteMetod();
		
		//AbstractClass obj3 = new AbstractClass();
	}

}
