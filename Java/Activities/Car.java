package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("color is " +color);
        System.out.println("transmission is " +transmission);
        System.out.println("make is " +make);
        System.out.println("tyres is " +tyres);
        System.out.println("doors is " +doors);

    }
    public void accelerate(){
        System.out.println("Car is moving forward.");

    }
    public void brake(){
        System.out.println("Car has stopped.");

    }

}
