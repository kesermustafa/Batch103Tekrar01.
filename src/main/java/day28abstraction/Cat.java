package day28abstraction;

public class Cat extends Mammal{

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}
