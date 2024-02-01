package org.example;

// Product
interface Vehicle {
    String getType();
}

//ConcreteProductA
class Car implements  Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

//ConcreteProductB
class Bike implements  Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

//ConcreteProductC
class Truck implements  Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

// Creator
abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

// ConcreteCreatorA
class BikeFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
      return new Bike();
    };
}

// ConcreteCreatorB
class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    };
}

// ConcreteCreatorB
class TruckFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Truck();
    };
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        System.out.println(car.getType());
        System.out.println(bike.getType());
        System.out.println(truck.getType());
    }
}