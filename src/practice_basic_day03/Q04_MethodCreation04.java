package practice_basic_day03;

import java.util.Scanner;

public class Q04_MethodCreation04 {
        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */


		/*

		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */

    public static void main(String[] args) {

        String a="1900";

        String b= "2000";

        ab(a,b);







    }






    private static int ab(String a, String b) {

     int   ayeni=Integer.valueOf(a);
     int bYeni=Integer.valueOf(b);
     int c=ayeni+bYeni;
        System.out.println(c);

     return c;
    }
}
