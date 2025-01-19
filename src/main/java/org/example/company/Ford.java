package org.example.company;

public class Ford extends Car{
    public Ford (String name, int cylinders) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getName()+"is accelerating!";
    }

    @Override
    public String brake() {
        return getName()+ "is barking!";
    }

    @Override
    public String startEngine() {
        return getName()+ "engine is starting!";
    }
}
