package day02methodcreation;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Mili==>km dönüşümü için artı + sembolünü seç ");
        System.out.println("Saniye==>Saat dönüşümü için bölüm / sembolünü seç ");
        System.out.println("Fahrenhayt==>Santigrat dönüşümü için yıldız * sembolünü seç ");
        String sec=input.next();


        if(sec.equals("+") || sec.equals("/") || sec.equals("*")) {

            System.out.println("Cevirilecek birimin miktarını giriniz");
            double ref=input.nextDouble();

            if (sec.equals("+")) {
                System.out.println(ref * 1.60934);
            } else if (sec.equals("/")) {
                System.out.println((ref / 60) / 60);

            } else if (sec.equals("*")) {
                System.out.println((ref - 32) * 5 / 9);
            }
        }else System.out.println("Geceerli bir işlem seciniz");

    }
}
