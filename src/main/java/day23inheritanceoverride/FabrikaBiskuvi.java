package day23inheritanceoverride;

public class FabrikaBiskuvi {

    public static double biskuviFiyat = 3.75;

    public static double biskuviGelir;

    public void uretim(int uretilen){
       DepoStok.biskuviStokAdet+=uretilen;
    }

    public void satis(int satis){
        DepoStok.biskuviStokAdet-=satis;
        biskuviGelir=satis*biskuviFiyat;
        Muhasebe.toplamGelir+=biskuviGelir;
    }




}
