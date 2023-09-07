package practice05.inheritance02;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

    //tum arabalar icin ortak olan oz variable olarak tanımlayalım

    String hareket = "Arabalar teker ile hareketeder";

    String hiz = "Arabalar motor gücüne göre hiz yapar";
    String yakit = "Arabalar farkli yakitlar  kullanabilir";
    String marka = "Arabalar üretildikleri markaya sahiptir";

    //tüm arabalar ortak özellikleri method olarak tanimlayalim

    protected void motor() {
        System.out.println("Arabalar farkli  markalarda motor kullanirlar");

    }

    protected void yakitTuketimi() {
        System.out.println("Arabalar motor gucu ve yakıt turune gore yakıt tuketirler");
    }
}
