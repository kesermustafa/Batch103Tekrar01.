package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz...");
        byte age = input.nextByte();


        if(age<65){
            System.out.println("Emekli olamazsin, calisman gerekli...");
        }
        if(age>=65){
            System.out.println("Emekli olabilirsiniz...");
        }

    }
}
