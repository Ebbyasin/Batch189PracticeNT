package practice02;

import java.util.Scanner;

public class C03Ternary {

    public static void main(String[] args) {

        /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi=scan.nextInt();

        /*
        Ternary kullanirken muhakkak bir yere atanmasi gerekiyor
        dolayisiyle direk sout icin asagidaki gibi de yazdirabiliriz

           2.yol
           System.out.println(sayi%2==0 ? "Cift Sayi" : sayi+3);

         */

         //1.yol
        Object result=sayi%2==0 ? "Cift Sayi" : sayi+3;
        System.out.println(result);

    }
}
