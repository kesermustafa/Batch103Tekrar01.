package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class TekrarsizElemanToplama {
    public static void main(String[] args) {

        //Example 1 : Verilen bir List deki elemanlari tekrarsiz elemanlari bulun
        // tekrarsiz olarak ve toplamlarini yaziniz...
        //    [2, 3, 2, 2, 5]  ==> [2, 3, 5]


        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        int sum = 0;

        for(Integer w : a){
            if(!yeni.contains(w)){
                yeni.add(w);
                sum = sum + w;
            }
        }
        System.out.println(yeni);
        System.out.println(sum);






    }
}
