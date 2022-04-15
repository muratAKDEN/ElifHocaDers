package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("sayi gir");
        int a = scan.nextInt();
        System.out.println("sati gir");
        double b = scan.nextDouble();
        System.out.print("/ * - + islem sec :");
        char islem = scan.next().charAt(0);
        hesaplam(islem, a, b);


    }

    private static void hesaplam(char islem, int a, double b) {
        switch (islem) {
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            default:
                System.out.println("yanlis deger");
                break;
        }


    }


}