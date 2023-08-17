package practice01;

public class C03KimlikBilgileri {

    public static void main (String [] args){

         /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */
        String Isim="Elif Betul";
        String Soyisim="Mesekoparan";
        byte Yas=9;
        double Boy=1.33;
        byte Kilo=32;

        System.out.println("Isim = " + Isim);
        System.out.println("Soyisim = " + Soyisim);
        System.out.println("Yas = " + Yas);
        System.out.println("Boy = " + Boy);
        System.out.println("Kilo = " + Kilo);

        System.out.println(); // yazdirirken arada bir bosluk olmasi icin biraktim

        // Ya da ;daha kisa olarak,,\n isareti kullaniriz.\n isaretini gorunce java alt imleci
        // alt satira atar..

        System.out.println("Isim: " + Isim +"\nSoyisim: " + Soyisim +"\nYas: " + Yas +"\nBoy: " + Boy +"\nKilo: " + Kilo);




    }
}
