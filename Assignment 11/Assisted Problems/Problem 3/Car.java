
public class Car extends Vechicle{
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity= "+seatCapacity);
    }
}
