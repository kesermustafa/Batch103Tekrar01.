package day22inheritanceconstructor;

public class Honda extends Car {

    String color;

    public Honda(){
        super("White",54000);
        System.out.println("Honda Constructor");
    }

    public Honda(String color){
        this.color=color;
    }

}
