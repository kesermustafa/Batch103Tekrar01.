package day10ifStatementstringmethods;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // isEmpty() method'u bir String'in bos olup olmadigini kontrol eder. space varsa false doner.
        // Hic karakter yoksa --> true, varsa false
        // length()==0 yazılmaz isEmpty() yazilir.

        System.out.print("Cumle giriniz: ");
        String cumle = input.nextLine(); // cumle icin satirdaki tum bilgiler alinir.
        boolean cumleVarMi = cumle.isEmpty(); //cumle var mi diye kontrol ettim. varsa false doner.

        System.out.print("Kelime giriniz: ");
        String kelime = input.nextLine(); // kelime icin space'e kadar olan data alinir.
        boolean kelimeVarMi = kelime.isEmpty(); //kelime var mi diye kontrol ettim. varsa false doner.

        boolean cumleKelimeVarMi = !(cumleVarMi && kelimeVarMi); // Burasi true dondurur.

        boolean basla;
        int kelimeKacAdet = 0;
        for (int i=0; i<cumle.length(); i++){
            basla = cumle.startsWith(kelime,i);

            if(basla==true){
                kelimeKacAdet++;
            }
        }

        if (cumleKelimeVarMi){
            //-Girilen kelime cumlede kullanilmamis.
            if(cumle.contains(kelime)){ //Girilen kelime cumlede var mi diye kontrol ettim.
                System.out.println("Girilen kelime cumlede kullanilmis...");
                //-Girilen kelime cumlede 1 kere kullanilmis.
                if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
                    //kelime 1 kez kullanildiysa ilk ve son index'i birbirine esit olur.
                    System.out.println("Girilen kelime cumlede 1 kere kullanilmis...");
                } else {
                    System.out.println("Girilen kelime cumlede " + kelimeKacAdet + " kez kullanilmis...");
                }
            }else {
                System.out.println("Girilen kelime cumlede kullanilmamis...");
            }
        }else {
            System.out.println("Cumle yada kelimeden biri hatali!..");
        }







    }
}
