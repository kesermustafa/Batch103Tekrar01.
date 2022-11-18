package day11nestedforloops;

import java.util.Scanner;

public class Soru03AsalSayi {
    public static void main(String[] args) {

       /* Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        yönlendiriniz.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Asal olup olmadigini kontrol etmek icin pozitif bir tamsayi giriniz: ");
        int number = scan.nextInt();

        int count = 0;

        if(number>0) {
            if (number == 1) {
                System.out.println(number + " bir asal sayidir");

            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    }
                }

                if(count==0) {
                    System.out.println(number + " bir asal sayidir ");
                }else {
                    System.out.println(number + " bir asal sayi degildir ");
                }
            }
        }else {
            System.out.println("Pozitif bir tam sayi giriniz ");
        }



    }
}
