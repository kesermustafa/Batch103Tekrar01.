package day07SwitchTernary;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz opreratoru seciniz....");
        System.out.println("1- Mil'den Km'ye ");
        System.out.println("2- Saniye'den Saat'e ");
        System.out.println("3- Sicaklik birimleri cevirme ");

        int operator = input.nextInt();

        switch (operator) {
            case 1 -> {
                System.out.println("Mil " + "\nCevirmek istediginiz degeri giriniz...");
                double mil = input.nextDouble();
                System.out.println("Mil " + mil + " = " + mil * 1.60934 + " km'dir");
            }
            case 2 -> {
                System.out.println("Saniye " + "\nCevirmek istediginiz degeri giriniz...");
                double saniye = input.nextDouble();
                System.out.println("Mil " + saniye + " = " + (saniye / 60) / 60 + " saat'dir");
            }
            case 3 -> {
                System.out.println("""
                        Sıcaklık Birimleri Çevirmek icin opreratoru seciniz....
                         1 Santigrta'tan Faherenayta\s
                         2 Fahrenaayt'tan Santigrat'a""");
                int op = input.nextInt();
                switch (op) {
                    case 1 -> {
                        System.out.println("Cantigrat " + "\nCevirmek istediginiz degeri giriniz...");
                        double cantigrat = input.nextDouble();
                        double sonucFh = (cantigrat * 9/5)+32;
                        System.out.println( sonucFh );
                    }
                    case 2 -> {
                        System.out.println("Fahrenayt " + "\nCevirmek istediginiz degeri giriniz...");
                        double fahrenayt = input.nextDouble();
                        double sonuc = (fahrenayt - 32) * 5 / 9;
                        System.out.println(fahrenayt + " °F" + " = " + sonuc + " °C");
                    }
                    default -> System.out.println("Gecerli parametre giriniz....");
                }
            }
            default -> System.out.println("Gecerli parametre giriniz....");
        }



    }

}
