package day14arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz...
        //            [2, 3, 12, 0,  0,  0]

        int eski[] = {0, 2, 3, 0, 12, 0, 5, -8, 0, 2};
        int yeni[] = new int[eski.length];


        int indx = 0;

        for(int i = 0; i< eski.length; i++){
            if(eski[i] != 0){
                yeni[indx] = eski[i];
                indx++;
            }
        }

        System.out.println(Arrays.toString(yeni));








    }
}
