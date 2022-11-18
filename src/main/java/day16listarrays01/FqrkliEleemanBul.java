package day16listarrays01;

public class FqrkliEleemanBul {
    public static void main(String[] args) {


        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: ‘Mississippi’ ´ Misp

        String str = "Mississippi";
        String yeni = "";

        for(int n =0; n<=str.length()-1; n++){
            if (!yeni.contains(str.substring(n, n+1))){
                yeni+=str.substring(n, n+1);
            }
        }
        System.out.println(yeni);






    }
}
