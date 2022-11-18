package day03typecastingwrapperscanner;

import java.util.Scanner;

public class ScannerTekrar01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kupunu hesaplamak istediginiz sayiyi giriniz...");
        double kup = input.nextDouble();

        System.out.println("Girgiginiz sayini kupu: "+ kup*kup*kup);

        Scanner scan = new Scanner(System.in);
        System.out.println("Hacmi hesalamak icin prizmanin en, boy ve yukseklik degerlerini giriniz");
        double en = scan.nextDouble();
        double boy = scan.nextDouble();
        double yuk = scan.nextDouble();

        System.out.println("Prizmanin hacmi: " + en*boy*yuk + " m3'dur");


    }
}
