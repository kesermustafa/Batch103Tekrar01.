package day05ifelse;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

        //Kullanicidan 3 sayi alin ve buyuk olani console yazdirin...

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayi girirniz....");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }else if(num2>num1 && num2>num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }



    }
}
