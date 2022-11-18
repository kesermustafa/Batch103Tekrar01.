package day13loopsArrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        int say[] = new int[7];
        int sy[] = {5, 7, 11, 14, 17, 25, 49, 65, 77, 82, 94, 99};

        System.out.println(Arrays.toString(sy));

        sy[8] = 21;
        System.out.println(Arrays.toString(sy));


        int sayac = 0;

        for(int i =0; i<sy.length; i++){

            if(sy[i]<50){
                sayac++;
            }
        }
        System.out.println("sayac = " + sayac);

    }
}
