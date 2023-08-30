package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C01MDA {

    public static void main(String[] args) {
        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int [][]arr=new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("lutfen array icin sayi giriniz");
                int a=scan.nextInt();
                arr[i][j]=a;
                // arr[i][j]=scan.nextInt();


            }


        }
        System.out.println(Arrays.deepToString(arr));
        int sum=0; //burada sum outer loop ile inner loop arasinda da yazilabilir
        int [] brr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];

            }
            brr[i]=sum;
            sum=0;

        }
        System.out.println(Arrays.toString(brr));


    }
}
