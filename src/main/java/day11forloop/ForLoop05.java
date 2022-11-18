package day11forloop;

public class ForLoop05 {
    public static void main(String[] args) {

       /* Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
        1. Yol:

        */

//        int rows = 4, columns = 8;
//        for(int i=1; i<=rows; i++){
//            String s = "";
//            if(i==1 ){
//                for(int k=1; k<=columns; k++){
//                    s = s + "A ";
//                }
//                System.out.println(s);
//            }else{
//                s = s + "A ";
//                for(int m=2; m<columns; m++){
//                    s = s + "X ";
//                }
//                s = s + "A ";
//                System.out.println(s);
//            }
//        }

        System.out.println("*********");
        /*


        //2. Yol:
        int rows = 4, columns = 8, i = 1;
        while(i<=rows){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
            i++;
        }
        */



        //3. Yol:
        int rows = 4, columns = 8, i = 1;
        do{
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
            i++;
        }while(i<=rows);



    }
}
