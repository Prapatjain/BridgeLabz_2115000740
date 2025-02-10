abstract class Patient{
	private int patientId;
	private String name;
	private int age;
	
	Patient(int patientId, String name, int age){
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	abstract public void calculateBill(int days);
	
	public void getPatientDetails(){
		System.out.println("Patient Name is : "+this.name);
		System.out.println("Patient id is : "+this.patientId);
		System.out.println("patient age is : "+this.age);
	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getPatientId(){
		return this.patientId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
}