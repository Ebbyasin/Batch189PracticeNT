package practice05;

import java.util.Scanner;

public class Fibonacci {
     /*
        Kulanıcıdan alınan bir tam sayı kadar eleman iceren(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun(bunu bir method olusturarak yaziniz)
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Lutfen 47 den küçük bir tamsayi giriniz");
        int sayi=scan.nextInt();
        fibonacci(sayi);
    }

    public static void fibonacci(int sayi) {
        int num1=0;
        int num2=1;
        int num3; // buna deger atamadik,çünkü ilk iki sayinin  toplami 3.sayiyi veriyor

        if (sayi<47 && sayi>-1) {
            for (int i = 0; i < sayi; i++) {
                System.out.printf(num1 + " ");
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }else System.out.println("Lutfen gecerli bir sayi giriniz");
    }

}
