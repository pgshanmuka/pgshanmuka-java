package day2task;

class Parent
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}

class Child extends Parent
{
	public void add(int a, int b)
	{
		System.out.println(a*b);
	}
}
public class Methodoverloadingandriding {
	public static void main(String args[])
	{
	
	Child obj = new Child();

	// Method Overloading
	obj.add(4,5);
	obj.add(4,3,4);

	// Method Overriding
	obj.add(4,3);
}
}

