package day11forloop;

public class KarakterKacKezVar {
    public static void main(String[] args) {

        String cumle = "eeeee aa bbb aaaa ccccccc ee dddddd.";

        String harf = "e";

        int harfSayisi = 0;

        int cmUz = cumle.length();

        for (int i=0; i<cmUz; i++){

            if(cumle.startsWith(harf, i)){
                harfSayisi++;
            }
        }
        System.out.println(harfSayisi);


    }
}
