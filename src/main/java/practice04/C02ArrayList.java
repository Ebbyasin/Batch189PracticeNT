package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList {

    // Verilen bir array'den tekrar eden elemanları silip
    // tekrarsız elemanlardan olusan bir array haline donusturun
    //  int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {

        //önce yorumlamak lazim.biz tekrarsiz elemanlari coklu ve belirsiz eleman koyacagim bir
        //kap secmeliyim,bu da list olabilir.

        int arr[]={1,2,2,3,4,4,5};
        System.out.println("arr : "+Arrays.toString(arr));
        List<Integer> tekrarsiz=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i]);
            }

        }
        System.out.println(tekrarsiz);

        int[] brr=new int[tekrarsiz.size()];

        for (int i = 0; i < tekrarsiz.size(); i++) {
            brr[i]=tekrarsiz.get(i);

        }
        System.out.println("brr : "+ Arrays.toString(brr));

        arr=brr;

        System.out.println("arr : "+Arrays.toString(arr));


        //*************************************//
        //*************************************//

        //benim yaptigim

        /*
        for (int w:arr) {
            if (!tekrarsiz.contains(w)){
                tekrarsiz.add(w);
            }

        }
        System.out.println(tekrarsiz);


        // buraya kadar tekrarsiz sekilde sayilari aldik.ve list e
        //koyduk.simdi tekrar o tekrarsiz elemanlardan olusan list i ,array e donusturecegiz.neden
        //böyle yaptik,artik yeni array imizin lenght i belli.


        // simdi tekrarsiz list i yeni bir tekrarsiz array e dönusturecegiz.

        int brr[]=new int[tekrarsiz.size()];
        int indx=0;
        for (int each:tekrarsiz) {
            brr[indx]=each;
            indx++;

        }
        System.out.println(Arrays.toString(brr));

         */



    }

}
