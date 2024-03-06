package org.example;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) throws InvalidYearException {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public String vehicleSound() {
        return "Vrooooom!";
    }
}

