import java.util.*;

class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("C101", "John Doe", 10.5);
        Vehicle bike1 = new Bike("B202", "Alice Smith", 5.0);
        Vehicle auto1 = new Auto("A303", "Bob Johnson", 8.0);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(bike1);
        vehicles.add(auto1);

        double distance = 12.5;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));

            
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle; 
                System.out.println(gpsVehicle.getCurrentLocation());
                gpsVehicle.updateLocation("Downtown");
                System.out.println("Updated: " + gpsVehicle.getCurrentLocation());
            }

        }
    }
}
