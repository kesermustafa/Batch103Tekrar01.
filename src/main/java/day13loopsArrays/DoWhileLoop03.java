package day13loopsArrays;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        int i = 1;
        do{

            if(i%5!=0 && i%3!=0 && i%2!=0){
                System.out.print(i + ", ");
            }

          i++;
        }while (i<101);



    }
}
