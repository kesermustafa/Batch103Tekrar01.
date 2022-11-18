package day03typecastingwrapperscanner;

import java.util.Scanner;

public class ScannerTekrar03 {
    public static void main(String[] args) {

        // Mil'i km'ye ceviren program yaziniz...  km = mile * 1.6

        Scanner input = new Scanner(System.in);
        System.out.println("km'ye cevirmek istediginiz mil giriniz....");
        double mil = input.nextDouble();

        double mil_1 = 1.6;

        double sonuc = mil*mil_1;

        System.out.println(mil + " mil : = " + sonuc + " km'dir");



    }
}
