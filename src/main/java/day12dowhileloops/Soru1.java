package day12dowhileloops;

public class Soru1 {
    public static void main(String[] args) {
        
        
        //do-while loopile ondalili bir sayinin ondalik kismindaki sayilarin toplamini yazdirin..
        // sayi = 12.36548  ==  3+6+5+4+8 = 23
     
        double d1 = 12.36548;
        
        String d2 = String.valueOf(d1);
        int d2Indx = d2.indexOf(".");

        String d3 = d2.substring(d2Indx+1);
        System.out.println("d3 = " + d3);

        int sayi = Integer.valueOf(d3);
        int toplam = 0;
        do{
            toplam = toplam+sayi%10;
            sayi = sayi/10;

        }while (sayi>0);
        System.out.println("toplam = " + toplam);
        
        
    }    
}
