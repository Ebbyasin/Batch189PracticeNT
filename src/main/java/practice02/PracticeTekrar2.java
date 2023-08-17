package practice02;

import java.util.Scanner;

public class PracticeTekrar2 {
    public static void main(String[] args) {

         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde girin " +
                "\nNot:Yalnizca bir ada bir soyad girilmeli");
        String adSoyad=input.nextLine();

        String yeniAdd=adSoyad.split(" ")[0];
        System.out.println("Ad : " +yeniAdd.toUpperCase().charAt(0)+yeniAdd.substring(1).toLowerCase());

        String yeniSoyadd=adSoyad.split(" ")[1];
        System.out.println("Soyad : " +yeniSoyadd.toUpperCase().charAt(0) + yeniSoyadd.substring(1).toLowerCase());


        //2.yol
        int spaceIdx=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,spaceIdx);
        String soyad=adSoyad.substring(spaceIdx+1);

        System.out.println("Ad : " +ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1));
        System.out.println("Soyad : " +soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1));






    }
}
