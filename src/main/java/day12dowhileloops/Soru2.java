package day12dowhileloops;

public class Soru2 {
    public static void main(String[] args) {

        // sayinin rakamlar toplamini yazdirin.


        int sayi = 236489;
        int toplam = 0;

        do{
            toplam = toplam + sayi%10;
            sayi = sayi/10;

        }while (sayi>0);
        System.out.println("toplam = " + toplam);


        //sayinin rakamlari carpimini yazdirin....

        int sayi1 = 1045;
        int carpma = 1;
        do{
            int s1 = sayi1%10;
            if(s1!=0){
                carpma = carpma * s1;
            }
            sayi1 = sayi1/10;

        }while (sayi1>1);
        System.out.println("carpma = " + carpma);


    }
}
