package day13loopsArrays;

import java.util.Scanner;

public class DoWhileLoop02 {
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

        do{
            System.out.println("Islem yapmak istediginiz operatoru seciniz==> +, -, *, /");
            char operator = input.next().charAt(0);

            if (operator=='+' || operator=='-' || operator=='*' || operator == '/' ) {

                System.out.println("islem yapmak istediginin iki say giriniz...");
                double a = input.nextDouble();
                double b = input.nextDouble();

                if (operator == ('+')) {
                    System.out.println(a + b);
                } else if (operator == ('-')) {
                    System.out.println(a - b);
                } else if (operator == ('*')) {
                    System.out.println(a * b);
                } else if (operator == ('/')) {
                    System.out.println(a / b);
                } else {

                }

            } else{
                System.out.println("Gecerli islem seciniz....");
                break;
            }

            }while (true);







    }
}
