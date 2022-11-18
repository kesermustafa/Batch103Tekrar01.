package day05ifelse;

public class String1 {
    public static void main(String[] args) {

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        String s = gomlekFiyat.replaceAll("[$.]","");
        String b = kitapFiyat.replaceAll("[$.]","");
        double x = Double.valueOf(s);
        double y = Double.valueOf(b);
        System.out.println("Toplam Fiyat : " + (x+y)/100);

        String ss = "Java";
        Boolean sonuc = ss.replaceAll("[^v]", "").length()>0;
        System.out.println("karakteri iceriyor mu? " + sonuc);
    }
}
