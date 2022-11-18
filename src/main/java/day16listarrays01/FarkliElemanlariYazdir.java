package day16listarrays01;

import java.util.Arrays;

public class FarkliElemanlariYazdir {
    public static void main(String[] args) {


            //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
            //Örnek: ‘Mississippi’ ´ Misp

            String str = "Mississippi";

            String arr[] = str.split("");
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));


            String str2 = "";

            for(String w : arr){
                if(!str2.contains(w)){
                    str2 = str2+w;
                }
            }
            System.out.print(str2);













    }
}
