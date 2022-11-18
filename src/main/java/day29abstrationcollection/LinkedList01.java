package day29abstrationcollection;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {


    LinkedList<String> visitors = new LinkedList<>();

    visitors.add("Tom");
    visitors.add("Hanks");
    visitors.add("Tom Hanks");
    visitors.add("Bread");
    visitors.add("Pitt");
    visitors.add("Bread Pitt");
        System.out.println(visitors); //[Tom, Hanks, Tom Hanks, Bread, Pitt, Bread Pitt]
    visitors.add(2, "Angelina Julie");
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Bread, Pitt, Bread Pitt]








    }


}
