package day12dowhileloops;

import java.util.Scanner;

public class soru07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Toplamak istediginiz sayilari girin");


        int toplam = 0;
        int sayac = 0;

        do {

            int sayi = input.nextInt();


        if(sayi<500){
            toplam = toplam + sayi;
            sayac ++;
        }
        if(toplam>500){
            break;
        }

        }while (true);

        System.out.println("Toplam : " + toplam);
        System.out.println("sayac = " + sayac);





    }

}
