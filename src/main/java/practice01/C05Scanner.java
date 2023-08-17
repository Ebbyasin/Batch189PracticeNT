package practice01;

import java.util.Scanner;

public class C05Scanner {

    public static void main(String[] args){

        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        //1.adim; Scanner objesi olusturmak

        Scanner input=new Scanner(System.in);

         //2.adim; kullaniciya mesaj verelim
        System.out.println("lutfen karesini bulmak istediğiniz sayiyi giriniz");
        int sayi=input.nextInt();
        System.out.println(sayi*sayi);



    }
}
