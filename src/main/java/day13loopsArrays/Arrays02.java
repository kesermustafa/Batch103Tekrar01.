package day13loopsArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int sira[] = new int[8];

        sira[0] = 9;
        sira[1] = 11;
        sira[2] = 3;
        sira[3] = 7;
        sira[4] = 19;
        sira[5] = 91;
        sira[6] = 32;
        sira[7] = 41;

        System.out.println(Arrays.toString(sira));  //[9, 11, 3, 7, 19, 91, 32, 41]

        //Array deki ilk ve son elemanlarin toplami.

        int ilk = sira[0];
        int son = sira[sira.length-1];
        System.out.println(ilk + son); // 50

        // en buyuk elemani yazdirma
        Arrays.sort(sira);  // kucuk den buyuge sirala  ve son elamani yazdir...
        System.out.println(sira[sira.length-1]);  //

        int toplam = 0;
        for(int i = 0 ; i<sira.length ; i++){
            toplam = toplam + sira[i];
        }
        System.out.println(toplam); // 213

        int topla = 0;
        int i = 0;
        while (i<sira.length){
            topla = topla + sira[i];
            i++;
        }
        System.out.println(topla);  // 213

        int sonuc = 0;
        int k = 0;
        do {
           sonuc = sonuc + sira[k];
            k++;
        }while (k<sira.length);
        System.out.println(sonuc);  // 213

        int net = 0;
        for(int w : sira ){
            net = net + w;
        }
        System.out.println(net); //213







    }
}
