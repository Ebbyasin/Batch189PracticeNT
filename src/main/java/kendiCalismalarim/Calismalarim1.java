package kendiCalismalarim;

import java.util.Scanner;

public class Calismalarim1 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String dayName = input.next();
        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


    }
}
