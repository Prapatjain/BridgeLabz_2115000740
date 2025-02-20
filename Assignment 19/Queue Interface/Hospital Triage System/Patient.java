
class Patient{
	
	String name;
	int severity;
	
	Patient(String name, int severity){
	
		this.name = name;
		this.severity = severity;
	
	}
	
	public void display(){
		System.out.println("Patient name is : "+this.name);
		System.out.println("Patient severity is : "+this.severity);
		
	}

}