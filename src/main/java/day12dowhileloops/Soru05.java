package day12dowhileloops;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {

        /*
        Kullanicindan toplama icin pozitif sayi isteyin.
        islemi bitirmek icin "0" a basmasini soyleyin
        Kullanici "0" a bastiginda kac tane sayi girdigini ve girdigi sayilarin toplamini yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Toplamak istediginiz tam sayiari giriniz. \n islemi sonlandirmak ve toplami gormek icin \"0\" basin ");

        int counter = 0;
        int sayacNegatif = 0;
        double toplam = 0;
        do {

            double sayi = input.nextDouble();

            if(sayi>0){

                    toplam = toplam + sayi;
                    counter++;

            } else if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz...");
                sayacNegatif++;

            } else {
                break;
            }

        }while (true);

        System.out.println("Dahil edilmeyen / girilen Negatif sayi adedi " + sayacNegatif);
        System.out.println("Girilen ve tpolanan pozitif sayi adedi = " + counter);
        System.out.println("toplam = " + toplam);



    }
}
