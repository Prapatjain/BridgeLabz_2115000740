
public class Thermostat  extends Device{
    String temperatureSetting;
    Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting= temperatureSetting;
    }
    void displayStatus(){
        System.out.println("Device Id:" +deviceId +" ,with status: "+ status+" ,have current temp setting: "+temperatureSetting );
    }
}
