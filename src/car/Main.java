package car;

import car.models.Car;

public class Main {

    public static void main(String[] args){
        Car fordKa = new Car("61-ZL-XK", "Daniel", 60);
        System.out.println(fordKa.getLicensePlate());
        while(fordKa.getCurrentFuel() < (fordKa.getMaxFuel())){
            fordKa.addFuel();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(fordKa.getCurrentFuel() == fordKa.getMaxFuel()){
            System.out.println("The tank is full!");

        }
    }
}
