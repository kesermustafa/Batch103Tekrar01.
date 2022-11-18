package day12whileloops;

public class Soru {

    public static void main(String[] args) {

        int carpma = 1;

        int sayi = 1036;
        while (sayi>0){

            int s1 = sayi%10;

            if(s1!=0){
                carpma = carpma * s1;
            }

            sayi = sayi/10;
        }
        System.out.println("carpma = " + carpma);











    }
}
