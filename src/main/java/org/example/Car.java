package org.example;

class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int year, int numOfDoors) throws InvalidYearException {
        super(brand, model, year);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    @Override
    public String vehicleSound() {
        return "Vroom Vroom!";
    }
}
