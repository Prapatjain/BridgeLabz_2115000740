class OutPatient extends Patient implements MedicalRecord{
	
	private double bill;
	private String disease;
	
	OutPatient(int patientId, String name, int age){
		super(patientId, name, age);
	}
	
	public void calculateBill(int days){
		bill = days*1000;
	}
	
	public void viewBill(){
		System.out.println("Bill generated is : "+this.bill);
	}
	
	public void addRecord(String disease){
		this.disease = disease;
		System.out.println("Record of the InPatient has been added");
	}
	
	public void viewRecords(){
		System.out.println("Patient Name is : "+getName());
		System.out.println("Patient id is : "+getPatientId);
		System.out.println("Patient age is : "+getAge());
		System.out.println("Patient disease is :"+this.disease);
	}
}