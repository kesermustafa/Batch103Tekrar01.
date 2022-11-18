package day10ifStatementstringmethods;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        /* Kullanıcıdan şifre girmesini isteyin, eğer şifre aşağıdaki koşullar için uygunsa çıktı alınacaktır
            "Parolanız başarıyla oluşturuldu." Parola aşağıdaki koşullardan herhangi biri için uygun değilse
            Çıktı "Verilen koşullara göre yeni bir şifre girin" olacaktır.
             1.İlk harf büyük olmalıdır
             2.Son harf küçük olmalıdır
             3.Şifre 8 karakter içermelidir.
             4.Bosluk icermememli
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Parolanizi girirniz");
        String parola = input.next();

        boolean ilkHarf = parola.charAt(0) >= 'A' && parola.charAt(0) <= 'Z';
        boolean sonHarf = parola.charAt(parola.length()-1 ) >= 'a' && parola.charAt(parola.length()-1) <= 'z';
        boolean krk = parola.length()>7;
        boolean space = !parola.contains(" ");

        if( ilkHarf && sonHarf && krk && space){
            System.out.println("Parolanız başarıyla oluşturuldu.");
        }else{
            System.out.println("yeni bir şifre giriniz.");
        }

    }
}
