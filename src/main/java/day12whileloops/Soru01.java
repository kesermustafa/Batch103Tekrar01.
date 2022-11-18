package day12whileloops;

public class Soru01 {
    public static void main(String[] args) {

        int sayi = 3698;
        int carp = 1;
        while (sayi>0){

            int s1 = sayi%10;  // while ile crmada %10 islemini toplamada ki gibi degil bu sekilde yapinca calisti...
            if(sayi!=0) {       // carpma isleminde 0 yutan eleman oldugu icin (sayi !=0 ) 0 esit olmamasi durumrunda islem yaplsin
                carp = carp * s1;
            }
            sayi = sayi/10;
        }
        System.out.println("carp = " + carp);


        int num = 3698;
        int toplam = 0;

        while (num>0){
            toplam = toplam + num%10;

            num = num/10;
        }
        System.out.println("toplam = " + toplam);


        //while ile cikarma islaminde sonuc konteynirina 1 atadim, en son sonuc-1 yaparak sonuca ulastim.
        int num1 = 385;
        num1 = Math.abs(num1);
        int sonuc = 1;

        for(int i = num1 ; i>0 ; i=i/10 ){
            sonuc = sonuc - i%10;
        }
        System.out.println(sonuc-1);


    }
}
