class FullTimeEmployee extends Employee implements Department{
	
	private int workHours;
	private String department;
	
	FullTimeEmployee(int employeeId, String name, int baseSalary, int workHours, String department){
			super(employeeId, name, baseSalary);
			this.workHours = workHours;
			this.department = department;

	}
	
	void calculateSalary(){
		System.out.println("Salary of Employee "+getName()+" is : "+(workHours*5*4*500));
	}
	
	void setWorkHours(int workHours){
		this.workHours = workHours;
	}
	
	public void assignDepartment(String newDepartment){
		this.department = newDepartment;
	} 
	
	int getWorkHours(){
		return workHours;
	}
	
	public String getDepartmentDetails(){
		return this.department;
	}

}