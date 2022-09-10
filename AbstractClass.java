package oops;
//Abstraction : Is the Process of hiding the Implementation and making its declarartion visible to the end user.
//for eg: A End User can send mail to recipient but the end user is least bothered about the internal working procedure.
//Abstraction can be achieved by Abstract class and Interface


//[1]What?
//A class Preceeded with abstract keyword is called as abstract class. 
//A abstract class can have constructors, static methods, final methods, static and final attributes, abstract methods declarartion and
//instance of abstract class cann't be created.

//[2]Can abstract class have abstarct method definition? No
//A abstract class can have non abstract methods/Concrete Method implementation and abstract methods declared,
//its not mandatory to have abstract method declared but if abstarct method declared its compulsory to make class as abstract
//if any other class inherates abstract class it's must to have abstract methods implementation inside the sub class.

//[3]Is it possible to override the final method? No
//Its not possible to Override the final methods which is there in abstract class.
//we cann't create objects for abstract class
//we cann't override the static method which is there in super class only thing what can do is to redeclare it
//or to remove static keyword.

//[4]Without Creating Objects is it possible to get abstract classes static block? No
//we can get static block as a o/p only when the extended classes objects are created,
//static block cannot get memory inside the abstract class.

//[NOTE]
//In Rum time polymorphisum if the extended class doesn't have a static method 
//then it would invoke the super classes static method by referring to its parent.
//in case if the extended class itself had static method then that method only will be invoked.

abstract public class AbstractClass 
{
	abstract int summation(int num1, int num2);
	static final String finalname = "AbstractClass";
	static 
	{
		System.out.println("Iam From Static Block : "+ " "+finalname);
	}
	AbstractClass()
	{
		this(2);
		System.out.println("Non-Parameterised : Super Classes No arg Constructor...");
		
	}
	AbstractClass(int num)
	{
		this("Constructor",3);
		//this.num = num;
		System.out.println("Parameterised : Super Classes Constructor Overloading..."+num);	
	}
	AbstractClass(String name, int num)
	{
		this.name = name;//obj.name
		this.num=num;//obj.num
		System.out.println("Parameterised :  Super Classes Constructor Overloading..."+name+" "+num);
	}
	final void totalConstructors()
	{
		System.out.println("Total Constructors in Super Class is: 3");
	}
	static void numberOfClass()//Overridden Method
	{
		System.out.println("Super Classes Static Method");
	}
	String name = "Constructors";//String literal
	int num = 2;
	{
		System.out.println("Initialiser Block");
	}
	void concreteMetod()
	{
		System.out.println("Iam From super classses concrete Method");
	}
}
class  Child extends AbstractClass
{
	int summation(int num1, int num2)//21 + 20
	{
		int sum= num1 + num2;
		return sum;	//41
	}
	Child()
	{
		System.out.println("No arg : form sub class");
	}
	Child(int count)
	{
		super();
		System.out.println("Parameterised Constructor : from child class");
	}
	Child(String name, int num)
	{
		this.name = name;
		this.num=num;
		System.out.println("Parameterised Constructor : from child class"+name +" "+num);
	}
	static void numberOfClass()//Method Overridding
	{
		System.out.println("Sub Classes Static Method");
	}
	/*final void totalConstructors()
	{
		System.out.println("Total Constructors in Super Class is: 3");
	}*/
	void concreteMetod()
	{
		System.out.println("Iam From sub clasess concrete Method");
	}
}


