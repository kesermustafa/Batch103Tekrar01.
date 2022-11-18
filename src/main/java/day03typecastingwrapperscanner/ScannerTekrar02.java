package day03typecastingwrapperscanner;

import java.util.Scanner;

public class ScannerTekrar02 {

    public static void main(String[] args) {

        // Yaricapi kullanicidan alinan bir dairenin cevresini ve alanini hesaplayan
        //  bir program yapiniz.
        /*
            pi = 3.14159
            Alan : 3.14159 * radius * radius
            Cevre: 2 * 3.14159 * radius
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Cevresini ve alanini hesplayacaginiz dairenin yari capini giriniz...");
        double yariCap = input.nextDouble();

        double pi = 3.14159;
        double cevre = 2*pi*yariCap;
        double alan = pi*yariCap*yariCap;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);









    }
}
