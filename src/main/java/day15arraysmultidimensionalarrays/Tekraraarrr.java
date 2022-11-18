package day15arraysmultidimensionalarrays;

public class Tekraraarrr {
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
            uzunluk = arr1[i].length;

            if (arr1[i].length > arr2[i].length) {   //
                uzunluk = arr2[i].length;
            }
            for (int j = 0; j < uzunluk; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + ".indexdeki elemanlarin " + j + ". elemanlari toplami : "+toplam);
            }
        }











//            int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
//            int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
//
//            for (int i = 0; i < arr1.length; i++) {
//
//                if (arr1[i].length < arr2[i].length) {
//
//                    for (int k = 0; k < arr1[i].length; k++) {
//                        System.out.println(arr1[i][k] + " + " + arr2[i][k] + " = " + (arr1[i][k] + arr2[i][k]));
//                    }
//                } else {
//                    for (int k = 0; k < arr2[i].length; k++) {
//                        System.out.println(arr1[i][k] + " + " + arr2[i][k] + " = " + (arr1[i][k] + arr2[i][k]));
//                    }
//                }
//            }



//        int arr1[][] = {{1, 2,3}, {3, 4, 5}, {6}};
//        int arr2[][] = {{7, 8, 9}, {10}, {12}};
//        int topla=0;
//        for (int i=0; i< arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                if (arr2[i].length > j) {
//                    topla = arr1[i][j] + arr2[i][j];
//                    System.out.println(arr1[i][j] + "+" + arr2[i][j] + "=" + topla);
//                }
//                topla = 0;
//            }
//
//        }



//
//        int arr1[][] = {{1,2}, {3, 4, 5}, {6}};
//        int arr2[][] = {{7,8,9}, {10,11}, {12}};
//
//
//
////        for(int x = 0; x<arr1.length; x++){
////
////            for(int k = 0; k<arr1[x].length; k++){
////                idx0Toplam = idx0Toplam + arr1[x][k];
////            }
////            newArr1[x] = idx0Toplam;
////            idx0Toplam = 0;
////        }
//
//
//        int toplam = 0;
//        String str = "";
//
//        for(int i = 0; i<arr1.length; i++) {
////
//            for (int k = 0; k < arr1[i].length; k++) {
//               toplam = arr1[i][k] + toplam;
//            }
//
//            str = str + " " + toplam;
//            toplam = 0;
//
//        }
//        System.out.println(str);

    }
}
