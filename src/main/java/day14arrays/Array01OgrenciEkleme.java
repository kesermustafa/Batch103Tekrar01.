package day14arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array01OgrenciEkleme {
    public static void main(String[] args) {

        // Example 3 ; Kullanici ile beraber bir array ousturunuz... ve icine data ekleyiniz...
        // Bir ogretmenin sinifdaki ogrencierin isimlerini application a yukleyen kodu yaziniz..


        Scanner input = new Scanner(System.in);
        System.out.println("Sinif mevcudunu girini...");
        int mvc = input.nextInt();

        String ogAd[] = new String[mvc];

        System.out.println("Programdan cikmak icin X'e basiniz...");

        int i = 1;
        while (i<=ogAd.length){

            System.out.println(i + ". Ogrencinin ismini giriniz..");
            String ad = input.next().toLowerCase().trim();

            boolean harfDisi = ad.replaceAll("[a-zA-Z]", "").length() > 0;

            if (ad.equalsIgnoreCase("x")) {
                break;
            }
            if (!harfDisi) {
                ogAd[i-1] = ad.substring(0,1).toUpperCase()+ad.substring(1);
            }else
                continue;
            i++;
        }


        Arrays.sort(ogAd);
        System.out.print(Arrays.toString(ogAd));








    }
}
