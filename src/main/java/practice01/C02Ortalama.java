package practice01;

public class C02Ortalama {

    public static void main (String [] args){

        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */

        //ondalik sayilarda kod yazarken .(nokta) kullanilir..
        // , (virgul) kullanilmaz

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        //ilk once sayilarin toplami bulunup bir konteynira konur
        double toplam=num1+num2+num3+num4+num5;
        // + isareti sayisal ifadeler arasinda kullaniliyorsa matematiksel toplama yapar

        double ortalama=(toplam/5);
        System.out.println("ortalama = " + ortalama);

    }
}
