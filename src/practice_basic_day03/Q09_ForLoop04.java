package practice_basic_day03;

import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        String a = scan.next();
        String b="a,e,i,o,u";

if (a.length()>1 || Character.isDigit(a.length())){
            System.out.println("sadece harf lutfen");

        }else {

        for (int i = 0; i <b.length() ; i++) {
            if (a.toLowerCase().contains(b.substring(i,i+1))){
                System.out.println("sesli harf ");
                break;

            }else System.out.println("sessiz harf");break;

        }
}


    }

}
