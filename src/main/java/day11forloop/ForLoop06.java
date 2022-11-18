package day11forloop;

public class ForLoop06 {
    public static void main(String[] args) {

        String str = "Bu gun hava yagmurlu";

        String ters = "";
        for(int i = str.length()-1; i>=0 ; i-- ){
            char ch = str.charAt(i);
            ters = ters + ch;
        }
        System.out.println(ters);






    }
}
