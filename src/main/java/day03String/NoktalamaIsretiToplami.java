package day03String;

public class NoktalamaIsretiToplami {
    public static void main(String[] args) {

        /*Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

         */
        String s = "Vay be! Ali 13 yaşında ama üniversite'de öğrenci.";

        int toplamKrkSayisi = s.length();

        int noktalamaIsaretleriDisindakilerinSayisi = s.replaceAll("\\p{Punct}", "").length();

        int noktalamaIsaretlerininSayisi = toplamKrkSayisi - noktalamaIsaretleriDisindakilerinSayisi;

        System.out.println(noktalamaIsaretlerininSayisi);
    }
}
