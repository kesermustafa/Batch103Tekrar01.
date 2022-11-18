package day05ifelse;

import java.util.Scanner;

public class day05ifelse {
    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini alin;
        Girilen gun ismi gecerli gun ise:
        Gun isminin ilk 3 harfini ilk harf buyuk olarak yazdirin...
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismini giriniz...");
        String gun = input.next().toLowerCase();

        if( gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") ||
                gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar")) {

            System.out.println(gun.substring(0,1).toUpperCase()+gun.substring(1,3).toLowerCase());
        } else {
            System.out.println("Gecerli gun giriniz...");
        }




    }
}
