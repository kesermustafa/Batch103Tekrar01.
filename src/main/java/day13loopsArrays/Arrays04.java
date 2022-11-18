package day13loopsArrays;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Devam eden aylari yazdirmak icin ay numarasini giriniz..");
        int ayNo = input.nextInt();
        String gelecekAylar[] = new String[12];


        switch (ayNo){
            case 1: gelecekAylar[0]= "Ocak";
            case 2: gelecekAylar[1]= "Subat";
            case 3: gelecekAylar[2]= "Mart";
            case 4: gelecekAylar[3]= "Nisan";
            case 5: gelecekAylar[4]= "Mayis";
            case 6: gelecekAylar[5]= "Haziran";
            case 7: gelecekAylar[6]= "Temmuz";
            case 8: gelecekAylar[7]= "Agustos";
            case 9: gelecekAylar[8]= "Eylul";
            case 10: gelecekAylar[9]= "Ekim";
            case 11: gelecekAylar[10]= "Kasim";
            case 12: gelecekAylar[11]= "Aralik";
            break;
            default: break;
        }

        for(String w : gelecekAylar){
            if(w == null){
                continue;
            }
            System.out.println(w);
        }





    }
}
