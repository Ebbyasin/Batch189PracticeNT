package practice06;

public class C01Encapsulation {

    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;
    private String soyisim;
    private int yas;

    public C01Encapsulation(String isim, String soyisim, int yas) {

        //setIsim(isim) de yapabilirdik
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim = isim;
        }else {
            System.out.println("Isim buyuk harfle baslamali.");
        }

        this.soyisim = soyisim;

        //setYas(yas) da kullanilabilir
        if(yas<0){
            System.out.println("Yas negatif deger alamaz");
        }else {
            this.yas=yas;
        }

    }




    public C01Encapsulation() { // parametresiz constructor

        /*bunu neden olusturduk:cunku,biz ustte parametreli bir cons.olusturunca
          calisma grubundaki bir baska arkadasimizin default olarak kullandigi parametreyi iptal ettigimiz
          ve isine engel oldugumuz icin ne olur ne olmaz diye bos bir cons olusturursak bu problemin onune
          gecmis oluruz
          .*/
    }


    // 3-)getter-setter


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {

        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim = isim;
        }else {
            System.out.println("Isim buyuk harfle baslamali.");
        }

    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

        //setYas(yas) da kullanilabilir
        if(yas<0)
            System.out.println("Yaş negatif deger alamaz!");
        else{
            this.yas = yas;
        }


    }

    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
