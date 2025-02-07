public class Main {
    public static void main(String[] args) {
        
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle bmw = new PetrolVehicle("BMW M3", 280, 60);

        tesla.displayDetails();
        tesla.charge();

        System.out.println();

        bmw.displayDetails();
        bmw.refuel();
    }
}
