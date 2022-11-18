package day14arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar {
    public static void main(String[] args) {

        // Example 3 ; Kullanici ile beraber bir array ousturunuz... ve icine data ekleyiniz...
        // Bir ogretmenin sinifdaki ogrencierin isimlerini application a yukleyen kodu yaziniz..

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz..");
        int arry = input.nextInt();

        String ogAd[] = new String[arry];

        System.out.println("Programdan cikmak icin X'e basin");

//        int a = 1;
//        do {
//            System.out.println( a + ". ogrenci adini giriniz.");
//            String ad = input.next();
//
//            if(ad.equalsIgnoreCase("X")){
//                break;
//            }
//            ogAd[a-1] = ad;
//
//            a++;
//        }while (a<=arry);

        int x = 1;
        while (x<=arry){

            System.out.println(x +". ogrenci adini giriniz...");
            String ad = input.next();

            if(ad.equalsIgnoreCase("X")){
                break;
            }

            ogAd[x-1] = ad;

            x++;
        }
        System.out.println(Arrays.toString(ogAd));



//        for(int i = 1; i<=arry; i++){
//
//            System.out.println( i + ". ogrenci adini giriniz.");
//            String ad = input.next();
//
//            if(ad.equalsIgnoreCase("X")){
//                break;
//            }
//
//            ogAd[i-1] = ad;
//
//        }
//        System.out.println(Arrays.toString(ogAd));




    }
}
