package day06ifElse;

import java.util.Scanner;

public class MatematikIslemleri {
    public static void main(String[] args) {

    /*
    Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
    oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz operatoru seciniz... \n+\n-\n*\n/");
        String operator = input.next();

        System.out.println("islem yapmak istediginin iki say giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if(operator.equals("+")){
            System.out.println(a+b);
        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);
        }else {
            System.out.println("Gecerli islem seciniz....");
        }

    }
}
