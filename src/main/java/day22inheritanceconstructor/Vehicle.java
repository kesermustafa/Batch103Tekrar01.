package day22inheritanceconstructor;

public class Vehicle {

    public String type;

    public Vehicle(){

    }
    public Vehicle(String type){
        this.type=type;
        System.out.println("Vehicle Constructor");
    }



}
