package day03typecastingwrapperscanner;

public class TypeCasting {

    public static void main(String[] args) {


        //"primitive'ler nasil wrapper'lara cevrilir. Autoboxing (otomatik kutulama)

        float f01 = 13.99F;
        Float wrapperF1 = f01;  // Autoboxing (otomatik kutulama)
        System.out.println(wrapperF1);

        // wrapper'lar nasil primitive'lere cevrilir.  //Unboxing (kutudan cikarma)

        Character w1 = 's';
        char primitiveW1 = w1; //Unboxing (kutudan cikarma)  otomatik yapiliyor

        System.out.println(w1);
        System.out.println(primitiveW1);

        // Note : Autaboxing ve Unboxing Java tarafindan otomatik yapilir.




    }
}
