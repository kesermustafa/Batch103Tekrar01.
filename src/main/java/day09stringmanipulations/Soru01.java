package day09stringmanipulations;

import javax.swing.*;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini gimesini isteyin:
        @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        @gmail.com ile bitiyorsa "e-mail adresiniz kaydedildi"
        @gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin" yazdirin....
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinini giriniz...");
        String eMail = input.next();

        boolean varMi = eMail.contains("@gmail.com");
        boolean bitis = eMail.endsWith("@gmail.com");


        if(varMi){
            if(bitis){
                System.out.println("e-mail adresiniz kaydedildi");
            }else {
                System.out.println("lutfen yazimi kontrol edin");
            }
        }else{
            System.out.println("Lutfen gmail adresinizi giriniz");
        }




    }
}
