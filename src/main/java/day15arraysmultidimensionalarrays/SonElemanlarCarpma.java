package day15arraysmultidimensionalarrays;

public class SonElemanlarCarpma {
    public static void main(String[] args) {

        /*
        Array'in ic array'lerdeki son elemanlarinin carpimini ekrana yazdiran progrm yapin,

        {{1,2,3}, {4,5}, {6}  ==> 3*5*6 = 90
         */


        int arr[][] = {{1,2,3}, {4,5}, {6}};


        int carpim = 1;
        int idx = 0;

        for(int i = 0; i<arr.length; i++){

            for(int k = 0; k<arr[i].length; k++ ){

                idx = arr[i][k];
            }
            carpim = carpim * idx;
            idx = 0;
        }

        System.out.println("carpim = " + carpim);



    }
}
