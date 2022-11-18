package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Ilk_Son_Orta_ElemanAlma {
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>();

        num.add(23);
        num.add(32);
        num.add(14);
        num.add(65);
        num.add(84);
        num.add(9);
        num.add(75);


        System.out.println(num);  // [23, 32, 14, 65, 84, 9, 75]

        int ilk = num.get(0);
        int son = num.get(num.size()-1);

        System.out.println(ilk + " " + son);

        //Orta Eleman Alma
        if(num.size()%2!=0){

            System.out.println(num.get(num.size()/2));

        }






    }
}
