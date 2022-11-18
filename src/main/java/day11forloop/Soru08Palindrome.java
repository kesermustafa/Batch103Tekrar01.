package day11forloop;

import java.util.Scanner;

public class Soru08Palindrome {
    public static void main(String[] args) {

        // Soru 3: Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String'in palindrome olup olmadigini kontrol eden bir program yazin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz..");
        String kelime = input.nextLine();
        String kelime1 = "";

        for (int i = kelime.length()-1 ; i >= 0; i--) {
            kelime1 = kelime1 + kelime.charAt(i);
        }
        if (kelime.equalsIgnoreCase(kelime1)) {
            System.out.println("Girdiginiz kelime polindrome'dur.");
        } else {
            System.out.println("Girdiginiz kelime polindrome degildir.");
        }
        System.out.println(kelime1);



        String str = "ey edip adanada pide ye";
        String r = "";

        for(int n = str.length()-1 ; n>=0 ; n--  ){
             String m = str.substring(n,n+1);
            r = m+r;

        }
        if (str.equalsIgnoreCase(r)) {
            System.out.println("Girdiginiz kelime polindrome'dur.");
        } else {
            System.out.println("Girdiginiz kelime polindrome degildir.");
        }

        System.out.println("r = " + r);






    }
}
