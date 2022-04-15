package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

       String a="";

     do {
         System.out.println("kelime gir");
         a=scan.nextLine();
         if (a.length()>=3 && a.length()%2==1){
             System.out.println(a.charAt(a.length()/2));
         }else System.out.println("yanlis kelime");

     }while (!(a.length()>=3 && a.length()%2==1));{

        }





    }
}
