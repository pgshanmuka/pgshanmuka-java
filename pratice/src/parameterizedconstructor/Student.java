package parameterizedconstructor;

public class Student {
	
	int id;
	String name;
	
	public Student(int i, String n) {
		super();
		id=i;
		name=n;	
	}
	void display() {
		System.out.println(id+""+name);
	}
	public static void main(String args[]) {
		Student s1 = new Student(101,"raj");
		Student s2 = new Student(102,"rosi");
		s1.display();
		s2.display();
		
	}
	 
	

}
