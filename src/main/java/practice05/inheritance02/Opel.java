package practice05.inheritance02;

public class Opel extends Araba{

    String hiz="Opel arabalar max 220 km hiz yapar";
    String marka="Opel";
    String sirketMerkezi="Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanirlar");

    }
    protected void garanti() {
        System.out.println("Opel arabalar 2 yil garantilidir");
    }

}
