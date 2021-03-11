
public class Employee {

	private String name;
	private String possition;
	private String email;
	private String phone;
	private int salary;
	private int age;
	
	
	public Employee(String name, String possition, String email, String phone, int salary, int age) {
		super();
		this.name = name;
		this.possition = possition;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPossition() {
		return possition;
	}
	public void setPossition(String possition) {
		this.possition = possition;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", possition=" + possition + ", email=" + email + ", phone=" + phone
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
}
