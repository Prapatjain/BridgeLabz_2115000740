abstract class Employee{
	private int employeeId;
	private String name;
	private int baseSalary;
	
	Employee(int employeeId, String name, int baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	abstract void calculateSalary();
	
	public void displayDetails(){
		System.out.println("Employee name is : "+name);
		System.out.println("Employee id is : "+employeeId);
		System.out.println("Employee base salary is : "+baseSalary);
	}

	void setBaseSalary(int salary){
		this.baseSalary = salary;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	int getBaseSalary(){
		return baseSalary;
	}

}