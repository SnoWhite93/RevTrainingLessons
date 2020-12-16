package eg2;

public class Main {
	public static void main(String[] args) {

		Employee e1 = new Employee(111, "Anna");
		System.out.println("Printing e1");
		e1.printEmployee();

		Employee e2 = new Employee(222, "Max");
		System.out.println("Printing e2");
		e2.printEmployee();

		Employee e3 = new Employee(22, "ddd", 12344444, "Chicago");
		System.out.println("Printing e3");
		e3.printEmployee();

	}
}
