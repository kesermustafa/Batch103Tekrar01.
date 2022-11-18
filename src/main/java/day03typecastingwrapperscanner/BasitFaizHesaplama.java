package day03typecastingwrapperscanner;

import java.util.Scanner;

public class BasitFaizHesaplama {

    public static void main(String[] args) {
       // Basit faizi bulmak için bir kod yazınız.
        // Not: Basit faiz formülü =
        // anapara * oran * yılDegeri /100 int anapara = 10000, oran = 6, yilDegeri = 3; int basitFaiz = anapara * oran * yilDegeri /100;
        // System.out.println("Basit faiz degeri:" + basitFaiz);

        Scanner input = new Scanner(System.in);
        System.out.println("Anapara'yi giriniz...");
        System.out.println("Vade yilini giriniz...");
        System.out.println("Faiz oranini giriniz...");
        double anaPara = input.nextDouble();
        double vadeYili = input.nextDouble();
        double faizOrani = input.nextDouble();

        double basitFaiz = anaPara*faizOrani*vadeYili/100;

        System.out.println("Basit faiz degeri : " +basitFaiz);
        System.out.println("Toplam mevduat : " + (anaPara+basitFaiz));






    }
}
