package day11nestedforloops;

import java.util.Scanner;

public class HarfUcgen {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi girirniz ");
        int satir = sc.nextInt();

        int count2 = 0;

        char ch = 'A';

        for(int i=0; i<satir; i++) {

            for (int k = satir; k > i; k--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print((char)(ch + k));

            }
            for (int m = i - 1; m >= 0; m--)
            {
                System.out.print((char)(ch + m));

            }
            System.out.println();
        }


    }
}
