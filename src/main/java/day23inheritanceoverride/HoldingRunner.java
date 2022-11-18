package day23inheritanceoverride;

public class HoldingRunner {

    public static void main(String[] args) {

        FabrikaCikolata cikolata = new FabrikaCikolata();
        cikolata.uretim(1500);
        cikolata.uretim(3600);
        cikolata.uretim(5200);

        System.out.println("Cikolata Uretim Miktari  : " + DepoStok.CikolataStokAdet);

        cikolata.satis(1058);
        cikolata.satis(2581);
        cikolata.satis(5581);

        FabrikaBiskuvi biskuvi = new FabrikaBiskuvi();
        biskuvi.uretim(2362);
        biskuvi.uretim(8990);
        biskuvi.uretim(7608);
        System.out.println("Biskuvi Uretim Miktari : " + DepoStok.biskuviStokAdet);

        biskuvi.satis(1069);
        biskuvi.satis(3689);
        biskuvi.satis(13689);

        System.out.println("*-----------------------*");
        System.out.println("Cikolata Stok Adet : " + DepoStok.CikolataStokAdet);
        System.out.println("Biskuvi Stok Adet : " + DepoStok.biskuviStokAdet);
        System.out.println("*-----------------------*");

         // ODEMELER //

        Muhasebe odemeler = new Muhasebe();
        odemeler.maasOde(2000);
        odemeler.maasOde(1000);
        odemeler.borcOde(2500);

        

        odemeler.krediAl(25000);

        System.out.println("Biskuvi Gelir : "+ FabrikaBiskuvi.biskuviGelir);
        System.out.println("Cikolata Gelir : "+FabrikaCikolata.cikolataGelir);
        System.out.println("Toplam Gelir : " + Muhasebe.toplamGelir);




    }

}
