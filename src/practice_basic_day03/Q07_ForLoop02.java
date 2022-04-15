package practice_basic_day03;

public class Q07_ForLoop02 {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
        for (int i = 0; i <255 ; i++) {
            System.out.print(i);


        }
        System.out.println();
        for (char i = 'A'; i <255 ; i++) {
            System.out.print(i);
        }

    }
}
