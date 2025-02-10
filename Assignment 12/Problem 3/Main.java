import java.util.*;
class Main{
	public static void main(String[] args){
		Vehicle c1 = new Car("UP80DC2315","Hybrid", 500);
		
		Vehicle b1 = new Bike("HR50BR4526", "Electirc", 250);
		
		Vehicle t1 = new Truck("DL60HG5829", "Fuel Cell", 400);
		
		List<Vehicle> l1 = new ArrayList<>();
		
		l1.add(c1);
		l1.add(b1);
		l1.add(t1);
		
		for(int i=0;i<l1.size();i++){
			l1.get(i).displayDetails();
			
			if(l1.get(i) instanceof Car){
				((Car)l1.get(i)).calculateRentalCost(5);
				((Car)l1.get(i)).calculateInsurance();
				((Car)l1.get(i)).getRentalCost();
				((Car)l1.get(i)).getInsuranceDetails();
			}
			if(l1.get(i) instanceof Bike){
				((Bike)l1.get(i)).calculateRentalCost(5);
				((Bike)l1.get(i)).calculateInsurance();
				((Bike)l1.get(i)).getRentalCost();
				((Bike)l1.get(i)).getInsuranceDetails();
			}
			if(l1.get(i) instanceof Truck){
				((Truck)l1.get(i)).calculateRentalCost(5);
				((Truck)l1.get(i)).calculateInsurance();
				((Truck)l1.get(i)).getRentalCost();
				((Truck)l1.get(i)).getInsuranceDetails();
			}
		}
		
		
	}

}