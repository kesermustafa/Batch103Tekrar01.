package day12dowhileloops;

public class Soru04 {
    public static void main(String[] args) {

        //9 dan 190 a kadar 7'nn katlari olan sayilar....

        int i = 9;
        do {
            if(i%7==0){
                System.out.print(i + ", ");
            }
            i++;
        }while (i<190);
        System.out.println();

        // 'm' harfinden 'c'harfine kadar olan tum harfleri yazdirin..
        char ch = 'm';

        do {
            System.out.print(ch + ", ");
            ch--;
        }while (ch>'b');
        System.out.println();

    }
}
