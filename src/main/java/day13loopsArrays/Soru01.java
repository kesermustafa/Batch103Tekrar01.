package day13loopsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

/*
         input: 09/20/2022

        output: Monyth:09 Day:20 Year:2022
  Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi giriniz...");
        String date="09/20/2022";

        System.out.print("Month:"+date.split("/")[0]+" ");
        System.out.print("Day:"+date.split("/")[1]+" ");
        System.out.print("Year:"+date.split("/")[2]);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        String date="09/20/2022";

        String date1[] = date.split("/");
        System.out.println(Arrays.toString(date1));

        System.out.println("Gun: " +  date1[0] + "   Ay : " + date1[1] + "  Yil: " + date1[2]);



    }
}
