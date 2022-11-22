package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iterator02 {
    public static void main(String[] args) {


        // bir ArrayList olustur

        ArrayList list = new ArrayList();
        // arrayliste öğeler ekle
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        // ArrayList yazdır
        System.out.print("Orijinal Listenin öğeleri : ");


        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();


        // Guncellenen listeyi tarıyor
        ListIterator litr = list.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "?");
        }
        System.out.print("Guncellenen Listi eleman : ");


        itr = list.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();


        // ArrayListi ters sırada yaz
        System.out.print("Guncellenen Listi ters yaz : ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();





    }
}
