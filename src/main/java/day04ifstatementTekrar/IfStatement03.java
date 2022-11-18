package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kenar uzunluklarini giriniz..");


        double k1 = input.nextDouble();
        double k2 = input.nextDouble();
        double k3 = input.nextDouble();
        double k4 = input.nextDouble();


        if(k1==k2 && k2==k3 && k3==k4 && k1==k4 ){
            System.out.println("kare");
        }





    }
}
