package day12whileloops;

public class Soru03 {
    public static void main(String[] args) {

      //  1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

        int i=1;
        while (i<101){

            if(i%6!=0){
                System.out.print(i +  " ");
            }

            i++;
        }



    }
}
