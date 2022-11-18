package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement_Tekrar {

    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = a<10 ? b++ : a++;

        System.out.println(c + " " + b + " " + a);

        int a2 = 10;
        int b2 = 5;
        int c2 = a2==10 ? b2++ : a2++;

        System.out.println(c2 + " " + b2 + " " + a2);


        int a1 = 11;
        int b1 = 5;
        int c1 = a1<10 ? b1++ : a1++;

        System.out.println(c1 + " " + b1 + " " + a1);


    }
}
