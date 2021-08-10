package CalendarTest;


import java.time.LocalDate;

class Employee {
	public static void main(String[] args) // unit test
	{
	      var e = new Employee("장인현", 50000, 2003, 3, 31);
	      e.raiseSalary(10);
	      System.out.println(e.getName() + " " + e.getSalary());
	}
	
	private static int nextId = 1; // 다음 생성될 객체에 부여할 Id
	
	private static int getNextId() {
		return nextId++;
	}
	
	private final int id; // 객체마다 존재 다른 값 저장
	
	public int getId() {
		return id;
	}
		
	private String name;
	private double salary;
	private LocalDate hireDay;
	String a;
	
	private static int employeeCount = 0;
	
	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int employeeCount) {
		Employee.employeeCount = employeeCount;
	}



	public Employee() {
		this("", 0.0, 2021, 6, 3);
//		name = "";
//		salary = 0.0;
//		hireDay = LocalDate.now();
	}

	public boolean equals(Employee other) {
		return name.equals(other.name);
	}

	public Employee(String name, double salary, int year, int month, int day) {
		setEmployeeCount(getEmployeeCount() + 1);
		id = getNextId();
//		employeeCount++;
//		String name;
//		Objects.requireNonNull(name, "이름은 널이 될 수 없다");
		this.name = name;
		name = (name != null && name.trim().length() > 0) ? name : "(추후 입력)";
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return this.name;
	}

	void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public double getSalary() {
		return this.salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		this.salary += this.salary * byPercent / 100;
	}


}