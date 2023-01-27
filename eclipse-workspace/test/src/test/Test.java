package test;
/* superclass Person */
class Person
{
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student extends Person
{
	Student()
	{
		// invoke or call parent class constructor
		//super();

		System.out.println("Student class Constructor");
	}
}

/* Driver program to test*/
public class Test
{
	public static void main(String[] args)
	{
		Person s = new Student();
	}
}
