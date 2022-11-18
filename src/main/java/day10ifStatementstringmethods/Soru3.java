package day10ifStatementstringmethods;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin.

        girilen kelime cumlede kullanilmamis
        girilen kelime cumlede 1 kere kullanilmis
        girilen kelime cumlede 1'den fazla kullanilmis
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = input.nextLine();
        System.out.println("Bir kelime giriniz..");
        String kelime = input.next().toLowerCase();

                if (!cumle.contains(kelime)) {
                    System.out.println("girilen kelime cumlede kullanilmamis");
                } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
                    System.out.println("girilen kelime cumlede 1 kere kullanilmis");
                } else
                    System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");

    }
}
