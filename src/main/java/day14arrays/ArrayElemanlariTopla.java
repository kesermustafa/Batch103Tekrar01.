package day14arrays;

import java.util.Arrays;

public class ArrayElemanlariTopla {

    public static void main(String[] args) {

        int arr[] = {3, 5, 9, 11, 23, 41};
        int brr[] = {2, 3, 7, 21,12 };
        int topla[]=new int[arr.length];


        for(int i =0; i<arr.length; i++){

            if(i<brr.length) {
                topla[i] = arr[i] + brr[i];
            }else{
                topla[i]=arr[i];
            }

        }

        System.out.println(Arrays.toString(topla));


    }

}
