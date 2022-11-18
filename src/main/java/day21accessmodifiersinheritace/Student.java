package day21accessmodifiersinheritace;

public class Student {

        /*
        1- Access modifier i default olanlarin access modifieri yazilmaz..

         Note: Access Modifier'lari genisden dara dogru sayiniz
              public > protected > default > private

        Note: Access Modifier'lari birer birer aciklayiniz
              public olanlar her class'dan kullanilabilir
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar
              private olanlar sadece olsturulduklari Class icinde kullanilabilirler

        Note: "protected" ile "default" un farkini soyleyiniz.
               protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
               default olanlar baska package'den kullanilamazlar
                "Default" ile "package privite"  es anlamlidir.

        Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
              public, default kullanilir ama protected ve private kullanilamaz


         */
    public String stdName = "Tom Hanks";

    //Protecdet olanlar baska package lardan kullaniamaz anckbaska package de "child class"icinden kulanilabilir.
    protected String adrress = "Miami";
    String email = "tomh@gmail.com";
    private String sdtId = "20206517004";








}
