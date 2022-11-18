package day14arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {


        String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};

        //sorts string array in alphabetical order or ascending order
        Arrays.sort(countries);

        //prints the sorted string array in ascending order
        System.out.println(Arrays.toString(countries));

        String Aaa[] = {"Ali", "Veli", "Can", "Zeynep","Berna", "Hakan",};

        Arrays.sort(Aaa);

        System.out.println(Arrays.toString(Aaa));





    }

}
