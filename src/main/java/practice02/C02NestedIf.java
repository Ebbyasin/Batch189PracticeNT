package practice02;

import java.util.Scanner;
import java.util.SortedMap;

public class C02NestedIf {

    public static void main (String [] args){

        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=input.nextInt();

        if (sayi<0){
            System.out.println("Negatif sayi");
        }else {
            if (sayi<10){
                System.out.println("Rakam");
            }else {
                System.out.println("Pozitif sayi");
            }
        }





    }
}
