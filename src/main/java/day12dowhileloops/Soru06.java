package day12dowhileloops;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {

//        String pwd = "B78c? K!m";
//        // 1) space haric en az 8 karakter olmali
//        boolean first = pwd.replace(" ", "").length()>7;
//
//        // 2) en az 1 sembol icermeli ..
//        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;
//
//        // 3) en az 1 rakam icermeli
//        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;
//
//        // 4) en az 1 buyuk harf icermeli
//        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;
//
//        // 5) en az 1 kucuk harf icermeli
//        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;
//
//        boolean pwdGecerli = first && second && third && fourth && fifth;
//
//        if ( pwdGecerli){
//            System.out.println("Pasword gecerli");
//        }else{
//            System.out.println("Pasword gecerli degil");
//        }


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen paralanizi en 8 karakter, buyuk / kucuk harf ve sembol icercek sekilde girin");


        do {
            String prl = input.next();
            boolean bosHaric = prl.replace(" ", "").length()>7;
            boolean kHarafVarMi = prl.replaceAll("[^a-z]", "").length()>0;
            boolean bHarfVarMi = prl.replaceAll("[^A-Z]", "").length()>0;
            boolean ozKrkVarMi = prl.replaceAll("[^a-zA-Z0-9 ]", "").length()>0;

            boolean gecerli = bosHaric && kHarafVarMi && bHarfVarMi && ozKrkVarMi;

            if(!gecerli){
                System.out.println("Lutfen istenilen kriterlerde parola olusturun");
            }else{
                System.out.println("Gecerli parola olusturdunuz..");
                break;
            }

        }while (true);









    }
}
