package studentusingthiskeyword;

public class Student {
	int rollno;
	String name;
	float fee;
	
	public Student(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}
	void display() 
	{ 
		System.out.println(rollno+" "+name+" "+fee); 
		}  
	}
	
	


