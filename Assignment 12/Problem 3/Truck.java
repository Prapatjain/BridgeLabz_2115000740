class Truck extends Vehicle implements Insurable{
	
	private int rent;
	private int insurance;
	
	Truck(String vehicleNumber, String type, int rentalRate){
		super(vehicleNumber, type, rentalRate);
	}
	
	public void displayDetails(){
		System.out.println("Truck Number is : "+getVehicleNumber());
		System.out.println("Truck Type is : "+getType());
		System.out.println("Truck rental rate is : "+getRentalRate());
	}
	
	public void calculateRentalCost(int days){
		setRent(days*getRentalRate());
	}
	
	public void calculateInsurance(){
		setInsurance(getRentalRate()*400);
	}
	
	public void getRentalCost(){
		System.out.println("Rental Cost for this truck is : "+getRent());
	}
	
	public void getInsuranceDetails(){
		System.out.println("Insurance amount is : "+getInsurance()); 
	}
	
	void setRent(int rent){
		this.rent = rent;
	}
	
	void setInsurance(int insurance){
		this.insurance = insurance;
	}
	
	int getRent(){
		return this.rent;
	}
	
	int getInsurance(){
		return this.insurance;
	}

}