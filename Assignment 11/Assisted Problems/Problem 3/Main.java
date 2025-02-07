
public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Car c= new Car(300,"Petrol",4);
        c.displayInfo();
        Truck t = new Truck(100, "diesel", 1000);
        t.displayInfo();
        MotorCycle mt = new MotorCycle(180, "petrol", 130);
        mt.displayInfo();
    }
}
