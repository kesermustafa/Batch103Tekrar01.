package day22inheritanceconstructor;

public class HondaAccord extends Honda {

     /*     1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir, cunku
              Java, Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
              constructor'in sart oldugunu bilir.
            2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.
            3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
            4)Bir Class'da birden fazla constructor olabilir. Fakat bu constructor'larin parametre'leri farkli olmalidir.
            5) "this"keyword bu class anlamindadir. "this.price"demek bu class daki price isimli variable demektir.
                "this.price" syntex'i constructor icinde kullanilir.
            6- Constructor kullanarak variable lar uzerinde yaptiginiz degisiklikler sadece Object uzerindeki
                variable larin degerini degistir. Class daki variable degerlerini degistiremez.
      */

    public int price;
    public int year;
    String make;
    String model;

    public HondaAccord(){

    }
    public HondaAccord(int price){
        this.price=price;
    }
    public HondaAccord(int price, int year){

        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;
    }



}