package practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
   public static void main(String[] args) {

Scanner scan =new Scanner(System.in);
      System.out.println("tam sayi giriniz");
      int a=scan.nextInt();
      int toplm=0;
       for (int i = 1; i <a ; i++) {
           toplm+=i*i;


       }
       System.out.println(toplm);

   }

}
