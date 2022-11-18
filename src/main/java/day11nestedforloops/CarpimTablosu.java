package day11nestedforloops;

public class CarpimTablosu {
    public static void main(String[] args) {

        /*
        (1,1)(1,2)(1,3)(1,4)
        (2,1)(2,2)(2,3)(2,4)
        (3,1)(3,2)(3,3)(3,4)
        (4,1)(4,2)(4,3)(4,4)
         */

        for(int i =1; i<5 ; i++){
            for(int k = 1; k<5; k++){
                System.out.print("("+i+","+k+")");
            }
            System.out.println();
        }

       //Carpim tablosu
        for(int i =1; i<11 ; i++){

            for(int k = 1; k<11; k++){
                System.out.println("(" + i + "X" + k + ")" + " = " + (i*k) );
            }
            System.out.println();
        }


    }
}
