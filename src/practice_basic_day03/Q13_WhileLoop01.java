package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scan.nextInt();

        int rakamlarToplam = 0;

        while (sayi > 0) {
            rakamlarToplam +=sayi%10;

            sayi /= 10;
        }


        System.out.println(rakamlarToplam);


    }


}