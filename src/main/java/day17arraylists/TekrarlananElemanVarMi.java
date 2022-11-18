package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class TekrarlananElemanVarMi {
    public static void main(String[] args) {



        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(16);
        myList.add(23);

        Integer counter = 0;

        for(Integer w : myList){
            for(Integer k : myList){
                if(w==k){
                    counter++;
                }
            }
        }

        if(counter==myList.size()){
            System.out.println("Tekrarlanan oge yoktur");
        }else{
            System.out.println("En az 1 oge tekrarlanmistir");
        }



    }
}
