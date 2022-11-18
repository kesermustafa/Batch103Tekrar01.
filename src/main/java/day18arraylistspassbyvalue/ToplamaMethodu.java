package day18arraylistspassbyvalue;

import java.util.Arrays;
import java.util.Scanner;

public class ToplamaMethodu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sati toplamam istersiniz. ");
        int sayi = input.nextInt();

        int toplanacaklar[] = new int[sayi];

        int i = 0;
        do {
            System.out.println("Toplamak istediginiz " + (i+1) + ". sayiyi giririniz");
            int num = input.nextInt();
            toplanacaklar[i]=(num);
            i++;

        }while (i<toplanacaklar.length);

        System.out.println(Arrays.toString(toplanacaklar));
        System.out.println(toplama(toplanacaklar));

    }



    public static int toplama(int[] a) {

        int sum = 0;
        for (int w : a ) {
            sum = sum+w;
        }
        return sum;
    }



}




