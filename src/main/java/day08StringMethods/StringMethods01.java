package day08StringMethods;

public class StringMethods01 {
    public static void main(String[] args) {

 /*
         *************     String Class METHODLAR  *******************

        1) equals () : i) iki stringin ayni mi degil mi anlamamiza yarar....
                       ii) equals() methodu "boolean" return eder...
        2) equalsIgnoreCase() : Iki tane stringin ayni olup olmadigini buyuk kucuk harfe dikkat etmeden anlamamizi saglar...
                                ii) equalsIgnoreCase() methodu "boolean" return eder...
        3) toLowerCase() : i) Bir String deki tum harfleri kucuk harfe cevirmek icin kullanilir....
                         ii)  toLowerCase() methodu String return eder....
        4) toUpperCase() : i) Bir String deki tum harfleri Buyuk harfe cevirmek icin kullanilir....
                         ii)  toUpperCase() methodu String return eder....
        5) charAt()     : i) Bir String de belli bir karakteri almak icin kullanilir.
                          ii) charAt() methodu char return eder.
        6) length()     : i) Bir string de kac tane karakter kullanildigni ogrenmek icin kaullanilir.
                          ii) length() methodu int return eder....
        7) contains()   : i) Bir Stringde belli bir karakterin/karakterlerin var olup olmadigini anlamak icin kullanilir..
                          ii) contains() methodu boolean return eder...
        8) split()      : i) Bir Stringi istedigimiz karakterden parcalamaya yarar....
                         ii) split() methodu Array return eder....
        9) substring()  : iki kullanimi vardir.
                         1. substring(baslangic indexi, bitis indexi) Stringin ortasindan bir parca almaya yarar.
                         2. substring(baslangic indexi) Stringin verilen index'tebn sonuna kadar almaya yarar.

            //  String b = tamIsim.split(" ")[1].substring(0,1); // space den sonraki kelimenin ilk harfi

        10) startsWith():   ...ile baslar.
        11) endsWith()  :   .... ile biter.
        12) replace()   :  methodu bir stringdeki herhangi bir karakteri veya karakterleri degistimek icin kullanilir..
                //String st = s.replace("a", "A");
       */

        /*       ********  R E G E X ************
        Bir grup data yi ifade eden kod lara "Regex"denir...
        "Regex" Regular Expressions in kisaltilmasidir...

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum sesli harfler ==> [aeiouAEIOU]
        6) Space ==> [ ]
        7) Tum rakamlar ve tum harfler [0-9a-zA-Z]
        8) Tum noktalama isaretler ==> \\p{Punct}

        1) Rakamlar haric tum karakterler ==> [^0-9]
        2) kucuk harfler haric butun karakterler ==> [^a-z]
        3) Buyuk harfler haric tum karakterler.==> [^A-Z]
        4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
        5) Space haric ==> [^ ]
        6) Tum noktalama isaretleri haric [^\p{Punct}]
          */


    }
}
