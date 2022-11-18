package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTekrar {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(2);
        num.add(3);
        num.add(8);
        num.add(11);
        num.add(15);
        num.add(17);

        System.out.println(num);


        int i =0;
        while (i<num.size()){

            if(num.get(i)==8){
                break;
            }
            num.set(i, (num.get(i))*2);
            i++;
        }
        System.out.println(num);


        for ( i = 0; i < num.size(); i++) {

            if(num.get(i)==8){
                break;
            }
            num.set(i, num.get(i)*2);
        }
        System.out.println(num);

        i=0;
        do {

            if(num.get(i)==8){
                break;
            }
            num.set(i, num.get(i)*2);

            i++;
        }while (i< num.size());
        System.out.println(num);


        for (Integer w: num) {

            num.set(num.indexOf(w), w*2);
            if(w==8){
                break;
            }

        }
        System.out.println(num);


    }
}
