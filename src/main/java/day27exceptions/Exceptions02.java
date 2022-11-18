package day27exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    public static void main(String[] args) throws IOException {

        readerTheFile();
        System.out.println("\n");

        dosyaOku();

    }

    //Bir txt dosyasini okuyan kodu yaziniz...
        //1.yol
        public static void readerTheFile() throws IOException {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File.txt");
            int k = 0;
                while ((k = fis.read())!=-1){
                    System.out.print((char) k);
                }
        }


        //2.yol
        public static void dosyaOku(){

            try {
                FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File.txt");

                int k = 0;
                while ((k = fis.read())!=-1){
                    System.out.print((char) k);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Adres yanlis veya dosya yok!"+e.getMessage());
            } catch (IOException e){
                System.out.println("Okunamayan karakter icermektedir!!"+e.getMessage());
            }   finally {
                System.out.println("\nDatabase connection disable");
            }

        }





    }




