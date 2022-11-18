package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {


        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Almanya", 83000000);
        countryPopulations.put("Turkiye", 90000000);

        System.out.println(countryPopulations);

        // Hashtable'larda key ve value null olamaz Exception atar...
//        countryPopulations.put(null, 90000000);
//        countryPopulations.put("Turkiye", null);






    }
}
