package day05ifelse;

import java.util.Scanner;

public class IfElse02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz opreratoru seciniz....");
        System.out.println("1- Mil'den Km'ye ");
        System.out.println("2- Saniye'den Saat'e ");
        System.out.println("3- Fahrenayt'dan Santigarat'a ");

        int op = input.nextInt();

        if(op==1){
            String operator = "Mil ";
            System.out.println(operator + "\nCevirmek istediginiz degeri giriniz...");
            double mil = input.nextDouble();

            System.out.println(operator + mil+ " = " + mil * 1.60934 + " km'dir");
        }else if(op==2){
            String operator = "Saniye ";
            System.out.println(operator + "\nCevirmek istediginiz degeri giriniz...");
            double saniye = input.nextDouble();

            System.out.println(operator + saniye + " = " + (saniye /60)/60 + " saat'dir") ;
        }else if(op==3){
            String operator = "Fahrenayt ";
            System.out.println(operator + "\nCevirmek istediginiz degeri giriniz...");
            double fahrenayt = input.nextDouble();

            System.out.println(operator + fahrenayt + "°F" + " = " + (fahrenayt -32)*5/9 + " °C");
        }else{
            System.out.println("Gecerli parametre giriniz....");
        }


    }
}
