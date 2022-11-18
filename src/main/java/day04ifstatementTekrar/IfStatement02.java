package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        Scanner gunIsmi = new Scanner(System.in);
        System.out.println("Bir harf giriniz...");
        char harf = gunIsmi.next().toUpperCase().charAt(0);

        if(harf == 'P'){
            System.out.println("Pazar, Pazartesi, Persembe");
        }
        if (harf == 'S'){
            System.out.println("Sali");
        }
        if ( harf == 'C'){
            System.out.println("Cuma, Cumartesi");
        }


    }
}
