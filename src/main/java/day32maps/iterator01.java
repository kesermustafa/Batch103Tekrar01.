package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class iterator01 {


    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");


        myList.set(2, "Y");
        // for loop kullanatak her elemanin sonuna "!" isareti koyunuz..
        // Note: loop'lar kendi baslarina "Collection"lari update edemezler..

        for(String w : myList){
            w = w+"!";
        }
        System.out.println(myList); // [Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()){
            String el = itr.next();
            itr.set(el+"!");
        }
        System.out.println(myList);  // [Z!, K!, A!, J!, M!]


        // tersden yazdir.....
        while (itr.hasPrevious()) {
            String element = itr.previous();
            System.out.print(element + "  ");  // M! J! A! K! Z!
        }
        System.out.println();




    }







}
