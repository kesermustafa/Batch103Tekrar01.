package day23inheritanceoverride;

public class Muhasebe {

    public static double toplamGelir;

    public void genelGelirToplam(double biskuviGelir, double cikolataGelir){
        toplamGelir = FabrikaCikolata.cikolataGelir + FabrikaBiskuvi.biskuviGelir;
    }

    public void maasOde(double maasOde){
       toplamGelir -= maasOde;
    }

    public void krediAl(double kredi){
        toplamGelir += kredi;
    }

    public void borcOde(double borc){
        toplamGelir -= borc;
    }



}
