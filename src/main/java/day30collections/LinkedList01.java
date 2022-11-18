package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names); //  [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        // peek() methodu ilk elemani alir ama silmez;  ilk elemani return eder, list bos ise null verir.
        String firstEl =  names.peek();
        System.out.println(firstEl); // Chris
        System.out.println(names); // [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        // peek() methodu list bos ise null verir.
        LinkedList<String> myNames = new LinkedList();
        String first =  myNames.peek();
        System.out.println(first);  // null


        // names.poll() ilk karakteri verir ve siler ----  bos ise null return eder ..excaption atmaz...
        String firstElement = names.poll();
        System.out.println(firstElement); // Chris
        System.out.println(names);// [Alexandre, Mark, Tom, Jeremy, Hans]

        // ilk elemani verir silmez -- list bos ise excaption atar.
        String f = names.element();
        System.out.println(f); // Alexandre
        System.out.println(names);  //[Alexandre, Mark, Tom, Jeremy, Hans]

        // peek() ile ayni
        names.peekFirst();


        // Excample 1 : A ile baslayan veya "o" iceren tum isimleri ****** yapin

        LinkedList<String>students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for(String w : students){
            if(w.startsWith("A") || w.contains("o")){
                students.set(students.indexOf(w), "******");
            }
        }
        System.out.println(students); // [Chris, ******, Mark, Tom, Jeremy, Hans]

        // Example 2 : listdeki 4 harfden uzun olanlari silin

        for(int i = 0; i< students.size(); i++){
            if(students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students); // [Mark, Hans]








    }
}
