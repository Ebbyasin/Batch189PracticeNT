package practice05.inheritance02;

public class Corsa extends Opel {
    String hiz = "Corsa max 200 km hiz yapar";
    String yakit = "Corsa arabalar benzinli veya elektriklidir";
    String model = "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketir");
    }

    protected void vitesSayisi() {
        System.out.println("Corsa arabalar 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa araba1 = new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);
        System.out.println("araba1.hiz = " + araba1.hiz);
        System.out.println("araba1.yakit = " + araba1.yakit);
        System.out.println("araba1.marka = " + araba1.marka);
        System.out.println("araba1.sirketMerkezi = " + araba1.sirketMerkezi);
        System.out.println("araba1.model = " + araba1.model);

        araba1.motor();

        Opel arb2 = new Corsa();// Bir Opel objesi olusturduk

        System.out.println("arb2.hareket = " + arb2.hareket);
        System.out.println("arb2.hiz = " + arb2.hiz);
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.marka = " + arb2.marka);
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);
        arb2.motor();

        /*
        inheritanceda variablelar;
        aramaya data turu ne ise oradan baslanır,
        yoksa parenta bakılır ve
        ilk buldugu yerden getirilir

        inheritanceda methodlar;
        aramaya data turu ne ise oradan baslanır,
        yoksa parenta bakılır,
        ilk buldugunu GETIRMEZ,
        constructorun oldugu classa kadar override edilmiş mi diye kontrol edilir
        son buldugunu getirilir
         */

        //arama her zaman asagıdan yukarı dogrudur
        //override kontrol her zaman yukarıdan asagı dogrudur

        arb2.garanti(); //Opel Classindan
        arb2.yakitTuketimi();//Corsa Classindan
        //arb2.vitesSayisi(); CTE
        //arb2.model CTE

        Araba arb3 = new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket); //Araba
        System.out.println("arb3.hiz = " + arb3.hiz); //Araba
        System.out.println("arb3.yakit = " + arb3.yakit); //Araba
        System.out.println("arb3.marka = " + arb3.marka);

        //arb3.sirketMerkezi CTE
        arb3.yakitTuketimi(); //Corsa
        arb3.motor();// Corsa
        //arb3.garanti() CTE

        Araba arb4 = new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz);//araba
        System.out.println("arb4.yakit = " + arb4.yakit);//araba
        System.out.println("arb4.marka = " + arb4.marka);//araba
        arb4.yakitTuketimi();//araba
        arb4.motor();//opel
        //arb4.garanti(); CTE

    }

}
