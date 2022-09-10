package oops;
//[1]what?
//Constructors are the special methods which is used to Initialize Objects.
//Construtors are called when objects of a classes created

//[2]Representation?
//Constructor Name Should be Excatly Same as its Class Name

//[3]How it works?
//Even if there's No Constructor in your Program, Internally first default Constructor will be invoked by compiler.

//[4]Can we do Constructor Overloading in the same class? No
//In the same class we cann't overload a constructors results in method duplication

//[5]Can we Overload the Constructor? Yes
//Constructor's can be overloaded ------1] By Sequence of Parameters
//                                ------2] By Count of Parameters
//                                ------3] By type of Parameters

//[6]Can a class be Protected, Private? No
//A Class can only be public, abstarct, final -> 
//it can't be protected or private bcoz if the class itself private nothing could be access to it.

//[7]Can we have Initialiser Block inside the Constructor? Yes
//Inside No arg Constructors we can have Initialiser Block.
//In case if Initialiser Block is preset outside constructors and inside class then Initialiser block first will be executed.

//[8]Can we have a Method inside a Constructor? No
//Inside Constructors its higly Imposssible to define instance Method because objects are not fully initialsed

//[9]Imagin You have a Static Block, Initialiser Block and a Constructor which will be executed first?
//In case if program as static block then first static block will be executed bcoz it doesn't req any objects to invoke the static it belongs to class area
//later initialiser block and then constructor,

//[10]Why A Constructor can't be static?
//Because Constructors are invoked only when the object is created whereas static Constructor(special type of Method) static 
//belongs to class area for which object creation is not at all required.

//[11]Imagin there is a Class and a No arg constructor inside that Constructor there is a initialiser block 
//if I create instance of that Class 10 times what will be the output? 10 times Initialiser and 10 times Constructor will be called
//How many ever times instance of super class or base class instances are created those many times no arg constructors will be called, 
//in case if the super class had initialiser block then along with the no arg constructor even initialiser block will be called those
//many times.

//[12]Can Constructors have return type? No
//bcoz constructors are used to initialise members of class and it doesn't return any value back.

//[13]What are the Access Modifiers Supported to the Constructors?
//All the 4 -private  public default protected.

//[14]Can a Constructor be final? No
//Bcoz Constructor overriding is possible.we can only call super classes constructors to the base class.


class Constructors 
{
	String name;
	int count;
	static String key;
	static 
	{
		key="staticblock";
		System.out.println(key +" "+key);
		}
	public Constructors()//1)no arg constructor
	{
		 {
		  System.out.println("line 33..Super Classes No arg Constructors Initialiser Block");
		 }
		System.out.println("line 35..I'm No arg Constructor from super class...");
	}
	Constructors(int count)
	{
		this();//Constructor Chaning-> The process of calling constructor into another constructor using this keyword within the same class.
	  System.out.println("I'm parameterised constructor form super class");
	}
	protected Constructors(int count, String name)//1 and super
	{
		{System.out.println("line 43..Initialiser Block from arg constructor");}
		this.count = count;//obj2.count = 1
		this.name = name;//obj2.name = super
		//count=count;  -----this assignment as no effect it would print the default values, 
		//name=name; ------- this can be resolved by
		/*Constructors(int ct, String nm)
		 {
		   count  = ct;
		   name = nm;
		  }*/ //Instead of doing these assignment we can use this keyword which wouldn't cause any ambiguity w.r.t same arg and params.	 
	}
	//final Constructors(String name, int count)
     Constructors(String name, int count)
	{
		 /*void constMethod()
		 {
			 System.out.println("I'am with 2 parameters...."+name+count);
		 }*/	
	}
	static int toSumNumbers(int num1, int num2)//overriden method
	{ 
		int sum = ++num1 + --num2 + (~num1);//4+2-5 = 4-2-5=1
		if(sum >0) {System.out.println("yes");}else {System.out.println("No");}
		return sum;	
	}
    {System.out.println("line55..Super Class Initialiser Block");}
    
	void toDisplayConstructors()//Overridden Method
	{
		System.out.println("Overriden Method from Super Classes Constructors..");
	}
	void display()
	{
		//key form class area as its a static attribute need not required this keyword to invoke it.
		System.out.println(count+" "+name+" "+key);
	}
}
class Constructors2 extends Constructors
{
	/*Constructors(int count){System.out.println("I'm parameterised constructor form super class");}
	 */
	 Constructors2()
	{
		super();//Through super keyword we can call immediate parent classes constructor into sub class constructor.
		System.out.println("I'am No arg Sub Class Constructor..");
	}
	void toDisplayConstructors()//Method Overriding
	{
		System.out.println("Method Overriding from sub class constructor..");
	}
	void toDisplayConstructors(int num)//Method Overloading
	{
		System.out.println("Method Overloading from Sub Class Constructor.."+num);
	}
	{
		System.out.println("sub class Initialiser Block");
	}	
	static int toSumNumbers(int num1, int num2)//method overriding
	{ 
		int sum = ++num1 + --num2 + (~num1);//4+2-5 = 4-2-5=1
		if(sum >0) {System.out.println("yes");}else {System.out.println("No");}
		return sum;	
	}
}
class Constructor3 extends Constructors2
{
	Constructor3(){super();
	}
}


