package Oop_Class_1;

public class Car {
    String manufacturer;
    String model;
    int year;
    Car(){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }
    void accelerate(){
        System.out.println("Car is accelerating.");
    }
    void brake(){
        System.out.println("Car is braking.");
    }
    public static void main(String[] args){
        Car car = new Car();
        car.accelerate();
        car.brake();

    }
}


