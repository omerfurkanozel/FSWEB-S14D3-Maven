package org.example.arge;

import javax.xml.namespace.QName;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar= new ElectricCar("tesla","tesla dsc",700,2000);
        CarSkeleton hybridCar= new HybridCar("toyota","tyt dsc",4,4000,40);
        CarSkeleton gasPowerdCar = new GasPoweredCar("honda","honda dsc",30,4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPowerdCar);


    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
