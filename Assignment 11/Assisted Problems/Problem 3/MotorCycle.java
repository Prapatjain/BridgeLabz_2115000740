
public class MotorCycle extends Vechicle{
    int engineCC;
    MotorCycle(int maxSpeed, String fuelType, int engineCC){
        super(maxSpeed, fuelType);
        this.engineCC=engineCC;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("engine capacity= "+engineCC);
    }
}
