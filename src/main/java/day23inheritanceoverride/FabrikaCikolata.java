package day23inheritanceoverride;

public class FabrikaCikolata {


    public static double cikolataFiyat = 7.99;

    public static double cikolataGelir;


    public void uretim(int uretilen){
        DepoStok.CikolataStokAdet+=uretilen;
    }

    public void satis(int satis){
        cikolataGelir = cikolataFiyat*satis;
        DepoStok.CikolataStokAdet-=satis;
        Muhasebe.toplamGelir+=cikolataGelir;
    }




}
