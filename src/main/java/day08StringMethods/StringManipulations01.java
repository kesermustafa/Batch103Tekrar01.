package day08StringMethods;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Aç koyma hırsız olur, çok söyleme yüzsüz olur, çok değme arsız olur...";
        System.out.println("str = " + str );
        int krk = str.length();
        System.out.println("krk = " + krk);



        String str1 = str.replace(" ", "");
        System.out.println("str1 = " + str1);
        String str2 = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("str2 = " + str2);
        int krk1 = str2.length();
        System.out.println("krk1 = " + krk1);

        String str3 = str2.replaceAll("[aeiouAEIUO]", "");
        System.out.println("str3 = " + str3);
        int ktr2 = str3.length();
        System.out.println("ktr2 = " + ktr2);

        String str4 = str3.replaceAll("l", "*");
        System.out.println("str4 = " + str4);

        String adSoyad = "mustafa keser".toUpperCase();
        String tcNo = "12354661584";

        String adIlk = adSoyad.substring(0,1);
        String adSoyIlk = adSoyad.split(" ")[1].toUpperCase().substring(0,1);
        String noIlk7 = tcNo.substring(0,7).replaceAll("[0-9]", "*");

        System.out.println(adIlk+adSoyIlk+"\n"+ noIlk7+tcNo.substring(7));
        System.out.println(tcNo.substring(0,3)+tcNo.substring(3,8).replaceAll("[0-9]","*")+tcNo.substring(8));
        String ilk3 = tcNo.substring(0,3).replaceAll("[0-9]", "*");
        String orta = tcNo.substring(3,8);
        String son3 = tcNo.substring(8).replaceAll("[0-9]","*");

        System.out.println(ilk3+orta+son3);











    }
}
