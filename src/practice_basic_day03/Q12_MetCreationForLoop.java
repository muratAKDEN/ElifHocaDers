package practice_basic_day03;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("metin gir");
        String a=scan.nextLine();

        tersA(a);

    }

    private static void tersA(String a) {


        for (int i = a.length()-1; i > -1 ; i--) {
            System.out.print(a.charAt(i));


        }








    }

}
