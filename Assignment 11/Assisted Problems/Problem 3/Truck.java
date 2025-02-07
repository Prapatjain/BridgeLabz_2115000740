
public class Truck extends Vechicle {
    int loadingCapacity;
    Truck(int maxSpeed, String fuelType, int loadingCapacity){
        super(maxSpeed,fuelType);
        this.loadingCapacity = loadingCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("loading capacity= "+loadingCapacity);
    }
}
