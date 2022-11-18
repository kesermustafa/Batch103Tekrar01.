package day16listarrays01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class ListArrayAtama {
    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6};
        List<Integer> list1 = new ArrayList<>();

        for(int w : arr) {
            list1.add(w);
        }


        Integer barr[] = {3, 4, 5, 6};

        List<Integer> list4 = Arrays.asList(barr);

        System.out.println(list4);

    }
}
