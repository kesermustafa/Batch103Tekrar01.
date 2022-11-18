package day13loopsArrays;

import java.util.Arrays;

public class InterviewSorusu {
    public static void main(String[] args) {

        String str = "Bugun hava gunesli ve acik";

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String ch[] = str1.split("");
        System.out.println(Arrays.toString(ch));
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));


        int sayac = 0;

        for(int i =1 ; i<ch.length ; i++){

            if(ch[i-1].equals(ch[i])){
                sayac++;
            }else{
                System.out.println(ch[i-1] + " nin sayisi " + (sayac + 1));
                sayac = 0;
            }
            if(i==ch.length-1){
                System.out.println(ch[i] + " nin sayisi " + (sayac + 1));
            }
        }







    }
}
