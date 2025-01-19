package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private  double avgKmPerCharge;
    private  int batterySize;

    public ElectricCar(String name, String descripton, double avgKmPerCharge, int batterySize) {
        super(name, descripton);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }


    @Override
    public String drive() {
        return "run from electric car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting..";
    }
}
