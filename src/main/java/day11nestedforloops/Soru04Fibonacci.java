package day11nestedforloops;

import java.util.Scanner;

public class Soru04Fibonacci {
    public static void main(String[] args) {

        /*
        Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
         sayılarını yazdıran kodu yazınız.
        Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");
        int number = scan.nextInt();
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");


        for (int i = 1; i < number-1; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }



    }
}
