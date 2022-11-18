package day09stringmanipulations;

public class Soru3 {
    public static void main(String[] args) {

        /*
        String icinde verilen asagidaki fifatlari toplayin...
        str1 = $13.99;
        str2 = $10.55;
        Double.parseDouble() methodu kulanin...
        */

        String str1 = "$13.99";
        String str2 = "$10.55";

        String str11 = str1.replace("$", "");
        String str12 = str2.replace("$", "");

        double a = Double.parseDouble(str11);
        double b = Double.parseDouble(str12);

        double toplam = a+b;
        System.out.println("toplam = " + toplam);

        //2.YOL
        double c = Double.parseDouble(str1.replace("$", ""));
        double d = Double.parseDouble(str2.replace("$", ""));

        System.out.println("Toplam: " + (c+d));

        //3.YOL
      double eee=  Double.valueOf(str1.replace("$", "")) + Double.valueOf(str2.replace("$", ""));

        System.out.println(eee);

    }
}
