package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator02 {
    public static void main(String[] args) {



        List<Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(13);
        myList.add(56);
        myList.add(23);
        myList.add(45);
        myList.add(14);
        myList.add(40);


        ListIterator<Integer> itr = myList.listIterator();


        for(int i=myList.size()-1; i<0; i--){

                System.out.println(myList.get(i));


        }





        System.out.println(myList);







    }
}
