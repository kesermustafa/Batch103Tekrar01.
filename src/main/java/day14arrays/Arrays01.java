package day14arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        // Example 3 ; Kullanici ile beraber bir array ousturunuz... ve icine data ekleyiniz...
        // Bir ogretmenin sinifdaki ogrencierin isimlerini application a yukleyen kodu yaziniz..

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz..");
        int arry = input.nextInt();

        String ogrName[] = new String[arry];
        //System.out.println(Arrays.toString(ogrName));

        System.out.println("Programdan Cikmak icin X'e basiniz..");

        for(int i =1; i<=arry; i++){
            System.out.println("Isim giriniz ");
            String name = input.next();

            if(name.equalsIgnoreCase("X")){
                break;
            }

            ogrName[i-1] = name;

            }
        System.out.println(Arrays.toString(ogrName));





    }

}
