package day09stringmanipulations;

import java.util.Scanner;

public class Soru6 {

    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini beraber alin,Kredi karti numarasini alin asagidaki gibi yazdirin...
        M****** K****
        **** **** **** 1234
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi soy adinizi giriniz...");
        String ad = scan.nextLine().toUpperCase();
        System.out.println("Lutfen kredi karti numaranizi ornek deki gibi giriniz...\n**** **** **** ****");
        String kNo = scan.nextLine();

        int spaceInx = ad.indexOf(" ");
        String ad1 = ad.substring(0,1) + ad.substring (1, spaceInx+1).replaceAll("[a-zA-Z]" , "*") +
        ad.substring(spaceInx+1,spaceInx+2) + ad.substring(spaceInx+2, ad.length()).replaceAll("[a-zA-Z]","*");

        System.out.println(ad1);

        int kNoSonSpc = kNo.lastIndexOf(" ");
        String KK = kNo.substring(0, kNoSonSpc+1).replaceAll("[^ ]", "*") + kNo.substring(kNoSonSpc+1);

        System.out.println(KK);


    }
}
