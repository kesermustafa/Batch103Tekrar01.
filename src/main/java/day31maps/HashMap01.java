package day31maps;

import java.text.DecimalFormat;
import java.util.*;

public class HashMap01 {


    public static void main(String[] args) {

        HashMap<String, Integer> studentAge = new HashMap<>();

        studentAge.put("Ali", 13);
        studentAge.put("Tom", 21);
        studentAge.put("Brad", 12);
        studentAge.put("Ajda", 76);
        studentAge.put("Cuneyt", 75);
        studentAge.put("Ali", 88);  // ayni key degerini tekrar kullanilsaniz overwrite yapar
        studentAge.put(null, 55);
        studentAge.put(null, 66);  // null tekrarsiz kullanilir..
        studentAge.put("Ayhan Isik", null);
        studentAge.put("Sadri Alisik", null);

        System.out.println(studentAge); // {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}

        Set<String > keys = studentAge.keySet();
        System.out.println(keys);  // [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        Collection<Integer> values = studentAge.values();
        System.out.println(values); //[66, null, null, 21, 76, 12, 75, 88]


        Integer cuneytAge = studentAge.get("Cuneyt");
        System.out.println(cuneytAge);


        //Excample 1 ; yaslarin ortalamasini hesaplayin;
        int counter = 0;
        double toplam = 0;

        for(Integer w : studentAge.values() ){
                if(w!=null){
                    toplam += w;
                    counter++;
                }
        }

        System.out.println(new DecimalFormat("##.##").format( toplam/counter));

        double a = Double.parseDouble(new DecimalFormat("##.##").format( toplam/counter));

        // Excample 2 : A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz..

        //1.YOL
        System.out.println(studentAge);
        int sum = 0;
        for(Map.Entry<String, Integer> w : studentAge.entrySet()){
            if(w.getKey()!=null && !w.getKey().startsWith("A") ){
                sum+=w.getKey().length();
            }
        }
        System.out.println(sum);


        //2.YOL
        Set<String> key = studentAge.keySet();

        int topla = 0;

        for(String w : key){
            if(w!=null && !w.startsWith("A")){
                topla+=w.length();
            }
        }
        System.out.println(topla);

        System.out.println(studentAge.remove("Ajda", 76));  // remove("Ajda", 76) -- >  true  boolean return eder.
        System.out.println(studentAge.remove("Cuneyt")); // remove("Cuneyt")-->  75 key degeri 75 olni sildim diyor.

        System.out.println(studentAge.getOrDefault("can", 0)); //  key olmadigi icin "0" return eder

        // key yoksa veya value null ise ekleme yapar
        System.out.println(studentAge.putIfAbsent("Cem", 23)); // putIfAbsent("Cem", 23) Yoksa ekle
        System.out.println(studentAge);
        System.out.println(studentAge.putIfAbsent("Sadri Alisik", 85)); //putIfAbsent("Sadri Alisik", null) value nul ise ekler
        System.out.println(studentAge);

        // Excample 3 : her bir entry i farkli satirda yazdirin..

        for(Map.Entry<String, Integer> w : studentAge.entrySet()){

            System.out.println(w);

        }






    }
}
