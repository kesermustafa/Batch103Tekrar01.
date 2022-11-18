package day13loopsArrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays03 {
    public static void main(String[] args) {

        String str[] = new String[5];

        str[0] = "Muz";
        str[1] = "Elma";
        str[2] = "Armut";
        str[3] = "Uzum";
        str[4] = "Nar";
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        Arrays.sort(str, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(str));

        System.out.println(str.length);

        int toplam = 0;
        for(String w : str){
            toplam = toplam + w.length();
        }
        System.out.println(toplam);

        String str2[] = str;
        int topla = 0;
        int i = 0;
        while (i<str2.length){

            topla = topla + str2[i].length();
            i++;
        }
        System.out.println(topla); //

        int sonuc = 0;
        int ix = 0;
        do {

            sonuc = sonuc + str2[ix].length();
           ix++;
        }while (ix<str2.length);
        System.out.println("sonuc = " + sonuc);

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        System.out.println(str[4]);

    }
}
