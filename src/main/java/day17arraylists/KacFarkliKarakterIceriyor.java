package day17arraylists;

import java.util.*;

public class KacFarkliKarakterIceriyor {
    public static void main(String[] args) {
        //Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
        //Örnek: {10, 31, 15, 7, 15, 7, 7, 8, 9} ==> 6


        List<Integer> list = Arrays.asList(10, 31, 15, 7, 15, 7, 7, 8, 9);
        Collections.sort(list);
        System.out.println(list);

        int counter = 0;

        for( int ix=1; ix<list.size(); ix++ ){

            if( !(list.get(ix-1).equals(list.get(ix)) ) ){
                counter++;
            }
        }
        System.out.println(counter+1);



    }
}
