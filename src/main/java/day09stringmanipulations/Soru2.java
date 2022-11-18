package day09stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin:
            Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            Cumle "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak,
            iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor... yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String str = scan.nextLine().toLowerCase();

        boolean kucuk = str.contains("kucuk");
        boolean buyuk = str.contains("buyuk");



        if(kucuk || buyuk) {
            if (kucuk) {
                System.out.println(str.toLowerCase());
            } else if (buyuk) {
                System.out.println(str.toUpperCase());
            }
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor...");
        }

    }
}
