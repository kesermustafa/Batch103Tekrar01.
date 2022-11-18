package day04ifstatementTekrar;

import java.util.Scanner;

public class Aaaa {
    // Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının toplamını


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();



    if (sayi/1==sayi ){    // Harf girilmesinnnnnnn ama olmuyorrrrrrrrrr

        if(sayi>0){
            System.out.println("Pozitif Sayi");
        } else if(sayi<0){
            System.out.println("Negatif Sayi");
        } else {
            System.out.println("Notr");
        }
    } else
        System.out.println("Gecerli bir sayi giriniz");

}

}


