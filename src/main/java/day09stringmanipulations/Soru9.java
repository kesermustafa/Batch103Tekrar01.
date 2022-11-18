package day09stringmanipulations;

public class Soru9 {
    public static void main(String[] args) {

        String str = "plehgnitseterawtfos";
        StringBuffer sb = new StringBuffer(str);

        sb.reverse();
        System.out.println(sb);

    }
}
