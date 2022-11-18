package day09stringmanipulations;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        /*
        Kullanicidan isim isteyin...
        - isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        - isim "Z" harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        - ikiside yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scan.nextLine();

        boolean a = isim.contains("a");
        boolean z = isim.contains("Z");

        if(a || z){
            if(a){
                System.out.println("Girdiginiz isim a harfi iceriyor");
            }
            if(z){
                System.out.println("Girdiginiz isim Z harfi iceriyor");
            }
        }else{
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }





    }

}
