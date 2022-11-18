package day15arraysmultidimensionalarrays;

import java.util.Arrays;


public class MultiDimensionalArrays01String {

    public static void main(String[] args) {

        String str[][] = {{"okula", "Ali", "beraber"},{"Veli", "gittiler"},{"bu", "ile"},{".", "gun"} };
        System.out.println(Arrays.deepToString(str));

        int result = 0;

        //str[][] tum elemanlarinini sayisini bulma,
        for(int i=0; i< str.length; i++){
            result += str[i].length;
        }
        System.out.println(result);

        //str[][] tum elemanlarinini sayisini bulma, 2. yoll
        int toplam = 0;
        for (String[] w : str){
            toplam += w.length;
        }
        System.out.println(toplam);


        // Array atama
        String yeniStr[] = new String[result];

        yeniStr[0] = str[0][1];
        yeniStr[1] = str[2][1];
        yeniStr[2] = str[1][0];
        yeniStr[3] = str[2][0];
        yeniStr[4] = str[3][1];
        yeniStr[5] = str[0][0];
        yeniStr[6] = str[0][2];
        yeniStr[7] = str[1][1];
        yeniStr[8] = str[3][0];

        System.out.println(Arrays.toString(yeniStr));

        // 2.YOL....

        System.out.println(str[0][1] + " " + str[2][1] + " " + str[1][0] + " " + str[2][0] + " " + str[3][1] + " " + str[0][0] + " " + str[0][2]+ " " + str[1][1] + str[3][0]);


        // 3.YOL.....
        String sStr = "";

            for (String w : yeniStr){
                sStr = " " + sStr +  w;
            }
        System.out.println(sStr);
















    }


}
