package day14arrays;

import java.util.Arrays;

public class Arrays00 {
    public static void main(String[] args) {


        //String array olusturuz ve Hakandan onceki tum elemanlari yazdirin.
        String arr[] = {"Ali", "Veli", "Can", "Ayse", "Hakan", "Beyza"};


        for(String w : arr){

            System.out.print(w + "; ");
            if(w.equalsIgnoreCase("Hakan")){
                break;
            }
        }

        System.out.println();


        String str = "";
        String ab[] = new String[arr.length];
        int inx = 0;

        //String array olusturuz ve Can ve Hakan haric tum elemanlari yazdirin.
        for(String w : arr){

            if(w.equalsIgnoreCase("Hakan") || w.equalsIgnoreCase("Can")){
                continue;
            }
            str = str + w +" ";


        }


        for(int i = 0; i<arr.length; i++ ){

            if( arr[i].equalsIgnoreCase("Hakan") || arr[i].equalsIgnoreCase("Can") ){

                ab[inx] = arr[i];
                inx++;
            }
        }

        System.out.println(str);

        System.out.println(Arrays.toString(ab));





    }
}
