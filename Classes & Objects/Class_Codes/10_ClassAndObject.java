class Employee {
	
	int empId = 57;
	String name = "Manish";

	void empInfo() {
		
		System.out.println("ID : " + empId);
		System.out.println("Name : " + name);
	}
}

class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();

		emp.empInfo();

		System.out.println(emp.empId);
		System.out.println(emp.name);
	}
}
