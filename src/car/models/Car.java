package car.models;

public class Car {

    private String licensePlate;
    private String ownerName;
    private double speed = 0;
    private double currentFuel = 45.0;
    private double maxFuel = 50.0;


    public Car(String licensePlate, String ownerName, double speed){
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getSpeed(){
        return speed;
    }

    public void addFuel(){
        currentFuel += 1.0;
        System.out.println("The current fuel is: " + currentFuel);
    }

    public double getCurrentFuel(){
        return currentFuel;
    }

    public double getMaxFuel(){
        return maxFuel;
    }
}
