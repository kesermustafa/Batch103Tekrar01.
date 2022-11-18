package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02YakinIkiTamSayiBulma {
    public static void main(String[] args) {

        /*Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

         */
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);

        int minDeger = Integer.MAX_VALUE;

        for(int i=1; i<h.size(); i++){
            minDeger = Math.min(minDeger, h.get(i)-h.get(i-1));
        }

        for(Integer i=1; i<h.size(); i++){
            if(h.get(i)-h.get(i-1) == minDeger){
                System.out.println(h.get(i) + " and " + h.get(i-1));
            }
        }
        System.out.println("*****************");


        List<Double> fiyat = new ArrayList<>();

        fiyat.add(12.99);
        fiyat.add(23.50);
        fiyat.add(9.90);
        fiyat.add(31.49);
        fiyat.add(52.90);
        fiyat.add(32.99);
        System.out.println(fiyat);

        Collections.sort(fiyat);
        System.out.println(fiyat);

        Double minEder = Double.MAX_VALUE;

        for(int i = 1; i<fiyat.size(); i++){

            minEder = Math.min(minEder, fiyat.get(i)-fiyat.get(i-1));

        }

        for(int i = 1; i<fiyat.size(); i++){

            if(fiyat.get(i)-fiyat.get(i-1)==minEder){
                System.out.println(fiyat.get(i-1)+ " ve " + fiyat.get(i));
            }
        }

















    }
}
