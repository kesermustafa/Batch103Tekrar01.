package day12whileloops;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari yazdirin ve kac tane olduklarini yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi = input.nextInt();

        int counter = 0;
        int i = 1;

        while (i<sayi+1){

            if(sayi%i==0){
                System.out.print(i + ", ");
                counter ++;
            }
            i++;
        }
        System.out.println();
        System.out.println("counter = " + counter);



    }
}
