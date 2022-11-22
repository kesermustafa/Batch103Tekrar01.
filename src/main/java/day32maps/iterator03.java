package day32maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class iterator03 {


    public static void main(String[] args) {
        List<String> secim = new ArrayList<>();
        secim.add("çukolatalı");
        secim.add("çilekli");
        secim.add("vanilyalı");

        whileLoop(secim);
        forLoop(secim);

}


    private static void whileLoop(Collection<String> dondurma) {
        Iterator<String> secimIter = dondurma.iterator();
        while (secimIter.hasNext()) {
            System.out.println(secimIter.next());
        }
    }

    /*
     * for-döngüsü tamsayı indeks kullanmıyor
     */


    private static void forLoop(Collection<String> dondurma) {
        for (Iterator<String> secimIter = dondurma.iterator();
            secimIter.hasNext();) {
            System.out.println(secimIter.next());
        }
    }
}
