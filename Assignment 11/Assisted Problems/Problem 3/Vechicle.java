
public class Vechicle {
    int maxSpeed;
    String fuelType;
    Vechicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed= "+maxSpeed+" fuel type= "+fuelType);
    }
}
