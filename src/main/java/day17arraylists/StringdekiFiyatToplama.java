package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class StringdekiFiyatToplama {
    public static void main(String[] args) {

        /*
        String bir listede verilen tüm fiyatların toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
         */

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.50");

        double toplam = 0;

        for(String w: myList){

            Double fiyat = Double.valueOf(w.replace("$",""));
            toplam = toplam + fiyat;
        }
        System.out.println(toplam);




    }
}
