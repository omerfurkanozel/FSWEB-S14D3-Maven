package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;



    public HybridCar(String name, String descripton, int cylinders, int batterSize, double avgKmPerLiter) {
        super(name, descripton);
        this.cylinders = cylinders;
        this.batterySize = batterSize;
        this.avgKmPerLiter = avgKmPerLiter;
    }

    @Override
    public String drive() {
        return "run from  Hybrid car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting..";
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
