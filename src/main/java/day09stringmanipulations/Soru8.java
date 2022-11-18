package day09stringmanipulations;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini beraber alin,Kredi karti numarasini alin asagidaki gibi yazdirin...
            M****** K****
            \n**** **** **** ****"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi soy adinizi giriniz...");
        String ad = scan.nextLine().toUpperCase();
        System.out.println("Lutfen kredi karti numaranizi giriniz...");
        String kNo = scan.nextLine();

        int spaceInx = ad.indexOf(" ");
        String ad1 = ad.substring(0,1) + ad.substring (1, spaceInx+1).replaceAll("[a-zA-Z]" , "*") +
                ad.substring(spaceInx+1,spaceInx+2) + ad.substring(spaceInx+2, ad.length()).replaceAll("[a-zA-Z]","*");

        System.out.println(ad1);

        String KKK = kNo.replace(kNo.substring(0,4),"*") + " " +
                kNo.replace(kNo.substring(4,8),"*") + " " +
                kNo.replace(kNo.substring(8,12),"*") + " " +
                kNo.substring(12);;

        System.out.println(KKK);

        int kNoSonSpc = kNo.lastIndexOf(" ");
        String KK = kNo.substring(0,4).replaceAll("[0-9]","*")+" "+
                    kNo.substring(4,8).replaceAll("[0-9]","*")+ " "+
                    kNo.substring(8,12).replaceAll("[0-9]","*")+ " " +
                    kNo.substring(12);

        System.out.println(KK);


    }
}
