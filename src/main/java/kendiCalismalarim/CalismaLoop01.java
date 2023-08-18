package kendiCalismalarim;

public class CalismaLoop01 {

    public static void main(String[] args) {
        //Bir string deki tekrarsiz karakterleri veren kodu yaziniz?
        // mehmet =ht;

        String t="mehmet";
        String unique="";


        for (int i=0; i<t.length(); i++){
            char ch=t.charAt(i);

            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                unique=unique+ch;
            }else {
                continue;
            }
        }
       System.out.println(unique);
    }
}
