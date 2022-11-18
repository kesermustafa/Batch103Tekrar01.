package day10ifStatementstringmethods;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {


        String cumle = "Ali okulda okuma yazma ogreniyor.";

        char c = 'a';
        if(cumle.indexOf(c) == cumle.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }






    }

}
