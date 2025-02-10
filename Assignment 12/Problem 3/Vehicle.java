abstract class Vehicle{
	private String vehicleNumber;
	private String type;
	private int rentalRate;
	
	Vehicle(String vehicleNumber, String type, int rentalRate){
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
	
	abstract void calculateRentalCost(int days);
	
	public void displayDetails(){
		System.out.println("Vehicle Number is : "+vehicleNumber);
		System.out.println("Vehicle Type is : "+type);
		System.out.println("Vehicle rental rate is : "+rentalRate);
	}

	void setVehicleNumber(String vehicleNumber){
		this.vehicleNumber = vehicleNumber;
	}
	
	void setType(String type){
		this.type = type;	
	}
	
	void setRentalRate(int rentalRate){
		this.rentalRate = rentalRate;
	}
	
	String getVehicleNumber(){
		return vehicleNumber;
	}
	
	String getType(){
		return type;
	}
	
	int getRentalRate(){
		return rentalRate;
	}
	
}