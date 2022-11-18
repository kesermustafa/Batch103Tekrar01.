package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

       /* Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        */
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$83.60");
        myList.add("$8.25");
        myList.add("$54.45");

        List<Double> decimalList = new ArrayList<>();

        for(String w : myList){

            Double price = Double.valueOf(w.replace("$", ""));
            decimalList.add(price);
        }

        Collections.sort(decimalList);
        Double sum = decimalList.get(0) + decimalList.get(decimalList.size()-1);
        System.out.println(sum);





    }
}
