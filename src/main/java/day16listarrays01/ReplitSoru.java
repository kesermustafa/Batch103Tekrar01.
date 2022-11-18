package day16listarrays01;

import java.util.Arrays;

public class ReplitSoru {
    public static void main(String[] args) {

        /*
        1)  Write a code that returns the duplicate chars in a String array.(interview Question)
     Input :  String str= "Javayisalsoeasy";
     Output: [a, s]
         */

        String str= "Javaisalsoeasy";
        String yeni = "";

        for(int i = 1; i<str.length(); i++){

            String harf = str.substring(i-1, i);

            if(str.indexOf(harf)!=(str.lastIndexOf(harf))){

                if(!yeni.contains(harf)){
                    yeni= yeni+harf;
                }
            }
        }

        System.out.println(yeni);
        String yeni1[] = yeni.split("");
        System.out.println(Arrays.toString(yeni1));


    }
}
