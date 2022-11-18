package day11forloop;

import java.util.Scanner;

public class BaklavaDilimi {
    public static void main(String[] args) {

/*
                *
               + +
              * * *
             + + + +
            * * * * *
             ! ! ! !
              ! ! !
               ! !
                !
 */
        int satir = 5;
        int sutun = 5;
        int i = 1;
        int k;
        char ch = '*';

        for(i=1 ; i<=satir; i++){

            for(k=satir; k>=i ; k--){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacac ucgenin satir sayisini giriniz.");
        int s = scan.nextInt();

        for ( i=1 ; i<=s ; i++) {

            for ( k=s-1 ; k>=i ; k--) {
                System.out.print(" ");
            }
            for (int m=1 ; m<=i ; m++) {
                if(i%2!=0){
                    System.out.print("* ");
                }else{
                    System.out.print("+ ");
                }
            }

            System.out.println();
        }
        for ( i=1 ; i<s ; i++) {

            for (int n=0 ; n<i ; n++) {
                System.out.print(" ");
            }
            for (int z=1 ; z<=s-i ; z++) {
                System.out.print("? ");
            }
            System.out.println();
        }


    }
}
