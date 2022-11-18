package day15arraysmultidimensionalarrays;

public class Soru01MethodIleToplama {
    public static void main(String[] args) {

        // Method() olusturup multi Dimensional Array in tum elemanlarini toplama
        int[][] x = {{2, 1}, {1, 7, 1}};
        System.out.println(m(x));

    }

    public static int m(int[][] m) {
        int result = 0;

        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                result += m[i][k];
            }
        }
        return result;


    }
}
