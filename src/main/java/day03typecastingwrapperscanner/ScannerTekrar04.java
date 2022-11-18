package day03typecastingwrapperscanner;

import java.util.Scanner;

public class ScannerTekrar04 {

    public static void main(String[] args) {

        //Saati saniye'ye ceviren bir program yapiniz..Long kullanin
        // Saniye = saat*60*60

        Scanner input = new Scanner(System.in);
        System.out.println("saat giriniz");
        int saat = input.nextInt();

        int saniye = saat*60*60;

        System.out.println(saat + " saat = " + saniye + " saniye'dir");






    }
}
