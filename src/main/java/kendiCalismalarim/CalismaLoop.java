package kendiCalismalarim;

public class CalismaLoop {

    public static void main(String[] args){

         //Bir tamsayinin rakamlarinin toplamini veren kod yaziniz
        //578 ==>5+7+8=20

        int sy=578;
        int rakamTplm=0;

        for (int i=sy; i>0; i=i/10){

            rakamTplm=rakamTplm+i%10;

        }
        System.out.println(rakamTplm);
    }
}
