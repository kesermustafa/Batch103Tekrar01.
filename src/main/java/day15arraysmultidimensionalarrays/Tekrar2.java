package day15arraysmultidimensionalarrays;

public class Tekrar2 {
    public static void main(String[] args) {

         /*
        Asagidaki multi dimensional array'lerin ic array'larinde ayni index'e sahip
        elemanlarin toplamini ekrana yazdiran bir program yapiniz.

        arr1 = {{1,2}, {3, 4, 5}, {6}}
        arr2 = {{7,8,9}, {10,11}, {12}}
         */


        int arr1[][] = {{1, 2}, {3, 4, 5}, {6,11}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12, 22}};
        int uzunluk = 0;
        int toplam = 0;


        for (int i = 0; i < arr1.length; i++) {      //dis loop

            uzunluk = Math.min(arr1[i].length, arr2[i].length);

            for (int j = 0; j < uzunluk; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println( i + ".index   " + j + ". index'deki elemanlari toplami : " + toplam);
            }
        }





    }
}
