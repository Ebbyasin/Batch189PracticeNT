package practice01;

public class C01Variables { // class basi

    public static void main (String[] args){// main method basi
        //(int) bir variable(yas)  olustur ve yazdır
        //(int) bir variable(sayi)  olustur ve yazdır
        //konsola sayi = 50 seklinde yazdır
        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        //String bir variable olusturalım (isim)
        //isim variable ını etiketıyle yazdır
        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        //onunIsmi variable'ını etiketiyle yazdır
        //isim variable'ının degerini guncelle
        //isim ve onunIsmi variable'larını yazdır


        //(int) bir variable(yas)  olustur ve yazdır
        //syntax :
        //data turu + variable ismi + atama operatoru + variable deger + ;
        int           yas                  =                35           ;
        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi =50;
        System.out.println(sayi);

        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = " +sayi);

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim=41;
        benimYasim=yas;
        System.out.println(benimYasim);
        System.out.println("benimYasim = " + benimYasim);

        /*soutv ne ise yarar;tek bir variable in etiketiyle yazdirilmasi,oda nasil olur
        once variable tanimlanir,sonra variable isminden sonra nokta konulur,cikan seceneklerden
        "soutv" secilir. ornek:  yas.soutv  ,,,sonra enter a basilir
        */

        //String bir variable olusturalım (isim)
        String isim="Elif Betul";

        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi="Birgul";
        onunIsmi=isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
        isim="yasin";

        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);


    }// main method sonu

}// class sonu
