package day08StringMethods;

public class IlkSonKarakterAlma {
    public static void main(String[] args) {


        //1.YOL...
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length()-1);

        //2.YOL

//        String ilk = isim.substring(0, 1);
//        String son = isim.substring(isim.length()-1);

        //3.YOL   --- BEN YAZDIMMMM
//        char ilkH = isim.charAt(0);
//        String sonH = isim.substring(isim.length()-1);

        boolean bb = !(4<5);
        System.out.println(bb);

        String str = "seyhan yesim yavuz";
       // Yukarıdaki Stringde "s" ve "y" harflerini büyük harf yapmak için hangileri doğrudur?
        System.out.println(str.replace("s", "S"));
        System.out.println(str.replace("y", "Y"));
        System.out.println("***");
        System.out.println(str.replaceAll("s", "S"));
        System.out.println(str.replaceAll("y", "Y"));
        System.out.println("***");
        System.out.println(str.replace('s', 'S'));
        System.out.println(str.replace('y', 'Y'));
        System.out.println("***");

        String str1 = "Ayhan BEYHAN";
        System.out.println(str1.replace(str1.substring(0), "AYHAN beyhan"));
        System.out.println(str1.replace("Ayhan BEYHAN", "AYHAN beyhan" ));
        System.out.println(str1.replace("","."));











    }










}
