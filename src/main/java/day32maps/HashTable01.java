package day32maps;

import java.util.Hashtable;
import java.util.Map;

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

        Hashtable<Integer, Sutudent> myStudent = new Hashtable<>();


        myStudent.put(1234, new Sutudent("Mustafa KESER", 1234, "keserzade@gmail,com", 95));
        myStudent.put(2365, new Sutudent("Beyza KESER", 2365, "beyzaa@gmail,com", 98));

        System.out.println(myStudent.get(1234).note);

        myStudent.get(1234).setNote(1235);

        System.out.println(myStudent);








    }
}
