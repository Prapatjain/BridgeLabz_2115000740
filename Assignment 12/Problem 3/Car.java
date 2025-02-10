class Car extends Vehicle implements Insurable{
	
	private int rent;
	private int insurance;
	
	Car(String vehicleNumber, String type, int rentalRate){
		super(vehicleNumber, type, rentalRate);
	}
	
	public void displayDetails(){
		System.out.println("Car Number is : "+getVehicleNumber());
		System.out.println("Car Type is : "+getType());
		System.out.println("Car rental rate is : "+getRentalRate());
	}
	
	public void calculateRentalCost(int days){
		setRent(days*getRentalRate());
	}
	
	public void calculateInsurance(){
		setInsurance(getRentalRate()*500);
	}
	
	public void getRentalCost(){
		System.out.println("Rental Cost for this car is : "+getRent());
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
	
	public int getInsurance(){
		return this.insurance;
	}

}