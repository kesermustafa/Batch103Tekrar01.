package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class StringDoubleFiyatToplama {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("12.99 TL");
        myList.add("23.60 TL");
        myList.add("54.50 TL");
        myList.add("33.91 TL");


        double toplam = 0;

        for(String w: myList){

            Double fiyat = Double.valueOf(w.replaceAll("[A-Za-z ]",""));

            toplam = toplam+fiyat;

        }
        System.out.println(toplam);










    }
}
