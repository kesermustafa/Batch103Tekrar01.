package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {


       double r1 =  divide("Java", "tr");
        System.out.println(r1);

        double r12 =  divide(null, "tr");
        System.out.println(r12);

        double r3 =  divide("Java", "");
        System.out.println(r3);

    }

    // verolen iki stringden karakter saiyarini bolelim


    public static double divide(String s, String t){
        double sonuc = 0;
        try {
            sonuc = s.length()/t.length();
        }catch (NullPointerException e){
            System.out.println("Null kullanmayinnn");
        }catch (ArithmeticException e){
            System.out.println("0'a bolme hatasi");
        }finally {
            System.out.println("databese connection kesildi.");
        }

        return sonuc;
    }



}
