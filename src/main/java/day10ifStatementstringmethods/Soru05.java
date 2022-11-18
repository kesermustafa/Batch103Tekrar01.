package day10ifStatementstringmethods;

import java.util.Scanner;

public class Soru05 {

    /* Problem :
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
     * kullaniciya musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
	 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Musteri kartiniz var mi?\nVar=E \nYok=H" );
        char kartVarMi = input.next().toUpperCase().charAt(0);

        double urunFiyat = 19.90;

        if (kartVarMi=='E' || kartVarMi =='H'){
            System.out.println("Alacaginiz urun miktarini giriniz...");
            int urunMiktari = input.nextInt();

            if(kartVarMi == 'E'){
                if(urunMiktari>9){
                    System.out.println("%20 indirimli toplam tutar : "+ urunFiyat*0.8*urunMiktari);
                }else if(urunMiktari>0 && urunMiktari<10){
                    System.out.println("%15 indirimli toplam tutar : "+ urunFiyat*0.85*urunMiktari);
                }else
                    System.out.println("Gecerli urun miktri giriniz");
            } else if (kartVarMi == 'H') {
                if(urunMiktari>9){
                    System.out.println("%15 indirimli toplam tutar : "+ urunFiyat*0.85*urunMiktari);
                }else if(urunMiktari>0 && urunMiktari<10){
                    System.out.println("%10 indirimli toplam tutar : "+ urunFiyat*0.9*urunMiktari);
                }else
                    System.out.println("Gecerli urun miktri giriniz");
            }
        }else{
            System.out.println("Kart bilgisi yeniden giriniz...\nVar=E \nYok=H");
        }

    }
}
