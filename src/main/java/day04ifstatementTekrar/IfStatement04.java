package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Karakter giriniz...");
        char ch = input.next().charAt(0);

        if(!(ch>='a'&& ch<='z') && !(ch>='A'&& ch<='Z')){
            System.out.println("Harf degil");
        }
    }
}
