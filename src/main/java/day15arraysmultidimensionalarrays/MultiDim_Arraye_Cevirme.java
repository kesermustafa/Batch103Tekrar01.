package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDim_Arraye_Cevirme {
    public static void main(String[] args) {

        /*
		 Asagidki multi dimensional array'in ic array'lerde ki tum elemanlarin toplamini birer birer bulun
		 ve her bir sonucu yeni bir arrayín elemani yapan ve yeni array'i ekrana yazdiran program yapin.

		 ornek ; { {5,2,13}, {41,25}, {63,17} }  ==> 5+2+13=20   41+25=66   63+17=80    ===>    {20, 66, 80}
		 */

        int arr[][] = { {5,2,13}, {41,25}, {63,17}};

        int sum = 0;

        int newArr[] = new int[arr.length];

        for(int i = 0; i<arr.length; i++){

            for(int k = 0; k<arr[i].length; k++){
                sum = sum + arr[i][k];
            }
            newArr[i] = sum;
            sum = 0;
        }

        System.out.println(Arrays.toString(newArr));


        int[] yeni = new int[arr.length];
        int toplam = 0;
        int i = 0;

        for(int[] w: arr){
            for(int k : w){
                toplam = toplam +k;
            }
            yeni[i]=toplam;
            i++;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeni));



    }
}
