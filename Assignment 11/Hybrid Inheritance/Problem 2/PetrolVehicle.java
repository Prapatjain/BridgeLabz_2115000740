class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println(model + " (Petrol) is refueling. Tank capacity: " + fuelTankCapacity + " liters.");
    }
}