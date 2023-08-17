package practice02;

import java.util.Scanner;

public class C04NestedTernary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen 1. tam sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println("lutfen 2. tam sayiyi giriniz");
        int sayi2=input.nextInt();

        //System.out.println(sayi1 == sayi2 ? "Sayilar birbirine esit" : (sayi1 > sayi2 ? sayi1 : sayi2));

        Object result=sayi1 == sayi2 ? "Sayilar birbirine esit" : (sayi1 > sayi2 ? sayi1 : sayi2);
        System.out.println(result);



    }
}
