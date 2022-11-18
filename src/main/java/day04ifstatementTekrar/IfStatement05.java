package day04ifstatementTekrar;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenar uazunluklrini giriniz..");
        double k1 = input.nextDouble();
        double k2 = input.nextDouble();
        double k3 = input.nextDouble();

        if(k1==k2 && k2==k3 && k1==k3 ){
            System.out.println("Eskenar ucgen");
        }

        if(!(k1==k2 && k2==k3 && k1==k3)){
            System.out.println("Eskenar degil");
        }



    }
}
