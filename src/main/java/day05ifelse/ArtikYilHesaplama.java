package day05ifelse;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        //Kullanicidan yil girmesini isteyin girilen yilin artik yol olup olmadigini yazddirin...

        Scanner input = new Scanner(System.in);
        System.out.println("Bir yil giriniz...");
        int yil = input.nextInt();


        if (yil % 4 == 0) {
            if (yil % 100 != 0) {
                System.out.println("Artik yil");
            } else if (yil % 400 == 0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil degil...");
            }

        } else {
            System.out.println("Artik yil degil...");
        }

        System.out.println("***********");

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println("Artik yil...");
            } else {
                System.out.println("Artik yil degil...");
            }
        } else if (yil % 4 == 0) {
            System.out.println("Artik yil...");
        } else {
            System.out.println("Artik yil degil....");
        }

        System.out.println("***********");

        if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0) && (yil % 4000 != 0))
            System.out.println(yil + " artik yildir");
        else
            System.out.println(yil + " artik yil degil");

    }

}
