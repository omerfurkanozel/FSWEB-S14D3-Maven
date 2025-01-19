package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String descripton, double averageKmPerLiter, int cylinders) {
        super(name, descripton);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String drive() {
        return "run from  GasPoweredCar car";
    }

    @Override
    public String startEngine() {
        runEngine( this);
        return getName() + " car starting..";
    }

}
