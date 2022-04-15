package practice_basic_day03;

public class XxxxxX {
    public static void main(String[] args) {

        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
         */

        String a="aabbcccccddddaaa ";

        birKez(a);






    }

          public static void birKez(String a) {

       String yeniKelime="";
              for (int i = 0; i <a.length() ; i++) {

                  if (!yeniKelime.contains(a.substring(i,i+1))){
                      yeniKelime+=a.charAt(i);

                  }

              }
              System.out.println(yeniKelime);



    }

}
