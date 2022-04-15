package practice_basic_day03;

public class  Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
public static void main(String[] args) {
 birKezYazdir(" aabbcccccddddaaa");






}

    private static void birKezYazdir(String str) {
       String yeniStr="";
        for (int i = 0; i < str.length(); i++) {
            if (!yeniStr.contains(str.substring(i,i+1))){
                yeniStr=yeniStr+str.substring(i,i+1);
            }

        }
        System.out.println(yeniStr);
    }


}
