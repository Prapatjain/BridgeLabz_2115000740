import java.util.*;
class Main{
	public static void main(String[] args){
		Employee fe1 = new FullTimeEmployee(5433, "Kushagra Sharma", 80000, 5, "Software Developer");
	
		Employee pe1 = new PartTimeEmployee(2436, "Naman Agarwal", 75000, 5, "FullStack Developer");
		
		List<Employee> l1 = new ArrayList<>();
		
		l1.add(fe1);
		l1.add(pe1);
		
		for(int i=0;i<l1.size();i++){
			l1.get(i).displayDetails();
			
			if(l1.get(i) instanceof FullTimeEmployee){
				
				System.out.println(((FullTimeEmployee)l1.get(i)).getWorkHours());
				System.out.println(((FullTimeEmployee)l1.get(i)).getBaseSalary());
			
				((FullTimeEmployee)l1.get(i)).setWorkHours(6);
				((FullTimeEmployee)l1.get(i)).setBaseSalary(76000);
			
				System.out.println(((FullTimeEmployee)l1.get(i)).getWorkHours());
				System.out.println(((FullTimeEmployee)l1.get(i)).getBaseSalary());
			
				((FullTimeEmployee)l1.get(i)).assignDepartment("Artificial Intelligence");
			
				System.out.println(((FullTimeEmployee)l1.get(i)).getDepartmentDetails());
			}
			if(l1.get(i) instanceof PartTimeEmployee){
				
				System.out.println(((PartTimeEmployee)l1.get(i)).getWorkHours());
				System.out.println(((PartTimeEmployee)l1.get(i)).getBaseSalary());
			
				((PartTimeEmployee)l1.get(i)).setWorkHours(6);
				((PartTimeEmployee)l1.get(i)).setBaseSalary(76000);
			
				System.out.println(((PartTimeEmployee)l1.get(i)).getWorkHours());
				System.out.println(((PartTimeEmployee)l1.get(i)).getBaseSalary());
			
				((PartTimeEmployee)l1.get(i)).assignDepartment("Artificial Intelligence");
			
				System.out.println(((PartTimeEmployee)l1.get(i)).getDepartmentDetails());
				
			}
		}

	}
}