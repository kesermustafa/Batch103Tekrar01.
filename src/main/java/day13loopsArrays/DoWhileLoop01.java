package day13loopsArrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int k = 1;
        do {
            System.out.println("Do-While Loop");
            k++;
        }while(k<3);


        Scanner scan = new Scanner(System.in);

        int s = 0;

        do {
            System.out.println("Bir sayi giriniz");
            s = scan.nextInt();

                if(s>0){
                    System.out.println("Pozitif");
                }else if(s==0){
                    System.out.println("Notr");
                }else {
                    System.out.println("Negatif");
                }

        }while(s<100);
        System.out.println("Kaybettin!");






    }
}
