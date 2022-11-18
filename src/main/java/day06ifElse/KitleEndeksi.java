package day06ifElse;

import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args) {

        /*
        Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
            Geçersiz BMI değeri < 0
            Zayıf   =   <18.5
            Normal ağırlık = 18.5–24.9
            Fazla kilolu = 25–29.9
            Obezite = 30 veya daha büyük BMI
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Vücut Kitle İndeksi (BMI) giriniz...");
        double bmi = input.nextDouble();

        if(bmi<0){
            System.out.println("Gecersiz BMI degeri");
        }else if(bmi<18.6){
            System.out.println("Zayif...");
        }else if(bmi<25){
            System.out.println("Normal agirlik...");
        }else if(bmi<30){
            System.out.println("Fazla kilolu...");
        }else if(bmi>=30){
            System.out.println("Obezite...");
        }else {
            System.out.println("Endex tanimlanmamis....");
        }




    }
}
