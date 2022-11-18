package day23inheritanceoverride;

public class Math extends Courses {


    public void practice(){
        System.out.println("Solve questions");
    }


    public Math(){
        super("parentta git sitring olan constructor kullan");
        System.out.println("Constructor 1");
    }

    public Math(int a){
        this();
        System.out.println("Constructor 2");
    }


}
