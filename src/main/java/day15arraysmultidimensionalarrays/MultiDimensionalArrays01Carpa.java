package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01Carpa {
    public static void main(String[] args) {


        int arr[][] = new int[3][4];

        arr[0][0] = 3;
        arr[0][1] = 7;
        arr[0][2] = 11;
        arr[0][3] = 21;

        arr[1][0] = 8;
        arr[1][1] = 15;
        arr[1][2] = 34;
        arr[1][3] = 1;

        arr[2][0] = 5;
        arr[2][1] = 45;
        arr[2][2] = 86;
        arr[2][3] = 69;

        System.out.println(Arrays.deepToString(arr)); // [[3, 7, 11, 21], [8, 15, 34, 1], [5, 45, 86, 69]]

        int toplam = 0;
        int carpma = 1;

        for(int i = 0 ; i<arr.length ; i++ ){

            for (int k = 0; k<arr[i].length; k++){

                if(k%2==0){
                    toplam = toplam + arr[i][k];
                }

                if(k%2!=0) {
                    carpma = carpma * arr[i][k];
                }
            }
        }

        System.out.println(" Carpim  = " + carpma);
        System.out.println(" Toplam  = " + toplam);

        System.out.println("bolme : " + (carpma/toplam));




    }
}
