package practice_basic_day01;

import java.util.Scanner;

public class Cozum13 {
    public static void main(String[] args) {

        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("fiyat giriniz");
        int fiyat=scan.nextInt();


        String sonuc=fiyat<10? "ucuz": fiyat>=10&&fiyat<20? "normal":"pahali" ;
        System.out.println("sonuc = " + sonuc);



    }
}
