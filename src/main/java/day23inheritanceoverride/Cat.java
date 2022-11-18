package day23inheritanceoverride;

public class Cat extends Mammal{

    public void moew(){
        System.out.println("Cats moew");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }
}
