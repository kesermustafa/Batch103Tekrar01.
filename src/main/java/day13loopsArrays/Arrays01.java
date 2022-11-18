package day13loopsArrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int age[] = new int[6];
        System.out.println(Arrays.toString(age));  // [0, 0, 0, 0, 0, 0]

        age[0] = 11;
        age[1] = 15;
        age[2] = 9;
        age[3] = 21;
        age[4] = 17;
        age[5] = 6;

        System.out.println(Arrays.toString(age)); //  [11, 15, 9, 21, 17, 6]

        Arrays.sort(age);                   // kucuk ==> buyuk SIRALAMA
        System.out.println(Arrays.toString(age)); //  [6, 9, 11, 15, 17, 21]

        //Array deki herhangi bir elemani nasil yazdirabiliriz..
        System.out.println(age[3]);   // ==> 11

        // Arrayy uzunlugunu yani eleman sayisini bulma
        System.out.println(age.length);  //6

        //Example 1: Array de ki TUM elemanin toplamini ekrana yazdiriniz..
        //  [6 + 9 + 11 + 15 + 17 + 21] ==> 79

        // --- FOR LOOP ILE ----
        int toplam = 0;
        for( int i = 0 ; i<age.length ; i++ ){
            toplam = toplam + age[i];
        }
        System.out.println(toplam);  // 79

        // --- WHILE LOOP ILE TOPLA ---

        int sum = 0;
        int i = 0;
        while (i<age.length){
            sum = sum + age[i];
            i++;
        }
        System.out.println(sum);  // 79

        // ---- DO - WHILE - LOOP ----

        int topl = 0;
        int k = 0;
        do {
            topl = topl + age[k];
            k++;
        }while (k<age.length);
        System.out.println(topl); // 79


        // --- FOR EACH LOOP ---

        int top = 0;
        for(int w : age ){
            top = top + w;
        }
        System.out.println(top);  // 79

    }
}
