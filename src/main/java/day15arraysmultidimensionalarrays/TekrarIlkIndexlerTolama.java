package day15arraysmultidimensionalarrays;

public class TekrarIlkIndexlerTolama {
    public static void main(String[] args) {

          /*
        Asagidaki multi dimensional array'lerin ic array'larinde ayni index'e sahip
        elemanlarin toplamini ekrana yazdiran bir program yapiniz.

        arr1 = {{1,2}, {3, 4, 5}, {6}}
        arr2 = {{7,8,9}, {10,11}, {12}}
         */

        int arr1[][] = {{1, 2}, {3, 4, 5}, {1, 6, 9}, {12}, {11}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}, {25}, {32}};
        int uzunluk = 0;
        int toplam = 0;
        int sum =0;


             uzunluk = Math.min(arr1.length, arr2.length);    // en kucuk uzinlug Mat.min() methodu ile aldik

        for (int i = 0; i < uzunluk; i++) {         // DisLoop sinirlarindayiz

            for (int j = 0; j < arr1[i].length; j++) {
                toplam = arr1[i][j] + toplam;
            }

            for (int k = 0; k < arr2[i].length; k++) {
                sum = arr2[i][k] + sum;
            }

            System.out.println(  i + ".indexdeki elemanlarin toplami : " + (sum +toplam)  );
            toplam = 0;
            sum = 0;
        }




    }
}
