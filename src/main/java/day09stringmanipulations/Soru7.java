package day09stringmanipulations;

public class Soru7 {
    public static void main(String[] args) {

        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
         */

        String pwd = "Az12/*587";

        boolean pwdLength = pwd.replaceAll(" ", "").length()>7;
        boolean pwdSpace= pwd.contains(" ");

        String sonuc = pwdSpace ? "Bosluk karakteri kullanmayiniz" : (pwdLength && !pwdSpace ? "Geçerli Şifre" : "Gecersiz sifre") ;
        System.out.println("Parola = " + sonuc);


        if(!pwdSpace){
            if(pwdLength){
                System.out.println("Sifre : Gecerli sifre");
            }else{
                System.out.println("Sifre : Gecersiz sifre");
            }
        }else{
            System.out.println("!!! Bosluk karakteri kullanmayiniz !!!");
        }








    }
}
