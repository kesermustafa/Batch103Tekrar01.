package day22inheritanceconstructor;

public class Runner {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a);  // 14 Cat clasi icindeki a yi  aldi.
        System.out.println(cat1.b);  // 34 Mammal (Parrent) class icindeki b yi verdi..
        System.out.println(cat1.c);  // 45 Animal (parrent) class daki c yi verdi..

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);  //  13  Data tipi Mmmal olan class daki a yi verir.

        Animal cat3 = new Cat();
        System.out.println(cat3.a);  // 12  Data tipi Animal olan class daki a yi aldi.



        // Inheritance da methodlar secilirken Java Constructor'a bakar.
        // Onceleikle istenilen methodu Constructuri kullanilan class dan alir.
        // o class da bulamazsa parent class a bakar hic bir yerde bulamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat();  //  "Cat eat"  --> Constructor i kullanilan Cat class'indan alir..
        cat4.drink();  // "Mammal drink"  --> Constructor i kullanilan Mammal class'indan alir..

        Mammal cat5 = new Mammal();
        cat5.eat();  // "Mammal eat" --> Constructor i kullanilan Mammal class'indan alir..

        Animal cat6 = new Animal();
        cat6.eat();  // // "Animal eat" --> Constructor i kullanilan Animal class'indan alir..





    }
}
