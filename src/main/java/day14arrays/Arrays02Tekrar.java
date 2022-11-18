package day14arrays;

import java.util.Arrays;

public class Arrays02Tekrar {
    public static void main(String[] args) {


        String arr[] = {"Ali", "Veli", "Can", "Ayse", "Hakan", "Beyza"};


        String str = "";
        String ab[] = new String[arr.length];
        int inx = 0;

            for(int i = 0; i<arr.length; i++ ){

                if( arr[i].equalsIgnoreCase("Hakan") || arr[i].equalsIgnoreCase("Can") ){
                        continue;
                }
                ab[inx] = arr[i];
                inx++;
        }

        System.out.println(Arrays.toString(ab));




    }
}
