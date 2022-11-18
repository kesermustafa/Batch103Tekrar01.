package day13loopsArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int stdAges[] = new int[7]; // [0, 0, 0, 0, 0, 0, 0]

        //Array nasil yazdirilir ogrendik
        System.out.println(Arrays.toString(stdAges));

        //Array lere elemanlar nasil eklenir...?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges)); //[12, 11, 13, 14, 10, 12, 12]

        for(int i = 0 ; i<stdAges.length; i++){
            System.out.print(stdAges[i] + ", "); //12, 11, 13, 14, 10, 12, 12,
        }
        System.out.println();

        for(int w : stdAges){
            System.out.print(w + "; ");
        }
        System.out.println();

        
       for(int w : stdAges){
           if(w%2!=0){
               continue;
           }
           System.out.print(w + ": ");
       }
        System.out.println();
       for(int w : stdAges){
           if(w <= 11){
               System.out.print("/" + w + "/");
           }
       }

        System.out.println();
        for(int w : stdAges){
            if(w == 10){
                break;
            }
            System.out.print("/" + w + "/");
        }

        System.out.println();

        System.out.println(Arrays.stream(stdAges).sum());





    }
}
