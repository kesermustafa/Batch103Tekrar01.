package day11forloop;

import java.util.Scanner;

public class Soru11AXXA {
    public static void main(String[] args) {
        /*
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
        A A A A A A A A
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sutun satir sayisi giriniz...");
        int str = input.nextInt();
        System.out.println("Blok sayisi giriniz...");
        int blk = input.nextInt();

        int k, i;


        for ( i = 1; i <= str; i++) {

            for (k = 1; k <= blk; k++) {

                if (i==1 || i==str) {
                    System.out.print("A ");

                } else if ((k == 1 || k == blk)) {
                    System.out.print("A ");
                }else  {
                    System.out.print("X ");
                }
            }
            System.out.println(); //bitis
            }



    }
}
