package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; i++) {

            // inner loop to print the numbers
            for (int j = 1; j <= rows; j++) {
                if (j % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");

        }
    }
}




