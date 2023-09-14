package practice06.firin;

public class KepekliEkmek implements Ekmek {

    //asagidaki methodlari override etmeden önce yukardaki class isminde hata veriyordu.ya class
    //ismini abstract yap ya da Ekmek interface indeki methodlari override et diyordu
    //ust class ismini abstract yapsaydik,bize lazim olan methodlari override edemezdik


    @Override
    public void un() {
        System.out.println("Kepekli ekmek %50 un icerir");
    }

    @Override
    public void su() {
        System.out.println("Kepekli ekmek %38 su icerir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmek %1.5 maya icerir");
    }

    @Override
    public void tuz() {
        System.out.println("Kepekli ekmek %1.5 tuz icerir");
    }

    public void kepek(){
        System.out.println("Kepekli ekmek %9 kepek içerir");
    }
    public void sekil(){
        System.out.println("Kepekli ekmek yuvarlaktır");
    }
}
