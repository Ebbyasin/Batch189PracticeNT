package practice03;

import java.util.Scanner;

public class C02ForLoop {

    public static void main(String[] args) {

         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("lutfen bir sayi giriniz");
            int sayi = input.nextInt();
            if (sayi % 10 == 7 || sayi % 10 == 9) {//sart dogru ise bu elemanlari pass gecmek istiyorum
                continue; // loop u bir kereligine kiriyor,bunu kaldirip else yazsak yine olur

            }
            toplam += sayi;//toplam=toplam+sayi;


        }
        System.out.println("toplam = " + toplam);

    }
}
