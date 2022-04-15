package practice_basic_day06;

import java.util.Scanner;

public class Sifree {

    public static void main(String[] args) {
        // kullanicidan sifre iste dogru girene kadar tekrar iste yanlis gireese 3 haktan sonra bloke oldu yazdir,
        String username = "murat";
        String sifre = "asdf123";
        int kalanHak = 3;
        String girilenUser = ""  , girilenSifre = "";


        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("kullanici adi giriniz");
            girilenUser = scan.nextLine();
            System.out.println("sifre giriniz");
            girilenSifre = scan.nextLine();
            if ((girilenSifre.equals(sifre) && girilenUser.equals(username))) {
                System.out.println("hosgeldinix");break;
            } else if (!girilenSifre.equals(sifre) && !girilenUser.equals(username)){
                System.out.println("yanlis giris " + (kalanHak - 1) + " hakkiniz kaldi");
                kalanHak--;
            }
            if (kalanHak==0) {System.out.println("kart bloke oldu");break;

        }


    }
}
}
