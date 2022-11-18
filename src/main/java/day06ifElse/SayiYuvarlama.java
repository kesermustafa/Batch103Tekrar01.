package day06ifElse;

import java.util.Scanner;

public class SayiYuvarlama {
    public static void main(String[] args) {

       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        ("Son basamağı bir üst ondalığa yuvarla :”+ (i/10+1)*10));
        ("Son basamağı bir alt ondalığa yuvarla :”+ (i/10)*10);
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Tam sayi giriniz....");
        int i = input.nextInt();

        if(i%10>=5){
            System.out.println("Ust ondaliga yuvarlama : " + (i/10+1) * 10);
        }else{
            System.out.println("Alt ondaliga yuvarlrma : " + (i/10) * 10);
        }


    }
}
