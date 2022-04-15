package practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05 {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir ama 47 yi gecme");
        int b = scan.nextInt();

fibonacci(b);
    }

    public static void fibonacci(int c) {
        int sayi1 = 0, sayi2 = 1;
        int sayi3;

        if (c < 47) {
            for (int i = 0; i < c; i++) {
                sayi3 = sayi1 + sayi2;
                System.out.println(sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        }else System.out.println("47 yi gecme");


    }


}
