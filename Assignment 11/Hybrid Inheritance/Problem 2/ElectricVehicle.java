class ElectricVehicle extends Vehicle {
    private int batteryCapacity; 

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " (Electric) is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }
}