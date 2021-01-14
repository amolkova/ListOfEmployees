
public class Start {

	public static void main(String[] args) {
		
		Employee[] employeesArray = new Employee[5];
		employeesArray[0] = new Employee("Petrov Petr", "hr", "hr@mail.ru", "8920505050", 30000, 35);
		employeesArray[1] = new Employee("Ivanov Ivan", "it", "it@mail.ru", "8920505051", 40000, 36);
		employeesArray[2] = new Employee("Olegov Oleg", "hr", "hr@mail.ru", "8920505052", 30000, 37);
		employeesArray[3] = new Employee("Ninova Nina", "it", "it@mail.ru", "8920505053", 40000, 45);
		employeesArray[4] = new Employee("Asetryan Asya", "aho", "aho@mail.ru", "8920505054", 30000, 52);
		
		for (Employee employee : employeesArray) {
			if (employee.getAge() > 40) {
				employee.print();
				
			}
		}
	}
	
}
