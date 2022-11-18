package day04ifstatementTekrar;

import java.util.Locale;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

          /*
        char variable lari matematiksel islemlerde kullanirsaniz Java onlarin ASCII degerlerini kullanir.
            Ornegin  System.out.println('A'+ 'C');  ekrana AC yerine 132 yazdirir...
            Note : Javada "+" sembolunun iki anlami vardir.
                1-Toplama islemi
                2-Birlestirme islemi
                Java "+" sembolu gorunce once toplama yapmaya calisir,
                yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
         */

        /*
        Kullanicidan ilk ve soyismini aliniz ilk ve soyisminin ilk harflerini ekrana yazdirin.
        Ali Can   ==> AC
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Tam adinizi giriniz....");
        String name = input.nextLine().toUpperCase();

        char ch1 = name.split(" ")[0].charAt(0);
        char ch2 = name.split(" ")[1].charAt(0);

        System.out.println(""+ch1+ch2);













    }


}
