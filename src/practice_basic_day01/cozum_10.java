package practice_basic_day01;

import java.util.Scanner;

public class cozum_10 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf=scan.next().charAt(0);

        String sonuc=(harf=='y'||harf=='Y'? "yes":  harf=='n'||harf=='N' ? "No"  : "yanlis deger" );
        System.out.println(sonuc);






    }
}
