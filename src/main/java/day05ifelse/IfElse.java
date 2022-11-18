package day05ifelse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yuvarlamak istediginiz sayiyi giriniz...");
        int i = input.nextInt();


            if (i % 10 >= 5) {
                System.out.println("Son basamağı bir üst ondalığa yuvarla :" + (i / 10 + 1) * 10);
            } else {
                System.out.println("Son basamağı bir alt ondalığa yuvarla :" + (i / 10) * 10);
            }


    }
}
