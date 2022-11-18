package day05ifelse;

import java.util.Scanner;

public class IfElse04 {
    public static void main(String[] args) {

        /*
        Kullanicidan 4 basamakli sayi gimesini isteyin, girdigi sayi 5'e bolunuyorsa son rakamini
        kontrol edin:
            Son rakami  0 ise ekrana "5'e bolunuen cift sayi" yazdirin
            Son rakami 0 degilse "5'e bolunen tek sayi" yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("4 basamakli tam sayi giriniz...");
        int sayi = input.nextInt();

            if (sayi > 999 && sayi < 10000) {
                if (sayi % 5 == 0) {
                    if (sayi % 2 == 0) {
                        System.out.println("5'e bolunuen cift sayi...");
                    } else {
                        System.out.println("5'e bolunen tek sayi...");
                    }
                } else {
                    System.out.println("Tekrar deneyin...");
                }
            } else {
                System.out.println("Gecerli parametre giriniz...");
            }

    }

}
