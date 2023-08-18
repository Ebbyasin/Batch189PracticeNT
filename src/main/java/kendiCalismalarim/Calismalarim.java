package kendiCalismalarim;

import java.util.Scanner;

public class Calismalarim {
    public static void main (String [] args){

       Scanner input=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz..");
        String gender=input.next();
       System.out.println("Lutfen yas giriniz..");
       byte age=input.nextByte();



       if (age<0 || age>120){
           System.out.println("Lutfen 0 ile 120 arasi bir deger girin");
       }else if (gender.equalsIgnoreCase("kadin")){
           if (age>60){
               System.out.println("emekli olabilirsin");
           }else {
               System.out.println("calismalisin..");
           }
       }else if (gender.equalsIgnoreCase("erkek")){
           if (age>65){
               System.out.println("emekli olabilirsin");
           }else {
               System.out.println("kesinlikle calismali");
           }
       }else {
           System.out.println("tanimli degil");
       }

    }
}
