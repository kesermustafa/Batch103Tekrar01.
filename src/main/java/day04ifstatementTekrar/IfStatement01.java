package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan gun isimlerini alin ve hafta ici veya hafta sonu yazirin...

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gun = input.nextLine().toUpperCase();

        if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println(" gun = " + "Hafta ici");
        }
        if (gun.equalsIgnoreCase("Cumartesi") ||
                gun.equalsIgnoreCase("Pazar")) {
            System.out.println(" gun = " + "Hafta sonu");
        }

    }
    }
