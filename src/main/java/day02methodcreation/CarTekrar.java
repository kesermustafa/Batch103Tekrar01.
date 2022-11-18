package day02methodcreation;

public class CarTekrar {

      /*
               Note: Class ==> Variable ==> Object ==> Kullanacagiz
                               Method
      */

    public int fiyat = 25000;
    public int km = 5000;
    public int modelYili = 2020;
    String marka = "BMW";
    String renk = "Beyaz";
    String renk1 = "Siyah";
    String renk2 = "fume";

    public static void main(String[] args) {

        CarTekrar car = new CarTekrar();

        System.out.println(car.km);
        System.out.println(car.fiyat);
        System.out.println(car.marka);
        car.vites();
        car.hareket();
    }

    public void hareket() {
        System.out.println("6 silindili guclu motor...");
    }

    public void fren() {
        System.out.println("ABS fren sistemi...");
    }

    public void vites() {
        System.out.println("7 ileri otokatik");
    }

    public void vites1() {
        System.out.println("manuel");
    }

}
