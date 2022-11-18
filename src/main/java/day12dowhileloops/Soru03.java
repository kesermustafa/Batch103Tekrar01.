package day12dowhileloops;

public class Soru03 {
    public static void main(String[] args) {

        // 2 basamakli sayilarin 15 - 20 - 90 a tam bolunenleri
        int i = 1;

        while (i<100){

            if(i%15==0 || i%20==0 || i%90==0 ){
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println();


        int k =1;
        do {
            if(k%15==0 || k%20==0 || k%90==0 ){
                System.out.print(k + ", ");
            }
            k++;
        }while (k<100);
        System.out.println();

        for( int n=1; n<100 ; n++){
            if(n%15==0 || n%20==0 || n%90==0){
                System.out.print(n + ", ");
            }
        }
        System.out.println();

    }
}
