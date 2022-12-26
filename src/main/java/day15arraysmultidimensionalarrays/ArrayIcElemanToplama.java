package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class ArrayIcElemanToplama {

    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array'lerin ic array'larinde ayni index'e sahip
        elemanlarin toplamini ekrana yazdiran bir program yapiniz.

        arr1 = {{1,2}, {3, 4, 5}, {6}}
        arr2 = {{7,8,9}, {10,11}, {12}}

         */

        int arr1[][] = {{1,2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7,8,9}, {10,11}, {12}};

        int idx0Toplam = 0;
        int idx1Toplam = 0;

        int ilk = 0;

        int newArr1[] = new int[arr1.length];
        int newArr2[] = new int[arr2.length];

        for(int x = 0; x<arr1.length; x++){

            for(int k = 0; k<arr1[x].length; k++){
                idx0Toplam = idx0Toplam + arr1[x][k];
            }
            newArr1[x] = idx0Toplam;
            idx0Toplam = 0;
        }

        for(int i = 0; i<arr2.length; i++){

            for(int k = 0; k<arr2[i].length; k++){
                idx1Toplam = idx1Toplam + arr2[i][k];
            }
            newArr2[i] = idx1Toplam;
            idx1Toplam = 0;
        }


        int newArr3[] = new int[arr2.length];

        int sonuc = 0;
        for(int m = 0; m<newArr3.length; m++){

            sonuc = sonuc + (newArr1[m] + newArr2[m]);
            newArr3[m]= sonuc;
            sonuc = 0;
        }

        for(int i=0; i<newArr3.length; i++){

            System.out.println("arr1 ve arr2'nin " + i + ". indexleri elemanlari toplami: " + newArr3[i]);
        }

    }
}
