package day09stringmanipulations;

public class LastIndexOf {
    public static void main(String[] args) {

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en bastan
        // bu index'e kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf()
        // method'unu sadece bu kutu icindeki String icin kullaniniz.

        String u = "Merhaba dunya";

        int son = u.lastIndexOf("a", 5); //Basdan 5 karakter aldi buradan terse giderek ilk a'nin index'ini verdi...
        System.out.println("son = " + son);// 2


        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);

    }
}
