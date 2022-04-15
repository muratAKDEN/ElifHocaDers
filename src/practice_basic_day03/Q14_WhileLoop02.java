package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi gir");
        int a=scan.nextInt();

        while (0<=a){
            if (a%2==1){
                System.out.print(a +" ");

            }
            a--;


        }


    }

}
