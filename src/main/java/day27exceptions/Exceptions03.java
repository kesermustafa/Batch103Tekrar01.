package day27exceptions;

public class Exceptions03 {

    public static void main(String[] args) throws IllegalGrradeException {


        printGrades(100);
        checkNameFormat("ali");

    }

    public static void printGrades(double grade) throws IllegalGrradeException {
        if (grade<0 || grade>100){
            throw new IllegalGrradeException("Gread 0 dan az 100 den cok olamaz");
        }else {
            System.out.println(grade);
        }
    }

    // ilk harf buyuk olmazsa Exception at

    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IlegalNameException("Isimler buyuk harfle baslamali");
        }
    }







}
