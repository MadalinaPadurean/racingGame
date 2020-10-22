package org.fasttrackit;

public class AutoVehicle extends Vehicle {

   private Engine engine;
   private double mileage;
   private double fuelLevel;

    public  AutoVehicle(Engine engine) {
        this.engine = engine;

    }

    public AutoVehicle(Engine engine, String name) {
        this(engine);
        setName(name);
    }


    public AutoVehicle() {

    }
}
