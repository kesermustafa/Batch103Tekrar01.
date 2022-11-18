package day28abstraction;

public class Accord implements Engine, Ac, Hood{

    @Override
    public void eco() {
        System.out.println("eco");
    }

    @Override
    public void gas() {
        System.out.println("Gas");
    }


    @Override
    public void digital() {

    }

    @Override
    public void steel() {

    }




}
