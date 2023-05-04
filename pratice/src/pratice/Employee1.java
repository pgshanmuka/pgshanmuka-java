package pratice;

public class Employee1 {
	
	private long id;
	private String name;
	private int salary;
	private String department;

	public Employee1(long id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ","
				+ " name=" + name + ","
				+ " salary=" + salary + ","
				+ " department=" + department + "]";
	}
}


