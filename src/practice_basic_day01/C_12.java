package practice_basic_day01;

import java.util.Scanner;

public class C_12 {
    public static void main(String[] args) {
        	/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("mesleginizi yaziniz");
        String meslek=scan.nextLine().toLowerCase();

        switch (meslek){
            case "qa" :
                System.out.println("quality Analyst");break;
            case "dev" :
                System.out.println("developer");break;

            case "ba" :
                System.out.println("business Analyst");break;

            case "pm" :
                System.out.println("project manager");break;

            default:
                System.out.println("yanlis meslek girdiniz");

        }









    }
}
