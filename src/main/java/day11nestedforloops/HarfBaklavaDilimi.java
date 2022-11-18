package day11nestedforloops;

import java.util.Scanner;

public class HarfBaklavaDilimi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("10'dan kucuk bir sayi girirniz ");
        int n = sc.nextInt();

        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++)
        {
            for (int spc = n - count2; spc > 0; spc--) {
                System.out.print(" ");   //print space
            }

            if (i < n){
                count2++;
            }else {
                count2--;
            }

            for (int j = 0; j < count; j++) {
                System.out.print(c);//print Character
                if (j < count / 2){
                    c++;
                } else{
                    c--;
                }
            }

            if (i < n){
                count = count + 2;
            } else {
                count = count - 2;
            }

            c = 'A';

            System.out.println();
        }


    }
}
